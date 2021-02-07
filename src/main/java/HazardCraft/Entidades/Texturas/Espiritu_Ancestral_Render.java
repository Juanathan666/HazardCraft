package HazardCraft.Entidades.Texturas;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.Espiritu_Ancestral;
import HazardCraft.Entidades.Modelos.Espiritu_Ancestral_Modelo;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class Espiritu_Ancestral_Render extends RenderLiving<Espiritu_Ancestral> 
{

	public static final ResourceLocation TEXTURAS = new ResourceLocation(HazardCraft.MODID + ":textures/entity/espiritu_ancestral.png");
	
	public Espiritu_Ancestral_Render(RenderManager manager) 
	{
		super(manager, new Espiritu_Ancestral_Modelo(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Espiritu_Ancestral entity) 
	{
		return TEXTURAS;
	}
	
	
	@Override
	protected void applyRotations(Espiritu_Ancestral entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
