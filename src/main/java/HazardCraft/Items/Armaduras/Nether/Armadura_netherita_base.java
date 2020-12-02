package HazardCraft.Items.Armaduras.Nether;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Registrar.Items_OverWorld;
import HazardCraft.Util.Modelos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Armadura_netherita_base extends ItemArmor implements Modelos {

	public Armadura_netherita_base(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(HazardCraft.MODID, unlocalizedName));
		setCreativeTab(HazardCraft.HazardCraftTab_Armaduras);
	    
		Items_OverWorld.ITEMS.add(this);
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
			
		if(casco.isEmpty() && (player.getHeldItemMainhand().getItem() == Registrar_Armaduras_Nether.casco_de_netherita || player.getHeldItemOffhand().getItem() == Registrar_Armaduras_Nether.casco_de_netherita)) {
              sonido(worldIn, player);
		}
		if(pechera.isEmpty() && (player.getHeldItemMainhand().getItem() == Registrar_Armaduras_Nether.pechera_de_netherita || player.getHeldItemOffhand().getItem() == Registrar_Armaduras_Nether.pechera_de_netherita)) {
			  sonido(worldIn, player);
		}
		if(grebas.isEmpty() && (player.getHeldItemMainhand().getItem() == Registrar_Armaduras_Nether.grebas_de_netherita || player.getHeldItemOffhand().getItem() == Registrar_Armaduras_Nether.grebas_de_netherita)) {
			  sonido(worldIn, player);
		}
		if(botas.isEmpty() && (player.getHeldItemMainhand().getItem() == Registrar_Armaduras_Nether.botas_de_netherita || player.getHeldItemOffhand().getItem() == Registrar_Armaduras_Nether.botas_de_netherita)) {
			  sonido(worldIn, player);
		}	
		
		return super.onItemRightClick(worldIn, player, handIn);
	}
	
	
	public static void sonido(World world, EntityPlayer player) {	
		world.playSound(player.posX, player.posY, player.posZ, Sonidos.armadura_de_netherita_poner, SoundCategory.PLAYERS, 1.0F, 1.0F, false);

	}
	
	
}
