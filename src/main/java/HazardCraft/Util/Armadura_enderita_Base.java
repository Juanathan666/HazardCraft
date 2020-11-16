package HazardCraft.Util;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Armaduras;
import HazardCraft.Iniciar.Items;
import HazardCraft.Iniciar.Sonidos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Armadura_enderita_Base extends ItemArmor implements Modelos {

	public Armadura_enderita_Base(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(HazardCraft.MODID, unlocalizedName));
		setCreativeTab(HazardCraft.HazardCraftTab);
	     Items.ITEMS.add(this);
	}
    @Override
	public void registerModels() {
		HazardCraft.Proxy.registerItemRenderer(this, 0, "inventory");
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) {
			ItemStack casco = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);  
			ItemStack pechera = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);  
			ItemStack grebas = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);  
			ItemStack botas = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);  
			
		if(casco.isEmpty() && (player.getHeldItemMainhand().getItem() == Armaduras.casco_de_enderita || player.getHeldItemOffhand().getItem() == Armaduras.casco_de_enderita)) {
              sonido(worldIn, player);
		}
		if(pechera.isEmpty() && (player.getHeldItemMainhand().getItem() == Armaduras.pechera_de_enderita || player.getHeldItemOffhand().getItem() == Armaduras.pechera_de_enderita)) {
			  sonido(worldIn, player);
		}
		if(grebas.isEmpty() && (player.getHeldItemMainhand().getItem() == Armaduras.grebas_de_enderita || player.getHeldItemOffhand().getItem() == Armaduras.grebas_de_enderita)) {
			  sonido(worldIn, player);
		}
		if(botas.isEmpty() && (player.getHeldItemMainhand().getItem() == Armaduras.botas_de_enderita || player.getHeldItemOffhand().getItem() == Armaduras.botas_de_enderita)) {
			  sonido(worldIn, player);
		}	
		
		return super.onItemRightClick(worldIn, player, handIn);
	}
	
	public static void sonido(World world, EntityPlayer player) {	
		world.playSound(player.posX, player.posY, player.posZ, Sonidos.armadura_de_netherita_poner, SoundCategory.PLAYERS, 1.0F, 1.0F, false);

	}
	
	
}
