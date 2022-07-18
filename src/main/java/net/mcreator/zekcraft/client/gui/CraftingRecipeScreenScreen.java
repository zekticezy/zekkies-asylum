
package net.mcreator.zekcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.zekcraft.world.inventory.CraftingRecipeScreenMenu;
import net.mcreator.zekcraft.network.CraftingRecipeScreenButtonMessage;
import net.mcreator.zekcraft.ZekcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CraftingRecipeScreenScreen extends AbstractContainerScreen<CraftingRecipeScreenMenu> {
	private final static HashMap<String, Object> guistate = CraftingRecipeScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CraftingRecipeScreenScreen(CraftingRecipeScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 369;
		this.imageHeight = 200;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "The Super-Duper-Computer 5000", 13, 6, -1);
		this.font.draw(poseStack, "Unfortunantely, I can't show all recipes here.", 67, 69, -1);
		this.font.draw(poseStack, "BUUUT, they're all avalible on a .pdf file i made.", 67, 78, -1);
		this.font.draw(poseStack, "Check it out!", 67, 87, -16777012);
		this.font.draw(poseStack, "https://www.dropbox.com/s/kupqcuiolqqstrl/zekcraft_recipies.pdf?dl=0", 4, 96, -10066177);
		this.font.draw(poseStack, "(Downloading file is not nessecary, Dropbox embeds it)", 4, 105, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 13, this.topPos + 177, 46, 20, new TextComponent("Back"), e -> {
			if (true) {
				ZekcraftMod.PACKET_HANDLER.sendToServer(new CraftingRecipeScreenButtonMessage(0, x, y, z));
				CraftingRecipeScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
