package HazardCraft.Iniciar;

import HazardCraft.Entidades.Enano;
import HazardCraft.Entidades.Espiritu_Ancestral;
import HazardCraft.Entidades.Lobo_demoniaco;
import HazardCraft.Entidades.prueba;
import HazardCraft.Entidades.Texturas.Enano_Render;
import HazardCraft.Entidades.Texturas.Espiritu_Ancestral_Render;
import HazardCraft.Entidades.Texturas.Lobo_demoniaco_Render;
import HazardCraft.Entidades.Texturas.Renderprueba;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

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
RenderingRegistry.registerEntityRenderingHandler(Espiritu_Ancestral.class, new IRenderFactory() {
	
	@Override
	public Render<? super Espiritu_Ancestral> createRenderFor(RenderManager manager) {
		// TODO Auto-generated method stub
		return new Espiritu_Ancestral_Render(manager);
	}
	
});
		
	
	RenderingRegistry.registerEntityRenderingHandler(Lobo_demoniaco.class, new IRenderFactory() {
		
		@Override
		public Render<? super Lobo_demoniaco> createRenderFor(RenderManager manager) {
			// TODO Auto-generated method stub
			return new Lobo_demoniaco_Render(manager);
		}
		
	});
			
		}
	
}
