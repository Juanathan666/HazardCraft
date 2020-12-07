package HazardCraft.Iniciar;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.Enano;
import HazardCraft.Entidades.prueba;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entidades {

	public static void iniciar_entidades() {
		registrar_entidades("prueba", prueba.class, 120, 16754013, 42240);
		registrar_entidades("EnanoH", Enano.class, 121, 65297, 65483);
	}
	
	private static void registrar_entidades(String nombre, Class<? extends Entity> entidad, int id, int fondo, int puntos) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(HazardCraft.MODID + ":" + nombre), entidad, nombre, id, HazardCraft.instance, 100, 1, true, fondo, puntos);
		
	}
}
