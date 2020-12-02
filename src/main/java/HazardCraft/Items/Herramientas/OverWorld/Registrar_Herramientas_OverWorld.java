package HazardCraft.Items.Herramientas.OverWorld;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Herramientas.Base.Herramientas_Azada_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Espada_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Hacha_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Pala_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Pico_Base;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Registrar_Herramientas_OverWorld 
{
	public static Item espada_de_estano;
	public static Item pico_de_estano;
	public static Item hacha_de_estano;
	public static Item pala_de_estano;
	public static Item azada_de_estano;
	
	public static Item espada_de_cobre;
	public static Item pico_de_cobre;
	public static Item hacha_de_cobre;
	public static Item pala_de_cobre;
	public static Item azada_de_cobre;
	
	public static Item espada_de_zafiro;
	public static Item pico_de_zafiro;
	public static Item hacha_de_zafiro;
	public static Item pala_de_zafiro;
	public static Item azada_de_zafiro;
	
	
	/*Materiales (nivel, durabilidad, eficiencia, daño, nivel encantamiento) Al daño puesto minecraft le suma 1 a la pala, 2 al pico, 3 al hacha y 4 a la espada.
		WOOD(0, 59, 2.0F, 0.0F, 15)
    	GOLD(0, 32, 12.0F, 0.0F, 22)
    	STONE(1, 131, 4.0F, 1.0F, 5)
    	IRON(2, 250, 6.0F, 2.0F, 14)
    	DIAMOND(3, 1561, 8.0F, 3.0F, 10)
	*/
	

	public static final ToolMaterial Materialestano = EnumHelper.addToolMaterial(HazardCraft.MODID + ":estanotool", 0, 28, 3.0F, 0.5F, 5);
	public static final ToolMaterial Materialcobre = EnumHelper.addToolMaterial(HazardCraft.MODID + ":cobretool", 0, 35, 3.0F, 1.5F, 5);
	public static final ToolMaterial Materialzafiro = EnumHelper.addToolMaterial(HazardCraft.MODID + ":zafirotool", 3, 1250, 7.0F, 2.5F, 45);
	
	public static void Registrar_Herramientas()
	{
		espada_de_estano = new Herramientas_Espada_Base(Materialestano, "espada_de_estano");
		pico_de_estano = new Herramientas_Pico_Base(Materialestano, "pico_de_estano");
		hacha_de_estano = new Herramientas_Hacha_Base(Materialestano, "hacha_de_estano");
		pala_de_estano = new Herramientas_Pala_Base(Materialestano, "pala_de_estano");
		azada_de_estano = new Herramientas_Azada_Base(Materialestano, "azada_de_estano");
		
		espada_de_cobre = new Herramientas_Espada_Base(Materialcobre, "espada_de_cobre");
		pico_de_cobre = new Herramientas_Pico_Base(Materialcobre, "pico_de_cobre");
		hacha_de_cobre = new Herramientas_Hacha_Base(Materialcobre, "hacha_de_cobre");
		pala_de_cobre = new Herramientas_Pala_Base(Materialcobre, "pala_de_cobre");
		azada_de_cobre = new Herramientas_Azada_Base(Materialcobre, "azada_de_cobre");
		
		espada_de_zafiro = new Herramientas_Espada_Base(Materialzafiro, "espada_de_zafiro");
		pico_de_zafiro = new Herramientas_Pico_Base(Materialzafiro, "pico_de_zafiro");
		hacha_de_zafiro = new Herramientas_Hacha_Base(Materialzafiro, "hacha_de_zafiro");
		pala_de_zafiro = new Herramientas_Pala_Base(Materialzafiro, "pala_de_zafiro");
		azada_de_zafiro = new Herramientas_Azada_Base(Materialzafiro, "azada_de_zafiro");
	}
}
