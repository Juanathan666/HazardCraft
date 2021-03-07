package HazardCraft.Entidades.Generar;

import HazardCraft.Biomas.Biomas;
import HazardCraft.Entidades.Enano;
import HazardCraft.Entidades.Espiritu_Ancestral;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Generar_Overworld {

	public static void iniciar() 
	{
		EntityRegistry.addSpawn(Enano.class, 1000, 1, 2, EnumCreatureType.MONSTER, 
				Biomes.BEACH, 
				Biomes.BIRCH_FOREST, 
				Biomes.BIRCH_FOREST_HILLS,
				Biomes.COLD_BEACH,
				Biomes.COLD_TAIGA,
				Biomes.COLD_TAIGA_HILLS,
				Biomes.DEEP_OCEAN,
				Biomes.DEFAULT,
				Biomes.DESERT,
				Biomes.DESERT_HILLS,
				Biomes.EXTREME_HILLS,
				Biomes.EXTREME_HILLS_EDGE,
				Biomes.EXTREME_HILLS_WITH_TREES,
				Biomes.FOREST,
				Biomes.FOREST_HILLS,
				Biomes.FROZEN_OCEAN,
				Biomes.FROZEN_RIVER,
				Biomes.ICE_MOUNTAINS,
				Biomes.ICE_PLAINS,
				Biomes.JUNGLE,
				Biomes.JUNGLE_EDGE,
				Biomes.JUNGLE_HILLS,
				Biomes.MESA,
				Biomes.MESA_CLEAR_ROCK,
				Biomes.MESA_ROCK,
				Biomes.MUSHROOM_ISLAND,
				Biomes.MUSHROOM_ISLAND_SHORE,
				Biomes.MUTATED_BIRCH_FOREST,
				Biomes.MUTATED_BIRCH_FOREST_HILLS,
				Biomes.MUTATED_DESERT,
				Biomes.MUTATED_EXTREME_HILLS,
				Biomes.MUTATED_EXTREME_HILLS_WITH_TREES,
				Biomes.MUTATED_FOREST,
				Biomes.MUTATED_ICE_FLATS,
				Biomes.MUTATED_JUNGLE,
				Biomes.MUTATED_JUNGLE_EDGE,
				Biomes.MUTATED_MESA,
				Biomes.MUTATED_MESA_CLEAR_ROCK,
				Biomes.MUTATED_MESA_ROCK,
				Biomes.MUTATED_PLAINS,
				Biomes.MUTATED_REDWOOD_TAIGA,
				Biomes.MUTATED_REDWOOD_TAIGA_HILLS,
				Biomes.MUTATED_ROOFED_FOREST,
				Biomes.MUTATED_SAVANNA,
				Biomes.MUTATED_SAVANNA_ROCK,
				Biomes.MUTATED_SWAMPLAND,
				Biomes.MUTATED_TAIGA,
				Biomes.MUTATED_TAIGA_COLD,
				Biomes.OCEAN,
				Biomes.PLAINS,
				Biomes.REDWOOD_TAIGA,
				Biomes.REDWOOD_TAIGA_HILLS,
				Biomes.RIVER,
				Biomes.ROOFED_FOREST,
				Biomes.SAVANNA,
				Biomes.SAVANNA_PLATEAU,
				Biomes.STONE_BEACH,
				Biomes.SWAMPLAND,
				Biomes.TAIGA,
				Biomes.TAIGA_HILLS);
		
		EntityRegistry.addSpawn(Enano.class, 1000, 1, 2, EnumCreatureType.MONSTER, Biomas.ANCIENT_FOREST);
		
		EntityRegistry.addSpawn(Espiritu_Ancestral.class, 1000, 1, 2, EnumCreatureType.MONSTER, Biomas.ANCIENT_FOREST);
	}
}
