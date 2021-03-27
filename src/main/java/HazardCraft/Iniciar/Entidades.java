package HazardCraft.Iniciar;

import HazardCraft.HazardCraft;
import HazardCraft.Entidades.Enano;
import HazardCraft.Entidades.Espiritu_Ancestral;
import HazardCraft.Entidades.Lobo_demoniaco;
import HazardCraft.Entidades.prueba;
import HazardCraft.Entidades.Modelos.Lobo_demoniaco_Modelo;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entidades {

	public static void iniciar_entidades() {
		registrar_entidades("prueba", prueba.class, 120, 16754013, 42240);
		registrar_entidades("EnanoH", Enano.class, 121, 65297, 65483);
		registrar_entidades("Espiritu_Ancestral", Espiritu_Ancestral.class, 122, 808080, 16711680);
		registrar_entidades("Lobo_demoniacoH", Lobo_demoniaco.class, 123, 16711680, 16737024);

	}
	
	private static void registrar_entidades(String nombre, Class<? extends Entity> entidad, int id, int fondo, int puntos) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(HazardCraft.MODID + ":" + nombre), entidad, nombre, id, HazardCraft.instance, 100, 1, true, fondo, puntos);
		
	}
}
