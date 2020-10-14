package HazardCraft.CambiosMecanicas;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class cambiar_stack {

	private static final int potion_max = 8;
	private static final boolean  _allowDownsizing = true;
	public static void iniciar() {
		new cambiar_stack().adjust(Items.POTIONITEM, potion_max);
		new cambiar_stack().adjust(Items.SPLASH_POTION, potion_max);
		new cambiar_stack().adjust(Items.LINGERING_POTION, potion_max);
        new cambiar_stack().adjust(Items.GOLDEN_APPLE, 8);
	}
	
	
	public void adjust(Item item, int preferredSize) {
	    if (preferredSize > 0 && (this._allowDownsizing || item.getItemStackLimit(new ItemStack(item)) < preferredSize))
	      try {
	        item.setMaxStackSize(preferredSize);
	      } catch (RuntimeException runtimeException) {} 
	  }
	
}
