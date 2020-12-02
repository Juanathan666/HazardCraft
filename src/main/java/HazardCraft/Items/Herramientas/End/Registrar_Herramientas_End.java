package HazardCraft.Items.Herramientas.End;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Herramientas.Base.Herramientas_Azada_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Espada_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Hacha_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Pala_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Pico_Base;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Registrar_Herramientas_End 
{
	public static Item pico_de_enderita;
	public static Item espada_de_enderita;
	public static Item azada_de_enderita;
	public static Item pala_de_enderita;
	public static Item hacha_de_enderita;
	
	
	/*Materiales (nivel, durabilidad, eficiencia, daño, nivel encantamiento) Al daño puesto minecraft le suma 1 a la pala, 2 al pico, 3 al hacha y 4 a la espada.
		WOOD(0, 59, 2.0F, 0.0F, 15)
		GOLD(0, 32, 12.0F, 0.0F, 22)
		STONE(1, 131, 4.0F, 1.0F, 5)
		IRON(2, 250, 6.0F, 2.0F, 14)
		DIAMOND(3, 1561, 8.0F, 3.0F, 10)
	 */
	
	public static final ToolMaterial Materialenderita = EnumHelper.addToolMaterial(HazardCraft.MODID + ":enderitatool", 5, 3100, 12.0F, 5.0F, 45);

	
	public static void Registrar_Herramientas()
	{
		pico_de_enderita = new Herramientas_Pico_Base(Materialenderita, "pico_de_enderita");
		espada_de_enderita = new Herramientas_Espada_Base(Materialenderita, "espada_de_enderita");
		hacha_de_enderita = new Herramientas_Hacha_Base(Materialenderita, "hacha_de_enderita");
		pala_de_enderita = new Herramientas_Pala_Base(Materialenderita, "pala_de_enderita");
		azada_de_enderita = new Herramientas_Azada_Base(Materialenderita, "azada_de_enderita");
	}
}
