package HazardCraft.Biomas;


import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Biomas {

	public static final Biome ANCIENT_FOREST = new Ancient_Forest();
	
	
	public static void registarBiomas() {
		
		iniciarbioma(ANCIENT_FOREST, "Ancient Forest", BiomeType.WARM, Type.HILLS, Type.FOREST);
		
	}
	
	private static Biome iniciarbioma(Biome biome, String name, BiomeType biometype, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biometype, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		
		return biome;
	}
	
}
