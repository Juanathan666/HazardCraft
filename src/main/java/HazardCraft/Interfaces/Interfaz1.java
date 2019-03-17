package HazardCraft.Interfaces;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import HazardCraft.HazardCraft;

public class Interfaz1 extends GuiContainer {

    private ResourceLocation texture = new ResourceLocation(HazardCraft.MODID + ":" + "textures/gui/mesa_de_trabajo_de_zafiro.png");

    public Interfaz1(InventoryPlayer invPlayer, World world, BlockPos pos) {
        super(new LibroContainer(invPlayer, world, pos));

        this.xSize = 176;
        this.ySize = 188;

    }


    public void onGuiClosed() {
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int i, int j) {
        this.fontRenderer.drawString(I18n.format("gui.Mesa_de_Zafiro.name"), 90, 80,  0x00219D);
        this.fontRenderer.drawString(I18n.format("gui.Fabricacion.name"), 15 , 5,  0x178E8E);
        this.fontRenderer.drawString(I18n.format("gui.Inventario.name"),5 , 91,    0x404040);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

        GL11.glColor4f(1F, 1F, 1F, 1F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

    }

}
