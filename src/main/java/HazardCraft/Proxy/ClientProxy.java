package HazardCraft.Proxy;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Armaduras;
import HazardCraft.Interfaces.RegistroInterfaces;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init() {
		Armaduras.registerrender();
		
	}
	
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
