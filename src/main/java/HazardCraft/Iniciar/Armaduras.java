package HazardCraft.Iniciar;

import HazardCraft.HazardCraft;
import HazardCraft.Util.ArmaduraBases;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Armaduras {

	public static Item casco_de_hierro_oxidado;
	public static Item pechera_de_hierro_oxidado;
	public static Item grebas_de_hierro_oxidado;
	public static Item botas_de_hierro_oxidado;

	
	//Material
	public static final ItemArmor.ArmorMaterial hierro_oxidado = EnumHelper.addArmorMaterial("hierro_oxidado", HazardCraft.MODID + ":hierro_oxidado", 7, new int[]{1, 2, 3, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	
	public static void Registar_Armadura() {
		
		casco_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.HEAD, "casco_de_hierro_oxidado");
		pechera_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.CHEST, "pechera_de_hierro_oxidado");
		grebas_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,2, EntityEquipmentSlot.LEGS, "grebas_de_hierro_oxidado");
		botas_de_hierro_oxidado = new ArmaduraBases(hierro_oxidado,1, EntityEquipmentSlot.FEET, "botas_de_hierro_oxidado");

		Registrar(casco_de_hierro_oxidado);
		Registrar(pechera_de_hierro_oxidado);
		Registrar(grebas_de_hierro_oxidado);
		Registrar(botas_de_hierro_oxidado);

		
		
		
	}
	
	
	public static void registerrender() {
		Registrar_t(casco_de_hierro_oxidado);
		Registrar_t(pechera_de_hierro_oxidado);
		Registrar_t(grebas_de_hierro_oxidado);
		Registrar_t(botas_de_hierro_oxidado);
	}
	
	private static void Registrar_t(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}
	
	private static void Registrar(Item item){
		item.setCreativeTab(HazardCraft.HazardCraftTab);
		ForgeRegistries.ITEMS.register(item);
			
	}
	
	
	
}
