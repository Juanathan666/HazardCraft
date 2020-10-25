package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Sonidos;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class bloque_de_netherita extends BlockBase {
	
	private static double x;
	private static double y;
	private static double z;
    private static int tick = 0;
	
    public static final SoundType GLASS1 = new SoundType(-1.0F, 1.0F, SoundEvents.BLOCK_GLASS_BREAK, SoundEvents.BLOCK_GLASS_STEP, SoundEvents.BLOCK_GLASS_PLACE, SoundEvents.BLOCK_GLASS_HIT, SoundEvents.BLOCK_GLASS_FALL);

	
	public bloque_de_netherita(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(GLASS1);
		
		
	}


	
@Override
public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,ItemStack stack) {
	placer.world.playSound(pos.getX(), pos.getY(), pos.getZ(), Sonidos.bloque_de_netherita_colocar, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
	super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
}

@Override
public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
	world.playSound(pos.getX(), pos.getY(), pos.getZ(), Sonidos.bloque_de_netherita_romper, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
	super.onBlockDestroyedByPlayer(world, pos, state);
}
	
@Override
public void onEntityWalk(World world, BlockPos pos, Entity entity) {
	tick++;
	if(entity instanceof EntityLivingBase){
		if(!(x == entity.posX) && !(z == entity.posZ) && tick == 7) {
	world.playSound(pos.getX(), pos.getY(), pos.getZ(), Sonidos.bloque_de_netherita_andar, SoundCategory.BLOCKS, 0.3F, 1.0F, false);
		}
		
		if(tick>10) {
			tick = 0;
		}
		 x = entity.posX;
		 y = entity.posY;
		 z = entity.posZ;
	}
	super.onEntityWalk(world, pos, entity);
}
	

}