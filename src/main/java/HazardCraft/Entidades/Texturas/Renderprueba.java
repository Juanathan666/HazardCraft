package HazardCraft.Entidades.Texturas;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.prueba;
import HazardCraft.Entidades.Modelos.prueba_Modelo;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class Renderprueba extends RenderLiving<prueba> {

	public static final ResourceLocation TEXTURAS = new ResourceLocation(HazardCraft.MODID + ":textures/entity/prueba.png");
	
	public Renderprueba(RenderManager manager) {
		
		super(manager, new prueba_Modelo(), 0.5F);
		
	}
	
	@Override
	protected ResourceLocation getEntityTexture(prueba entity) {
		return TEXTURAS;
	}
	@Override
	protected void applyRotations(prueba entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
