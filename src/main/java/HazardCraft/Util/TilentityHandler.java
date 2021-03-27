package HazardCraft.Util;

import HazardCraft.HazardCraft;
import HazardCraft.Energia.TileEntity.TileEntity_Generador;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TilentityHandler {

	
	public static void registerTileEntities() {
		
		GameRegistry.registerTileEntity(TileEntity_Generador.class, new ResourceLocation(HazardCraft.MODID + ":generador_de_carbon"));
		
	}
}
