package HazardCraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import CreativeTabs.HazardCraftTab_Armaduras;
import CreativeTabs.HazardCraftTab_Bloques;
import CreativeTabs.HazardCraftTab_Herramientas;
import CreativeTabs.HazardCraftTab_Magia;
import CreativeTabs.HazardCraftTab_Minerales;
import CreativeTabs.HazardCraftTab_Varitas;
import Eventos.Eventos_Principal;
import Eventos.HazardCraftTabEventos;
import HazardCraft.Actualizaciones.Buscar_Actualizaciones;
import HazardCraft.Actualizaciones.TestearActualizaciones;
import HazardCraft.Biomas.Biomas;
import HazardCraft.CambiosMecanicas.Eventos;
import HazardCraft.CambiosMecanicas.cambiar_stack;
import HazardCraft.CambiosMecanicas.nonadar;
import HazardCraft.Crafteos.Horno.End.Crafteos_Horno_End;
import HazardCraft.Crafteos.Horno.Nether.Crafteos_Hornos_Nether;
import HazardCraft.Crafteos.Horno.OverWorld.Crafteos_Hornos_OverWorld;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Arena;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Madera;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Menas;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Obsidiana;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Piedra;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Terracota;
import HazardCraft.Dropeos.Bloques.OverWorld.Dropeos_Tierra;
import HazardCraft.Encantamientos.Registrar_encantamiento;
import HazardCraft.Entidades.Generar.Generar_Principal;
import HazardCraft.Generacion.Registrar_generacion_estructuras;
import HazardCraft.Generacion.generacion_normal;
import HazardCraft.Iniciar.Entidades;
import HazardCraft.Iniciar.Entidades_Render;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Armaduras.End.Registrar_Armaduras_End;
import HazardCraft.Items.Armaduras.Nether.Registrar_Armaduras_Nether;
import HazardCraft.Items.Armaduras.OverWorld.Registrar_Armaduras_OverWorld;
import HazardCraft.Items.Herramientas.End.Registrar_Herramientas_End;
import HazardCraft.Items.Herramientas.Nether.Registrar_Herramientas_Nether;
import HazardCraft.Items.Herramientas.OverWorld.Registrar_Herramientas_OverWorld;
import HazardCraft.Pociones.Pociones;
import HazardCraft.Proxy.ClientProxy;
import HazardCraft.Proxy.CommonProxy;
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
    public static CreativeTabs HazardCraftTab_Magia = new HazardCraftTab_Magia(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Magia", 4);
    public static CreativeTabs HazardCraftTab_Varitas = new HazardCraftTab_Varitas(CreativeTabs.getNextID(), MODID, "HazardCraftTab_Varitas", 5);
    public static CreativeTabs EventosTab = new HazardCraftTabEventos(CreativeTabs.getNextID(), MODID, "EventosTab", 6);
    
    public static final Logger logger = LogManager.getFormatterLogger("HazardCraft");
    public static boolean cliente;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	//GameRegistry.registerWorldGenerator(new Registrar_generacion_estructuras(), 0);
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
    	
    	
        //MinecraftForge.EVENT_BUS.register(new Pollos());
        //MinecraftForge.EVENT_BUS.register(new DropeoBloquesMinecraft());
        MinecraftForge.EVENT_BUS.register(new Eventos());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Madera());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Piedra());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Tierra());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Menas());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Arena());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Terracota());
        MinecraftForge.EVENT_BUS.register(new Dropeos_Obsidiana());
        
        if(cliente) 
        {
        	MinecraftForge.EVENT_BUS.register(new nonadar());
        }
        
        MinecraftForge.EVENT_BUS.register(new Registrar_encantamiento());
       
    	Registrar_Armaduras_OverWorld.Registar_Armadura();   
    	Registrar_Armaduras_Nether.Registar_Armadura();
    	Registrar_Armaduras_End.Registar_Armadura();

    	
    	Registrar_Herramientas_OverWorld.Registrar_Herramientas();
    	Registrar_Herramientas_Nether.Registrar_Herramientas();
    	Registrar_Herramientas_End.Registrar_Herramientas();
    	Biomas.registarBiomas();
    	cambiar_stack.iniciar();
    	Pociones.iniciar();
    	Entidades.iniciar_entidades();
    	if(cliente) {
    	Entidades_Render.registrar_modelos();
    	}
    	Generar_Principal.iniciar();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Proxy.init();
    	Eventos_Principal.eventos_init();
    	ClientProxy.RegistrarInterfaces();
        Sonidos.Iniciar();
        
        Crafteos_Hornos_OverWorld.Iniciar();
        Crafteos_Hornos_Nether.Iniciar();
        Crafteos_Horno_End.Iniciar();
    }
    
    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {
    	Eventos_Principal.eventos_post_init();
    	
    }
}
