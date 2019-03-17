package HazardCraft.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import HazardCraft.HazardCraft;

public class madera_item extends ItemBase
{

	public madera_item(String name) 
	{
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) 
	{
		player.openGui(HazardCraft.instance, 1, player.world, (int)player.posX, (int)player.posY, (int)player.posZ);
		
		return super.onItemRightClick(worldIn, player, handIn);
	}
}
