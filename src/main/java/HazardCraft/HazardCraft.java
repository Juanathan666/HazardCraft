package HazardCraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Eventos.Eventos_Principal;
import Eventos.HazardCraftTabEventos;
import HazardCraft.Actualizaciones.Buscar_Actualizaciones;
import HazardCraft.Actualizaciones.TestearActualizaciones;
import HazardCraft.CambiosMecanicas.DropeoBloquesMinecraft;
import HazardCraft.CambiosMecanicas.Eventos;
import HazardCraft.CambiosMecanicas.cambiar_stack;
import HazardCraft.CambiosMecanicas.nonadar;
import HazardCraft.Encantamientos.Registrar_encantamiento;
import HazardCraft.Generacion.Registrar_generacion_estructuras;
import HazardCraft.Generacion.generacion_normal;
import HazardCraft.Iniciar.Armaduras;
import HazardCraft.Proxy.ClientProxy;
import HazardCraft.Proxy.CommonProxy;
import MuerteEntidades.Pollos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
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
    public static String nombre_mensajes = TextFormatting.GRAY + "[" + TextFormatting.BLUE + "HazardCraft" + TextFormatting.GRAY + "] " + TextFormatting.RESET;
    public static CreativeTabs HazardCraftTab = new HazardCraftTab(CreativeTabs.getNextID(), MODID, MODID + "." + "HazardCraftTab", 0);	
    public static CreativeTabs EventosTab = new HazardCraftTabEventos(CreativeTabs.getNextID(), MODID, "EventosTab", 1);
    public static final Logger logger = LogManager.getFormatterLogger("HazardCraft");
    public static boolean cliente;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new Registrar_generacion_estructuras(), 0);
    	GameRegistry.registerWorldGenerator(new generacion_normal(), 3);
    Eventos_Principal.eventos_preinit();
    Buscar_Actualizaciones.MirarActualizaciones();
    MinecraftForge.EVENT_BUS.register(new TestearActualizaciones());
    //Mira si el mod se esta ejecutando en un servidor o en un cliente
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
    	cambiar_stack.iniciar();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Proxy.init();
    	Eventos_Principal.eventos_init();
    	ClientProxy.RegistrarInterfaces();

    }
    
    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {
    	Eventos_Principal.eventos_post_init();
    	
    }
}
