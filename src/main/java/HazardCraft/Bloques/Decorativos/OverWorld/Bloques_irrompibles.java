package HazardCraft.Bloques.Decorativos.OverWorld;

import java.util.List;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Bloques_irrompibles extends Registro_Bloques 
{

	public Bloques_irrompibles(String name, Material material) 
	{
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Bloques);
		setBlockUnbreakable();
		setResistance(Float.MAX_VALUE);
		setSoundType(SoundType.STONE);
	}
	
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		
		tooltip.add(TextFormatting.RED + "Irrompible");
		
		super.addInformation(stack, player, tooltip, advanced);
	}
}