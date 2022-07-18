
package net.mcreator.zekcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.zekcraft.world.inventory.ComputerScreenMenu;
import net.mcreator.zekcraft.network.ComputerScreenButtonMessage;
import net.mcreator.zekcraft.ZekcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ComputerScreenScreen extends AbstractContainerScreen<ComputerScreenMenu> {
	private final static HashMap<String, Object> guistate = ComputerScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ComputerScreenScreen(ComputerScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("zekcraft:textures/computer_screen.png");

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
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		this.font.draw(poseStack, "TIP OF THE DAY:", 192, 87, -13312);
		this.font.draw(poseStack, "W.I.P", 216, 100, -13382656);
		this.font.draw(poseStack, "The Super-Duper-Computer 5000", 12, 15, -16777216);
		this.font.draw(poseStack, "Press 'ESC' to close this screen", 3, 186, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 12, this.topPos + 42, 61, 20, new TextComponent("ENEMIES"), e -> {
			if (true) {
				ZekcraftMod.PACKET_HANDLER.sendToServer(new ComputerScreenButtonMessage(0, x, y, z));
				ComputerScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 12, this.topPos + 69, 108, 20, new TextComponent("CRAFTING RECIPES"), e -> {
			if (true) {
				ZekcraftMod.PACKET_HANDLER.sendToServer(new ComputerScreenButtonMessage(1, x, y, z));
				ComputerScreenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 12, this.topPos + 96, 61, 20, new TextComponent("STORAGE"), e -> {
			if (true) {
				ZekcraftMod.PACKET_HANDLER.sendToServer(new ComputerScreenButtonMessage(2, x, y, z));
				ComputerScreenButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 12, this.topPos + 123, 51, 20, new TextComponent("ITEMS"), e -> {
		}));
	}
}
