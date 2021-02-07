package HazardCraft.Bloques.Registrar;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Items_OverWorld;
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

public class Registro_Bloques extends Block implements Modelos
{
    public static final SoundType Quitar_sonido = new SoundType(-1.0F, 1.0F, SoundEvents.BLOCK_GLASS_BREAK, SoundEvents.BLOCK_GLASS_STEP, SoundEvents.BLOCK_GLASS_PLACE, SoundEvents.BLOCK_GLASS_HIT, SoundEvents.BLOCK_GLASS_FALL);

	
	public Registro_Bloques (String name, Material material)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		Bloques_Overworld_Plantas.BLOCKS.add(this);
		Bloques_Arboles.BLOCKS.add(this);
		
		Bloques_OverWorld_Decoracion.BLOCKS.add(this);
		Bloques_OverWorld_Menas.BLOCKS.add(this);

		Bloques_Nether_Menas.BLOCKS.add(this);
		
		Bloques_End_Menas.BLOCKS.add(this);
		
		Items_OverWorld.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
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
