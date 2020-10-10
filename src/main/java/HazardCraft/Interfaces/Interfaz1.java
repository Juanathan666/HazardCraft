package HazardCraft.Interfaces;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import HazardCraft.HazardCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class Interfaz1 extends GuiContainer {

	public GuiButton atras;
	public GuiButton siguiente;
	
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
@Override
public void initGui() {
	
	int centroX = this.width/2;
	int centroY = this.height/2;
	
	this.buttonList.add(this.siguiente = new texturabotones(0, centroX + 45, centroY + 140, new TextComponentTranslation("boton.siguiente.name").getFormattedText(), "e.png", 60, 20)); //Parametros de los botones (id, x, y, width, height, text)

	super.initGui();
}

@Override
protected void actionPerformed(GuiButton boton) throws IOException {
	
	if(boton.id == 0) {
		Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation("manko si"));
	}
	
	
	super.actionPerformed(boton);
   }
}
