package HazardCraft.Iniciar;

import HazardCraft.Entidades.Enano;
import HazardCraft.Entidades.prueba;
import HazardCraft.Entidades.Texturas.Enano_Render;
import HazardCraft.Entidades.Texturas.Renderprueba;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entidades_Render {

	public static void registrar_modelos() {
		
		
RenderingRegistry.registerEntityRenderingHandler(prueba.class, new IRenderFactory() {
			
			@Override
			public Render<? super prueba> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new Renderprueba(manager);
			}
			
		});


RenderingRegistry.registerEntityRenderingHandler(Enano.class, new IRenderFactory() {
	
	@Override
	public Render<? super Enano> createRenderFor(RenderManager manager) {
		// TODO Auto-generated method stub
		return new Enano_Render(manager);
	}
	
});
		
		
	}
	
	
}
