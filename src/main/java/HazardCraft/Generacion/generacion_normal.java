package HazardCraft.Generacion;

import java.util.Random;

import HazardCraft.Biomas.Biomas;
import HazardCraft.Bloques.Registrar.Bloques_End_Menas;
import HazardCraft.Bloques.Registrar.Bloques_Nether_Menas;
import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Menas;
import HazardCraft.Bloques.Registrar.Bloques_Overworld_Plantas;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class generacion_normal implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension()) {
		case 1:
			generateEND(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			break;
		case 0:
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			break;
		case -1:
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			break;

		
		
		}
	}
	
	private void generateEND(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	
	generateOre(Bloques_End_Menas.MENA_DE_ENDERITA.getDefaultState(), world, random, chunkX*16, chunkZ*16, 30, 60, 3+random.nextInt(5), 7, Blocks.END_STONE);
	
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(Bloques_OverWorld_Menas.MENA_DE_MARMOL_BLANCO.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.STONE);
		generateOre(Bloques_OverWorld_Menas.MENA_DE_MARMOL_VERDE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.STONE);
		generateOre(Bloques_OverWorld_Menas.MENA_DE_MARMOL_NEGRO.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.STONE);
		generateOre(Bloques_OverWorld_Menas.MENA_DE_MARMOL_ROJO.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.STONE);
		
		generateOre(Bloques_OverWorld_Menas.MENA_DE_ESTANO.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.STONE);
		generateOre(Bloques_OverWorld_Menas.MENA_DE_COBRE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.STONE);
		
		generateOre(Bloques_OverWorld_Menas.MENA_DE_ZAFIRO.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 17, random.nextInt(5) + 1, 18, Blocks.STONE);
		
		generar_ore_bioma(Bloques_OverWorld_Menas.MENA_DE_AGATA_NEGRA.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 13, random.nextInt(5) + 1, 18, Blocks.STONE, Biomas.ANCIENT_FOREST);
		generar_ore_bioma(Bloques_OverWorld_Menas.MENA_DE_JADE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 13, random.nextInt(3) + 1, 18, Blocks.STONE, Biomas.ANCIENT_FOREST);
		
		generateOre_bajo_probabilidad(Bloques_OverWorld_Menas.MENA_DE_XP.getDefaultState(), world, random, chunkX*16, chunkZ*16, 3, 17, 20+random.nextInt(10), 100, Blocks.STONE);
		

		generateOre(Bloques_Overworld_Plantas.PLANTA_DE_FRESA_SALVAJE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 130, random.nextInt(3) + 1, 180, Blocks.TALLGRASS);

		//generar_ore_bioma(Blocks.BEACON.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 17, random.nextInt(5) + 1, 18, Blocks.STONE, Biomas.ANCIENT_FOREST);

	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	
	generateOre(Bloques_Nether_Menas.ESCOMBROS_ANCESTRALES.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18, Blocks.NETHERRACK);
	
	}
	
	
	private void generar_ore_bioma(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block quebloquereemplaza, Biome bioma) 
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(quebloquereemplaza));
			if(world.getBiome(pos).equals(bioma)) {
			generator.generate(world, random, pos);
			}
		}
	}
	
	
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block quebloquereemplaza) 
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(quebloquereemplaza));
			
			generator.generate(world, random, pos);
		}
	}
	
	
	private void generateOre_bajo_probabilidad(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block quebloquereemplaza) 
	{
		int deltaY = maxY - minY;
		
		int e = random.nextInt(chances);
		
		if(e==1) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(quebloquereemplaza));
			//Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(pos.getX() + " " + pos.getY() + ":" + pos.getZ()));
			generator.generate(world, random, pos);
		}
		
	}
}