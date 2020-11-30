package HazardCraft.Items.Armaduras.Base;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Items_OverWorld;
import HazardCraft.Util.Modelos;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmaduraBases extends ItemArmor implements Modelos {

	public ArmaduraBases(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(HazardCraft.MODID, unlocalizedName));
	     Items_OverWorld.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		HazardCraft.Proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
