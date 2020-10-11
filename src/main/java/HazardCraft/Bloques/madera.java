package HazardCraft.Bloques;

import java.util.Random;

import Eventos.Eventos_Principal;
import HazardCraft.HazardCraft;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class madera extends BlockBase 
{
	public madera(String name, Material material) 
	{
		super(name, material);
		
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("Pickaxe", 0);
		setSoundType(SoundType.WOOD);
		if(Eventos_Principal.Navidad) {
			setCreativeTab(HazardCraft.EventosTab);
		}else {
			setCreativeTab(HazardCraft.HazardCraftTab);
		}
	
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Items.APPLE;
	}
}
