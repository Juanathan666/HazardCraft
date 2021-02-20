package HazardCraft.Bloques.Decorativos.OverWorld;

import java.util.List;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ladrillo_de_piedra_semiirrompible extends Registro_Bloques 
{

	public ladrillo_de_piedra_semiirrompible(String name, Material material) 
	{
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Bloques);
		setHardness(500.0F);
		setResistance(8.0F);
		setSoundType(SoundType.STONE);
	}
	
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) 
	{
		tooltip.add(TextFormatting.RED + "Semiirrompible");
		
		super.addInformation(stack, player, tooltip, advanced);
	}
}
