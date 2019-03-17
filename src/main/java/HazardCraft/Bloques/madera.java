package HazardCraft.Bloques;

import java.util.Random;

import HazardCraft.Iniciar.Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import HazardCraft.HazardCraft;

public class madera extends BlockBase 
{
	public madera(String name, Material material) 
	{
		super(name, material);
		
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("Pickaxe", 0);
		setSoundType(SoundType.WOOD);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Items.APPLE;
	}
}
