package HazardCraft.CambiosMecanicas;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Armaduras;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Biomes;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Eventos {

	private static int tick;
	private static int tick_lluvia;
	private static int tick_lluvia_acida;
	private static DamageSource lluvia_acida_damage_source = new DamageSource("acida").setDamageBypassesArmor();
	private static boolean mensaje = false;
	private static boolean activar_lluvia_acida = false; 
	private static int prob_lluvia = 0;
	/**
	@SubscribeEvent
	public void oncraftevent(ItemCraftedEvent event) {
		ItemStack stack = event.crafting;

		if (stack.getItem() == new ItemStack(Items.DIAMOND_SWORD).getItem())
		{
			stack.addEnchantment(Encantamiento.Habilidad_Aquatica, 1);
			
		}
	}**/
	
	
	@SubscribeEvent
	public void PlayerTickEventos(PlayerTickEvent event){
		//System.out.println(tick+" " + tick_lluvia + " " + tick_lluvia_acida + mensaje + " " + activar_lluvia_acida + " " + prob_lluvia);
		//Muestra el mensaje si sale la probabilidad de activar la lluvia acida
		if(!mensaje && event.player.world.isRaining()) {
			Random rand = new Random();
			prob_lluvia = rand.nextInt(20);
			if(prob_lluvia==1 && !event.player.world.isRemote){
				
				 event.player.sendMessage(new TextComponentTranslation(HazardCraft.nombre_mensajes + TextFormatting.RED + "LLuvia acida activada."));
				 activar_lluvia_acida = true;

			}else if(!(prob_lluvia ==1) && event.player.world.canSeeSky(event.player.getPosition())) {
				event.player.sendMessage(new TextComponentTranslation(HazardCraft.nombre_mensajes + TextFormatting.GREEN + "La Lluvia no contiene acido."));
			}
			mensaje = true;
			//Pone en default las variables al dejar de llover
		}else if(!event.player.world.isRaining() && mensaje) {

			 mensaje = false;
			 activar_lluvia_acida = false;
			 tick_lluvia = 0;
			 tick_lluvia_acida = 0;
			 prob_lluvia = 0;
		 }	
		//Hace daño al jugador si la lluvia acida se activa
			if(activar_lluvia_acida) { 
				tick_lluvia_acida++;
                  if (event.player.world.canSeeSky(event.player.getPosition()) && !event.player.capabilities.isCreativeMode && !event.player.world.isRemote) {
			//Hara daño cada x tick si se comple la condicion de que en el bioma que se encuentra el jugador puede llover. Osea en un desierto no le ara daño
				if(tick_lluvia_acida>110 && event.player.world.getBiome(event.player.getPosition()).canRain()) {
					//Hace mas daño segun la dificultad en pacifico no hace daño
					if(event.player.world.getDifficulty() == EnumDifficulty.EASY) {
					event.player.attackEntityFrom(lluvia_acida_damage_source, 1.0F);
					}else if(event.player.world.getDifficulty() == EnumDifficulty.NORMAL) {
						event.player.attackEntityFrom(lluvia_acida_damage_source, 2.0F);
					}else if(event.player.world.getDifficulty() == EnumDifficulty.HARD) {
						event.player.attackEntityFrom(lluvia_acida_damage_source, 3.0F);
					}
			
		 }
							
}                
                  //Reinicia la variable para hacer 1 toque de daño cada cierto tiempo
				if(tick_lluvia_acida>113) {
					tick_lluvia_acida =0;
				}
		}
			
		//Quitar durabilidad por estar en el agua con el encantamiento
		ItemStack casco = event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);  
		ItemStack pechera = event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);  
		ItemStack grebas = event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);  
		ItemStack botas = event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET);  
		if(!botas.isEmpty() && event.player.isInWater()) {
		tick++;
		int level = EnchantmentHelper.getMaxEnchantmentLevel(Encantamiento.Habilidad_Aquatica, event.player);
		if(tick>90 && !event.player.world.isRemote && !event.player.capabilities.isCreativeMode) {
			
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
			event.player.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(Armaduras.botas_de_hierro_oxidado));

		}else {
event.player.setItemStackToSlot(EntityEquipmentSlot.FEET, ItemStack.EMPTY);

		}
	}
	
	if(casco.getMaxDamage()<casco.getItemDamage()) {
		if(casco.getItem() == Items.IRON_HELMET && event.player.world.isRaining()) {
			event.player.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(Armaduras.casco_de_hierro_oxidado));

			
		}else {
event.player.setItemStackToSlot(EntityEquipmentSlot.HEAD, ItemStack.EMPTY);
		}

	}
	
	if(pechera.getMaxDamage()<pechera.getItemDamage()) {
		
		if(pechera.getItem() == Items.IRON_CHESTPLATE && event.player.world.isRaining()) {
			event.player.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(Armaduras.pechera_de_hierro_oxidado));
			
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

//Te cambia la armadura de hierro por la de hierro oxidado si esta lloviendo
if(event.player.world.isRaining() && event.player.world.canSeeSky(event.player.getPosition()) && event.player.world.getBiome(event.player.getPosition()).canRain()) {
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
	
