package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Bloques;
import HazardCraft.Iniciar.Items;
import HazardCraft.Util.Modelos;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements Modelos
{
	public BlockBase (String name, Material material)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		Bloques.BLOCKS.add(this);
		Items.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		HazardCraft.Proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
