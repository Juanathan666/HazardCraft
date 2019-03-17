package HazardCraft.Proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import HazardCraft.HazardCraft;
import HazardCraft.Interfaces.RegistroInterfaces;

public class ClientProxy extends CommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	//@Override
	public static void RegistrarInterfaces()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(HazardCraft.instance, new RegistroInterfaces());
	}
}
