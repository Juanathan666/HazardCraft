package HazardCraft.Interfaces;

import org.lwjgl.opengl.GL11;

import HazardCraft.HazardCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;

public class texturabotones extends GuiButton
{
	public ResourceLocation buttonTexture;

	public texturabotones(int id, int width, int height, String displayString, String textureName, int ancho, int alto) 
	{
		super(id, width, height, displayString);
		buttonTexture = new ResourceLocation(HazardCraft.MODID + ":textures/gui/" + textureName);
		this.width=ancho;
		this.height=alto;
	}

	
	
	@Override
	public void drawButton(Minecraft minecraft, int mouseX, int mouseY, float partialTicks)
	{
		
		 if (this.visible)
	        {
	            FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
	            Minecraft.getMinecraft().getTextureManager().bindTexture(buttonTexture);
	            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	            this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
	            int i = this.getHoverState(this.hovered);
	            GlStateManager.enableBlend();
	            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
	            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
	            this.drawTexturedModalRect(this.x, this.y, 0, 46 + i * 20, this.width / 2, this.height);
	            this.drawTexturedModalRect(this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + i * 20, this.width / 2, this.height);
	            this.mouseDragged(Minecraft.getMinecraft(), mouseX, mouseY);
	            int j = 14737632;

	            if (packedFGColour != 0)
	            {
	                j = packedFGColour;
	            }
	            else
	            if (!this.enabled)
	            {
	                j = 10526880;
	            }
	            else if (this.hovered)
	            {
	                j = 16777120;
	            }

	            this.drawCenteredString(fontrenderer, this.displayString, this.x + this.width / 2, this.y + (this.height - 8) / 2, j);
	        }
	}
	
}
