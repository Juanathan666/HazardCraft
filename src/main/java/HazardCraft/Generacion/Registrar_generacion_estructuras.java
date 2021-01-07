package HazardCraft.Generacion;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import HazardCraft.Biomas.Biomas;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Registrar_generacion_estructuras implements IWorldGenerator {

	public static final WorldGenEstructuras PRUEBA = new WorldGenEstructuras("prueba");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
	
		switch (world.provider.getDimension()) {
		case 1:
			
			break;

		case 0:
			
			generarestructura_bajo_tierra_por_partes(PRUEBA, world, random, chunkX, chunkZ, 25, Blocks.STONE, Biomas.ANCIENT_FOREST.getClass());
			
			break;
			
			
		case -1:
			
			break;
		}
		
	}
	
private void generarestructura_bajo_tierra_por_partes(WorldGenerator generator, World world, Random rand, int chunkx, int chunkz, int probabilidad, Block topblock, Class<?>... classes) {
		
		ArrayList<Class<?>> lista_de_clases = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkx * 16) + rand.nextInt(15);
		int z = (chunkz * 16) + rand.nextInt(15);
		int y = calcular_alturas_dungeon(world, x, z, topblock);
		BlockPos pos = new BlockPos(x,y,z);
		BlockPos pos1 = new BlockPos(x,y,z+24);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() !=WorldType.FLAT) {
			if(lista_de_clases.contains(biome)) {
				
				if(rand.nextInt(probabilidad) == 0) {
					generator.generate(world, rand, pos);
					generator.generate(world, rand, pos1);
				}
			}
		}
		
	}
	
private void generarestructura_bajo_tierra(WorldGenerator generator, World world, Random rand, int chunkx, int chunkz, int probabilidad, Block topblock, Class<?>... classes) {
		
		ArrayList<Class<?>> lista_de_clases = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkx * 16) + rand.nextInt(15);
		int z = (chunkz * 16) + rand.nextInt(15);
		int y = calcular_alturas_dungeon(world, x, z, topblock);
		BlockPos pos = new BlockPos(x,y,z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() !=WorldType.FLAT) {
			if(lista_de_clases.contains(biome)) {
				
				if(rand.nextInt(probabilidad) == 0) {
					generator.generate(world, rand, pos);
				}
			}
		}
		
	}
	
	private void generarestructura(WorldGenerator generator, World world, Random rand, int chunkx, int chunkz, int probabilidad, Block topblock, Class<?>... classes) {
		
		ArrayList<Class<?>> lista_de_clases = new ArrayList<Class<?>>(Arrays.asList(classes));
		int x = (chunkx * 16) + rand.nextInt(15);
		int z = (chunkz * 16) + rand.nextInt(15);
		int y = calcular_alturas(world, x, z, topblock);
		BlockPos pos = new BlockPos(x,y,z);

		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() !=WorldType.FLAT) {
			if(lista_de_clases.contains(biome)) {
				
				if(rand.nextInt(probabilidad) == 0) {
					generator.generate(world, rand, pos);
				}
			}
		}
		
	}
	
private static int calcular_alturas_dungeon(World world, int x, int z, Block topblock) {
		
		int y = 20;
		boolean foundground = false;
		while(!foundground && y-- >=0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundground = block == topblock;
		}
		return y;
	}
	
	private static int calcular_alturas(World world, int x, int z, Block topblock) {
		
		int y = world.getHeight();
		boolean foundground = false;
		while(!foundground && y-- >=0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundground = block == topblock;
		}
		return y;
	}

}
