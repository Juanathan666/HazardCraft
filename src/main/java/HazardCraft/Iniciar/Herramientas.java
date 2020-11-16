package HazardCraft.Iniciar;



import HazardCraft.HazardCraft;
import HazardCraft.Util.Herramientas_Azada_Base;
import HazardCraft.Util.Herramientas_Espada_Base;
import HazardCraft.Util.Herramientas_Hacha_Base;
import HazardCraft.Util.Herramientas_Pala_Base;
import HazardCraft.Util.Herramientas_Pico_Base;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Herramientas {
	
    //Herramientas
	
	public static Item pico_de_netherita;
	public static Item espada_de_netherita;
	public static Item azada_de_netherita;
	public static Item pala_de_netherita;
	public static Item hacha_de_netherita;
	
	public static Item pico_de_enderita;
	public static Item espada_de_enderita;
	public static Item azada_de_enderita;
	public static Item pala_de_enderita;
	public static Item hacha_de_enderita;
	
	
	//ToolMaterial
	
	public static final ToolMaterial Materialnetherita = EnumHelper.addToolMaterial(HazardCraft.MODID + ":netheritatool", 4, 3000, 10.0F, 4.0F, 45);
	public static final ToolMaterial Materialenderita = EnumHelper.addToolMaterial(HazardCraft.MODID + ":enderitatool", 5, 3100, 12.0F, 5.0F, 45);

	
	public static void Registrar_Herramientas(){
		
		pico_de_netherita = new Herramientas_Pico_Base(Materialnetherita, "pico_de_netherita");
		espada_de_netherita = new Herramientas_Espada_Base(Materialnetherita, "espada_de_netherita");
		hacha_de_netherita = new Herramientas_Hacha_Base(Materialnetherita, "hacha_de_netherita");
		pala_de_netherita = new Herramientas_Pala_Base(Materialnetherita, "pala_de_netherita");
		azada_de_netherita = new Herramientas_Azada_Base(Materialnetherita, "azada_de_netherita");
		
		pico_de_enderita = new Herramientas_Pico_Base(Materialenderita, "pico_de_enderita");
		espada_de_enderita = new Herramientas_Espada_Base(Materialenderita, "espada_de_enderita");
		hacha_de_enderita = new Herramientas_Hacha_Base(Materialenderita, "hacha_de_enderita");
		pala_de_enderita = new Herramientas_Pala_Base(Materialenderita, "pala_de_enderita");
		azada_de_enderita = new Herramientas_Azada_Base(Materialenderita, "azada_de_enderita");

		
		
	}
	

	
	
	
}
