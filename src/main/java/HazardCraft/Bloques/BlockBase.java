package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Bloques;
import HazardCraft.Iniciar.Items;
import HazardCraft.Util.Modelos;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBase extends Block implements Modelos
{
    public static final SoundType Quitar_sonido = new SoundType(-1.0F, 1.0F, SoundEvents.BLOCK_GLASS_BREAK, SoundEvents.BLOCK_GLASS_STEP, SoundEvents.BLOCK_GLASS_PLACE, SoundEvents.BLOCK_GLASS_HIT, SoundEvents.BLOCK_GLASS_FALL);

	
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
	
	public IBlockState CambioPilar(IBlockState state, IBlockAccess worldIn, BlockPos pos) 
	{
		return null;
	}
	
	
	
}
