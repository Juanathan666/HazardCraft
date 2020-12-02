package HazardCraft.Items.Herramientas.Nether;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Herramientas.Base.Herramientas_Azada_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Espada_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Hacha_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Pala_Base;
import HazardCraft.Items.Herramientas.Base.Herramientas_Pico_Base;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Registrar_Herramientas_Nether 
{
	public static Item pico_de_netherita;
	public static Item espada_de_netherita;
	public static Item azada_de_netherita;
	public static Item pala_de_netherita;
	public static Item hacha_de_netherita;
	
	
	/*Materiales (nivel, durabilidad, eficiencia, daño, nivel encantamiento) Al daño puesto minecraft le suma 1 a la pala, 2 al pico, 3 al hacha y 4 a la espada.
		WOOD(0, 59, 2.0F, 0.0F, 15)
		GOLD(0, 32, 12.0F, 0.0F, 22)
		STONE(1, 131, 4.0F, 1.0F, 5)
		IRON(2, 250, 6.0F, 2.0F, 14)
		DIAMOND(3, 1561, 8.0F, 3.0F, 10)
	 */
	public static final ToolMaterial Materialnetherita = EnumHelper.addToolMaterial(HazardCraft.MODID + ":netheritatool", 4, 3000, 10.0F, 4.0F, 45);

	
	public static void Registrar_Herramientas()
	{
		pico_de_netherita = new Herramientas_Pico_Base(Materialnetherita, "pico_de_netherita");
		espada_de_netherita = new Herramientas_Espada_Base(Materialnetherita, "espada_de_netherita");
		hacha_de_netherita = new Herramientas_Hacha_Base(Materialnetherita, "hacha_de_netherita");
		pala_de_netherita = new Herramientas_Pala_Base(Materialnetherita, "pala_de_netherita");
		azada_de_netherita = new Herramientas_Azada_Base(Materialnetherita, "azada_de_netherita");
	}
}
