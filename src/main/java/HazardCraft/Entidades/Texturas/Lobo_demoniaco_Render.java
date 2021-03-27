package HazardCraft.Entidades.Texturas;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.Lobo_demoniaco;
import HazardCraft.Entidades.Modelos.Lobo_demoniaco_Modelo;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class Lobo_demoniaco_Render extends RenderLiving<Lobo_demoniaco> 
{

	public static final ResourceLocation TEXTURAS = new ResourceLocation(HazardCraft.MODID + ":textures/entity/lobo_demoniaco.png");
	
	public Lobo_demoniaco_Render(RenderManager manager) 
	{
		super(manager, new Lobo_demoniaco_Modelo(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Lobo_demoniaco entity) 
	{
		return TEXTURAS;
	}
	
	
	@Override
	protected void applyRotations(Lobo_demoniaco entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
