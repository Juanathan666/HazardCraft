package HazardCraft.CambiosMecanicas;

import HazardCraft.Iniciar.Armaduras;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Eventos {

	public static int tick;
	public static int tick_lluvia;
	
	@SubscribeEvent
	public void PlayerTickEventos(PlayerTickEvent event){
		ItemStack casco = event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);  
		ItemStack pechera = event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);  
		ItemStack grebas = event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);  
		ItemStack botas = event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET);  
		if(!botas.isEmpty() && event.player.isInWater()) {
		tick++;
		int level = EnchantmentHelper.getMaxEnchantmentLevel(Encantamiento.Habilidad_Aquatica, event.player);
		if(tick>70 && !event.player.world.isRemote) {
			
			switch (level) {
			case 1:
				botas.setItemDamage(botas.getItemDamage()+5);
				break;

			case 2:
				botas.setItemDamage(botas.getItemDamage()+3);
				break;

			case 3:
				botas.setItemDamage(botas.getItemDamage()+1);

				break;
			case 4:
				//botas.setItemDamage(botas.getItemDamage()+1);
                  
				break;
			}
			
	
			
	tick = 0;
		 }
		}else {
			tick = 0;
		}
	
	if(botas.getMaxDamage()<botas.getItemDamage()) {
		tick = 0;
		if(botas.getItem() == Items.IRON_BOOTS && event.player.world.isRaining()) {
			
			event.player.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(Armaduras.botas_de_hierro_oxidado));

		}else {
event.player.setItemStackToSlot(EntityEquipmentSlot.FEET, ItemStack.EMPTY);

		}
	}
	
	if(casco.getMaxDamage()<casco.getItemDamage()) {
		if(casco.getItem() == Items.IRON_HELMET && event.player.world.isRaining()) {
			event.player.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(Armaduras.casco_de_hierro_oxidado));

			
		}else {
event.player.setItemStackToSlot(EntityEquipmentSlot.HEAD, ItemStack.EMPTY);
		}

	}
	
	if(pechera.getMaxDamage()<pechera.getItemDamage()) {
		
		if(pechera.getItem() == Items.IRON_CHESTPLATE && event.player.world.isRaining()) {
			event.player.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(Armaduras.pechera_de_hierro_oxidado));
			
		}else {
event.player.setItemStackToSlot(EntityEquipmentSlot.CHEST, ItemStack.EMPTY);

		}
	}
	
	if(grebas.getMaxDamage()<grebas.getItemDamage()) {
		if(grebas.getItem() == Items.IRON_LEGGINGS && event.player.world.isRaining()) {
event.player.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(Armaduras.grebas_de_hierro_oxidado));
		}else {
			event.player.setItemStackToSlot(EntityEquipmentSlot.LEGS, ItemStack.EMPTY);
		}

	}

//ay que hacer que cuando la armadura de hierro se vaya a romper te ponga la armadura de hierro oxidada
if(event.player.world.isRaining() && event.player.world.canSeeSky(event.player.getPosition())) {
	if(casco.getItem() == Items.IRON_HELMET || pechera.getItem() == Items.IRON_CHESTPLATE || grebas.getItem() == Items.IRON_LEGGINGS || botas.getItem() == Items.IRON_BOOTS) {
	tick_lluvia++;
	if(casco.getItem() == Items.IRON_HELMET && tick_lluvia>70 && !event.player.world.isRemote) {
		casco.setItemDamage(casco.getItemDamage()+1);
	}
	
if(pechera.getItem() == Items.IRON_CHESTPLATE && tick_lluvia>70 && !event.player.world.isRemote) {
	pechera.setItemDamage(pechera.getItemDamage()+1);
	}
if(grebas.getItem() == Items.IRON_LEGGINGS && tick_lluvia>70 && !event.player.world.isRemote) {
	grebas.setItemDamage(grebas.getItemDamage()+1);
}
	if(botas.getItem() == Items.IRON_BOOTS && tick_lluvia>70 && !event.player.world.isRemote) {
		botas.setItemDamage(botas.getItemDamage()+1);
	}
	if(tick_lluvia>70 ) {
	tick_lluvia = 0;
	}
}else {
	tick_lluvia =0;
}
}else {
	tick_lluvia=0;
}

				
	 
	}
}
	
