package HazardCraft;

import org.apache.logging.log4j.Logger;

import HazardCraft.CambiosMecanicas.Eventos;
import HazardCraft.CambiosMecanicas.Registrar_encantamiento;
import HazardCraft.CambiosMecanicas.nonadar;
import HazardCraft.Iniciar.Armaduras;
import HazardCraft.Proxy.ClientProxy;
import HazardCraft.Proxy.CommonProxy;
import MuerteEntidades.Pollos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = HazardCraft.MODID, name = HazardCraft.NAME, version = HazardCraft.VERSION)

public class HazardCraft 
{
	@Instance
	public static HazardCraft instance;
	
	@SidedProxy (clientSide = "HazardCraft.Proxy.ClientProxy",serverSide = "HazardCraft.Proxy.Serverproxy")
	public static CommonProxy Proxy;
	
    public static final String MODID = "hc";
    public static final String NAME = "HazardCraft";
    public static final String VERSION = "1.0";
    public static CreativeTabs HazardCraftTab = new HazardCraftTab(CreativeTabs.getNextID(), MODID, MODID + "." + "HazardCraftTab", 0);	

    private static Logger logger;
    public static boolean cliente;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	if(event.getSide()==Side.CLIENT) {
    		cliente = true;
    	}else {
    		cliente = false;
    	}
    			
    	
        MinecraftForge.EVENT_BUS.register(new Pollos());
        MinecraftForge.EVENT_BUS.register(new DropeoBloquesMinecraft());
        MinecraftForge.EVENT_BUS.register(new Eventos());
        if(cliente) {
        MinecraftForge.EVENT_BUS.register(new nonadar());
        }
        MinecraftForge.EVENT_BUS.register(new Registrar_encantamiento());
        Armaduras.Registar_Armadura();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Proxy.init();
    	
    	ClientProxy.RegistrarInterfaces();
    }
    
    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {
        
    }
}
