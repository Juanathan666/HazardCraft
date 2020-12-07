package HazardCraft.Entidades.Generar;

import HazardCraft.Entidades.Enano;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Generar_Overworld {

public static void iniciar() {
		
	EntityRegistry.addSpawn(Enano.class, 1000, 1, 2, EnumCreatureType.MONSTER, Biomes.DESERT);
	
	}
	
}
