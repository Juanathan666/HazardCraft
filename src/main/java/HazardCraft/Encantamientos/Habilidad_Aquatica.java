package HazardCraft.Encantamientos;

import HazardCraft.HazardCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Habilidad_Aquatica extends Enchantment {

	public Habilidad_Aquatica() {
		
		super(Rarity.RARE, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] {EntityEquipmentSlot.FEET});
		
		this.setName("Habilidad_Aquatica");
		this.setRegistryName(new ResourceLocation(HazardCraft.MODID + ":Habilidad_Aquatica"));

		Encantamiento.ENCHATMENTS.add(this);
		
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		
		return 7 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxLevel() {
		return 4;
	}
	
	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		
		return true;
	}
	
	
}
