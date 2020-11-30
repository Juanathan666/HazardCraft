package HazardCraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import CreativeTabs.HazardCraftTab_Armaduras;
import CreativeTabs.HazardCraftTab_Bloques;
import CreativeTabs.HazardCraftTab_Herramientas;
import CreativeTabs.HazardCraftTab_Minerales;
import CreativeTabs.HazardCraftTab_Varitas;
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
import HazardCraft.Iniciar.Crafteos_Hornos;
import HazardCraft.Iniciar.Entidades;
import HazardCraft.Iniciar.Entidades_Render;
import HazardCraft.Iniciar.Pociones;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Armaduras.Base.Armaduras;
import HazardCraft.Items.Herramientas.Base.Herramientas;
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
    
    public static CreativeTabs HazardCraftTab_Bloques = new HazardCraftTab_Bloques(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Bloques", 0);	
    public static CreativeTabs HazardCraftTab_Minerales = new HazardCraftTab_Minerales(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Minerales", 1);
    public static CreativeTabs HazardCraftTab_Herramientas = new HazardCraftTab_Herramientas(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Herramientas", 2);
    public static CreativeTabs HazardCraftTab_Armaduras = new HazardCraftTab_Armaduras(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Armaduras", 3);
    public static CreativeTabs HazardCraftTab_Varitas = new HazardCraftTab_Varitas(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Varitas", 4);
    public static CreativeTabs EventosTab = new HazardCraftTabEventos(CreativeTabs.getNextID(), MODID, "EventosTab", 5);
    
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
    	
    	if(event.getSide()==Side.CLIENT) 
    	{
    		cliente = true;
    	}
    	else 
    	{
    		cliente = false;
    	}
    	
    	
        MinecraftForge.EVENT_BUS.register(new Pollos());
        MinecraftForge.EVENT_BUS.register(new DropeoBloquesMinecraft());
        MinecraftForge.EVENT_BUS.register(new Eventos());
        
        if(cliente) 
        {
        	MinecraftForge.EVENT_BUS.register(new nonadar());
        }
        
        MinecraftForge.EVENT_BUS.register(new Registrar_encantamiento());
       
    	Armaduras.Registar_Armadura();
    	Herramientas.Registrar_Herramientas();
    	cambiar_stack.iniciar();
    	Pociones.iniciar();
    	Entidades.iniciar_entidades();
    	Entidades_Render.registrar_modelos();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Proxy.init();
    	Eventos_Principal.eventos_init();
    	ClientProxy.RegistrarInterfaces();
        Crafteos_Hornos.iniciar();
        Sonidos.Iniciar();
    }
    
    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {
    	Eventos_Principal.eventos_post_init();
    	
    }
}
