package HazardCraft.Biomas;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Ancient_Forest extends Biome {

	public static int color = 238080;
	
	public Ancient_Forest() {
		//para lo del agua https://www.mathsisfun.com/hexadecimal-decimal-colors.html
		super(new BiomeProperties("Ancient Forest").setTemperature(0.6F).setWaterColor(color)/**.setBaseHeight(1.5F).setHeightVariation(1.2F).setRainDisabled()**/);
		
	    this.spawnableMonsterList.clear();
	    this.spawnableCaveCreatureList.clear();
	    this.spawnableCreatureList.clear();
	    this.spawnableWaterCreatureList.clear();
	    
		this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 69, 1, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 100, 3, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 100, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 100, 3, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCaveSpider.class, 100, 1, 1));


		
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 100, 4, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 100, 5, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 100, 3, 3));

      // this.topBlock = Blocks.DIAMOND_BLOCK.getDefaultState();
      // this.fillerBlock = Blocks.PRISMARINE.getDefaultState();    	
       

		
		this.decorator.bigMushroomsPerChunk = 1;
		this.decorator.treesPerChunk = 20;
		this.decorator.flowersPerChunk= 10;
		this.decorator.grassPerChunk = 10;
		
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float temp)
	{
	return color;
	}
	
	
	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return color;
	}
}
