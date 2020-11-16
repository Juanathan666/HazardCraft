package HazardCraft.Iniciar;

import HazardCraft.HazardCraft;
import HazardCraft.Util.ArmaduraBases;
import HazardCraft.Util.Armadura_enderita_Base;
import HazardCraft.Util.Armadura_netherita_base;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Armaduras {
	
	public static Item casco_de_hierro_oxidado;
	public static Item pechera_de_hierro_oxidado;
	public static Item grebas_de_hierro_oxidado;
	public static Item botas_de_hierro_oxidado;

	public static Item casco_de_netherita;
	public static Item pechera_de_netherita;
	public static Item grebas_de_netherita;
	public static Item botas_de_netherita;

    public static Item casco_de_enderita;
	public static Item pechera_de_enderita;
	public static Item grebas_de_enderita;
	public static Item botas_de_enderita;
	
	
	//Material
	public static final ItemArmor.ArmorMaterial hierro_oxidado = EnumHelper.addArmorMaterial("hierro_oxidado", HazardCraft.MODID + ":hierro_oxidado", 7, new int[]{1, 2, 3, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static final ItemArmor.ArmorMaterial netherita_material = EnumHelper.addArmorMaterial("netherita", HazardCraft.MODID + ":netherita", 7, new int[]{3, 6, 8, 3}, 10, Sonidos.bloque_de_netherita_colocar, 2.0F);
    public static final ItemArmor.ArmorMaterial enderita_material = EnumHelper.addArmorMaterial("enderita", HazardCraft.MODID + ":enderita", 8, new int[] {4,7,9,4}, 11, Sonidos.armadura_de_netherita_poner, 2.5F);
	
	public static void Registar_Armadura() {
		
		casco_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.HEAD, "casco_de_hierro_oxidado");
		pechera_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.CHEST, "pechera_de_hierro_oxidado");
		grebas_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,2, EntityEquipmentSlot.LEGS, "grebas_de_hierro_oxidado");
		botas_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.FEET, "botas_de_hierro_oxidado");
		
		casco_de_netherita = new Armadura_netherita_base(netherita_material,1, EntityEquipmentSlot.HEAD, "casco_de_netherita");
		pechera_de_netherita = new Armadura_netherita_base(netherita_material,1, EntityEquipmentSlot.CHEST, "pechera_de_netherita");
		grebas_de_netherita = new Armadura_netherita_base(netherita_material,2, EntityEquipmentSlot.LEGS, "grebas_de_netherita");
		botas_de_netherita = new Armadura_netherita_base(netherita_material,1, EntityEquipmentSlot.FEET, "botas_de_netherita");
		
		casco_de_enderita = new Armadura_enderita_Base(enderita_material,1, EntityEquipmentSlot.HEAD, "casco_de_enderita");
		pechera_de_enderita = new Armadura_enderita_Base(enderita_material,1, EntityEquipmentSlot.CHEST, "pechera_de_enderita");
		grebas_de_enderita = new Armadura_enderita_Base(enderita_material,2, EntityEquipmentSlot.LEGS, "grebas_de_enderita");
		botas_de_enderita = new Armadura_enderita_Base(enderita_material,1, EntityEquipmentSlot.FEET, "botas_de_enderita");
	   
		
	}
	
	
	
	
}
