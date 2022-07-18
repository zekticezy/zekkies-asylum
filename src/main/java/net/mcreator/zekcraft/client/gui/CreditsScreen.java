
package net.mcreator.zekcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.zekcraft.world.inventory.CreditsMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CreditsScreen extends AbstractContainerScreen<CreditsMenu> {
	private final static HashMap<String, Object> guistate = CreditsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CreditsScreen(CreditsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 361;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("zekcraft:textures/credits.png");

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
		this.font.draw(poseStack, "Zekcraft Credits", 9, 5, -16777216);
		this.font.draw(poseStack, "Theme Of Cancer & The Spinal Staircase Music - Heaven Pierce Her", 8, 16, -16777216);
		this.font.draw(poseStack, "Saul Goodman and White Woman skin - namemc", 10, 28, -16777216);
		this.font.draw(poseStack, "Kiryu Kazuma & Mr. Skelly Bones skin - Novaskin", 9, 39, -16777216);
		this.font.draw(poseStack, "Gorilla Noise - GDILIVES/JOHN ROBLOX", 10, 51, -16777216);
		this.font.draw(poseStack, "Saul Sound - Better Call Saul/AMC", 9, 61, -16777216);
		this.font.draw(poseStack, "Capybara Bark -  CAPYBARA LAND [japanese] PUIPUI on YT", 7, 73, -16777216);
		this.font.draw(poseStack, "Gloobus Sound - Imagine Dragons", 7, 85, -16777216);
		this.font.draw(poseStack, "Kiryu Sounds - SEGA", 8, 95, -16777216);
		this.font.draw(poseStack, "Duck Sound - Schurikenz on YT", 8, 106, -16777216);
		this.font.draw(poseStack, "GOTPM Sound - DairyOrange on YT", 8, 115, -16777216);
		this.font.draw(poseStack, "Everything else - zekticezy", 8, 141, -16777216);
		this.font.draw(poseStack, "Made with love using MCreator", 108, 163, -16777216);
		this.font.draw(poseStack, "[twitch.tv/zekticezy]", 128, 174, -16777216);
		this.font.draw(poseStack, "fr_fr localization - zekticezy (with the help of Google Translate)", 9, 152, -16777216);
		this.font.draw(poseStack, "Jetstream Sam Noise - The Only Thing I Know For Real ", 7, 123, -12829636);
		this.font.draw(poseStack, "Jetstream Sam Skin - Skindex", 8, 131, -12829636);
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
	}
}
