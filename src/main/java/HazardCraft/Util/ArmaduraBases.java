package HazardCraft.Util;

import HazardCraft.HazardCraft;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmaduraBases extends ItemArmor {

	public ArmaduraBases(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(HazardCraft.MODID, unlocalizedName));
		
	}

}
