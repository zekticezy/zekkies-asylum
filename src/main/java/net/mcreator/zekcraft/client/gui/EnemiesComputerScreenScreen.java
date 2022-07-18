
package net.mcreator.zekcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.zekcraft.world.inventory.EnemiesComputerScreenMenu;
import net.mcreator.zekcraft.network.EnemiesComputerScreenButtonMessage;
import net.mcreator.zekcraft.ZekcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EnemiesComputerScreenScreen extends AbstractContainerScreen<EnemiesComputerScreenMenu> {
	private final static HashMap<String, Object> guistate = EnemiesComputerScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public EnemiesComputerScreenScreen(EnemiesComputerScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
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
		this.font.draw(poseStack, "Capybara", 3, 6, -1);
		this.font.draw(poseStack, "Creature (dosen't attack), Pet, Tamable with Apple", 3, 15, -6710887);
		this.font.draw(poseStack, "Duck", 3, 33, -1);
		this.font.draw(poseStack, "Mob (Attacks), Pet, Tamable with: Bread", 3, 42, -6710887);
		this.font.draw(poseStack, "Saul Goodman", 3, 60, -1);
		this.font.draw(poseStack, "Creature (dosen't attack), Tamable with: Paper", 3, 69, -6710887);
		this.font.draw(poseStack, "White Woman", 3, 87, -1);
		this.font.draw(poseStack, "Mob (Attacks), AGGRESIVE TOWARDS PLAYERS!", 3, 96, -6710887);
		this.font.draw(poseStack, "Kiryu \"Dame Da Ne\" Kazuma", 3, 114, -1);
		this.font.draw(poseStack, "Mob (Attacks), Tamable with: Apple", 3, 123, -6710887);
		this.font.draw(poseStack, "Gloobus", 3, 141, -1);
		this.font.draw(poseStack, "Mob (Attacks), Tamable with Potato", 3, 150, -6710887);
		this.font.draw(poseStack, "Angry Moth", 3, 168, -1);
		this.font.draw(poseStack, "Mob (Attacks), AGGRESIVE TOWARDS PLAYERS!", 3, 177, -6710887);
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
		this.addRenderableWidget(new Button(this.leftPos + 291, this.topPos + 168, 46, 20, new TextComponent("Back"), e -> {
			if (true) {
				ZekcraftMod.PACKET_HANDLER.sendToServer(new EnemiesComputerScreenButtonMessage(0, x, y, z));
				EnemiesComputerScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
