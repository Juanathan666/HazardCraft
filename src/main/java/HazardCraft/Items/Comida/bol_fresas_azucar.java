package HazardCraft.Items.Comida;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Registro_Comidas;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class bol_fresas_azucar extends Registro_Comidas {

	public bol_fresas_azucar(int amount, float saturation, boolean isWolfFood, String name) 
	{
		super(amount, saturation, isWolfFood, name);

		setCreativeTab(HazardCraft.HazardCraftTab_Cultivos);
		setMaxStackSize(1);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.inventory.addItemStackToInventory(new ItemStack(Items.BOWL, 1));
		
		super.onFoodEaten(stack, worldIn, player);
	}
}
