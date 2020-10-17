package HazardCraft.Bloques;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class pilar_de_marmol_blanco_inferior extends BlockBase {

	public pilar_de_marmol_blanco_inferior(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
		this.setTickRandomly(true);

	}

	
		
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Bloques.PILAR_DE_MARMOL_BLANCO);
	}
@Override
protected boolean canSilkHarvest() {
	// TODO Auto-generated method stub
	return false;
}
	
}