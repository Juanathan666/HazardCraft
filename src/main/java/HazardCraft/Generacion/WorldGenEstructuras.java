package HazardCraft.Generacion;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Util.IEstructuras;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class WorldGenEstructuras extends WorldGenerator implements IEstructuras {

	public static String nombre_estructura;
	
	public WorldGenEstructuras(String name){
		
		this.nombre_estructura = name;
		
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
	this.generar_estructura(world, pos);
		return true;
	}
	
	public static void generar_estructura(World world, BlockPos pos) {
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldServer.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(HazardCraft.MODID, nombre_estructura);
		Template template = manager.get(mcServer, location);
		
		if(template !=null) {
			IBlockState state = world.getBlockState(pos);
		    world.notifyBlockUpdate(pos, state, state, 3);
		    template.addBlocksToWorldChunk(world, pos, setting);
		}
	}
	
}
