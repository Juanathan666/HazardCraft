package HazardCraft.Items.Armaduras.OverWorld;

import HazardCraft.HazardCraft;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Registrar_Armaduras_OverWorld {
	
	public static Item casco_de_hierro_oxidado;
	public static Item pechera_de_hierro_oxidado;
	public static Item grebas_de_hierro_oxidado;
	public static Item botas_de_hierro_oxidado;
	
	public static Item casco_de_zafiro;
	public static Item pechera_de_zafiro;
	public static Item grebas_de_zafiro;
	public static Item botas_de_zafiro;
	
	
	/*Material (nivel de armadura, reduccion de daño de cada pieza, nivel de encantamiento, sonido al ponerla)
	LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	*/
	
	public static final ItemArmor.ArmorMaterial hierro_oxidado = EnumHelper.addArmorMaterial("hierro_oxidado", HazardCraft.MODID + ":hierro_oxidado", 7, new int[]{1, 2, 3, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static final ItemArmor.ArmorMaterial zafiro = EnumHelper.addArmorMaterial("zafiro", HazardCraft.MODID + ":zafiro", 28, new int[]{3, 6, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);

	public static void Registar_Armadura() 
	{
		casco_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.HEAD, "casco_de_hierro_oxidado");
		pechera_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.CHEST, "pechera_de_hierro_oxidado");
		grebas_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,2, EntityEquipmentSlot.LEGS, "grebas_de_hierro_oxidado");
		botas_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.FEET, "botas_de_hierro_oxidado");
		
		casco_de_zafiro = new ArmaduraBases(zafiro, 1, EntityEquipmentSlot.HEAD, "casco_de_zafiro");
		pechera_de_zafiro = new ArmaduraBases(zafiro, 1, EntityEquipmentSlot.CHEST, "pechera_de_zafiro");
		grebas_de_zafiro = new ArmaduraBases(zafiro, 2, EntityEquipmentSlot.LEGS, "grebas_de_zafiro");
		botas_de_zafiro = new ArmaduraBases(zafiro, 1, EntityEquipmentSlot.FEET, "botas_de_zafiro");
	}
}
