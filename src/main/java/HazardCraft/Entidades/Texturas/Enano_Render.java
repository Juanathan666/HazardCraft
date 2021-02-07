package HazardCraft.Entidades.Texturas;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.Enano;
import HazardCraft.Entidades.Modelos.Enano_Modelo;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class Enano_Render extends RenderLiving<Enano> 
{

	public static final ResourceLocation TEXTURAS = new ResourceLocation(HazardCraft.MODID + ":textures/entity/enano.png");
	
	public Enano_Render(RenderManager manager) 
	{
		super(manager, new Enano_Modelo(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Enano entity) 
	{
		return TEXTURAS;
	}
	
	
	@Override
	protected void applyRotations(Enano entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
