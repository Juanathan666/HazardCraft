package HazardCraft.Items.Armaduras.End;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Sonidos;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Registrar_Armaduras_End 
{
	public static Item casco_de_enderita;
	public static Item pechera_de_enderita;
	public static Item grebas_de_enderita;
	public static Item botas_de_enderita;
	
	
	/*Material (nivel de armadura, reduccion de daño de cada pieza, nivel de encantamiento, sonido al ponerla)
	LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	*/
	
    public static final ItemArmor.ArmorMaterial enderita_material = EnumHelper.addArmorMaterial("enderita", HazardCraft.MODID + ":enderita", 60, new int[] {4,7,9,4}, 11, Sonidos.armadura_de_netherita_poner, 2.5F);

    
    public static void Registar_Armadura() 
	{
		casco_de_enderita = new Armadura_enderita_Base(enderita_material,1, EntityEquipmentSlot.HEAD, "casco_de_enderita");
		pechera_de_enderita = new Armadura_enderita_Base(enderita_material,1, EntityEquipmentSlot.CHEST, "pechera_de_enderita");
		grebas_de_enderita = new Armadura_enderita_Base(enderita_material,2, EntityEquipmentSlot.LEGS, "grebas_de_enderita");
		botas_de_enderita = new Armadura_enderita_Base(enderita_material,1, EntityEquipmentSlot.FEET, "botas_de_enderita");
	}
}
