package HazardCraft;

import org.apache.logging.log4j.Logger;

import HazardCraft.Iniciar.Bloques;
import HazardCraft.Proxy.ClientProxy;
import HazardCraft.Proxy.CommonProxy;
import MuerteEntidades.Pollos;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = HazardCraft.MODID, name = HazardCraft.NAME, version = HazardCraft.VERSION)

public class HazardCraft 
{
	@Instance
	public static HazardCraft instance;
	
	@SidedProxy (clientSide = "HazardCraft.Proxy.ClientProxy",serverSide = "HazardCraft.Proxy.ServerProxy")
	public static CommonProxy Proxy;
	
    public static final String MODID = "hc";
    public static final String NAME = "HazardCraft";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new Pollos());
        MinecraftForge.EVENT_BUS.register(new DropeoBloquesMinecraft());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ClientProxy.RegistrarInterfaces();
    }
    
    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {
        
    }
}
