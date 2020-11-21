package HazardCraft.Iniciar;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.prueba;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entidades {

	public static void iniciar_entidades() {
		registrar_entidades("prueba", prueba.class, 120, 50, 16754013, 42240);
	}
	
	private static void registrar_entidades(String nombre, Class<? extends Entity> entidad, int id, int rango_de_traqueo, int fondo, int puntos) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(HazardCraft.MODID + ":" + nombre), entidad, nombre, id, HazardCraft.instance, rango_de_traqueo, 1, true, fondo, puntos);
		
	}
}
