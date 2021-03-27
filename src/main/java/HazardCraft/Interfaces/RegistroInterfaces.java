package HazardCraft.Interfaces;

import HazardCraft.Energia.Container.Container_Generador_de_carbon;
import HazardCraft.Energia.TileEntity.TileEntity_Generador;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class RegistroInterfaces implements IGuiHandler
{
	
	public static int Generador_interfaz = 2;
	
	@Override 
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
        BlockPos pos = null;

        if(ID == 1)
        {
            return ID == 1  ? new LibroContainer(player.inventory, world, pos) : null;
        }
		if(ID == this.Generador_interfaz) return new Container_Generador_de_carbon(player.inventory, (TileEntity_Generador)world.getTileEntity(new BlockPos(x,y,z)));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
    {
        BlockPos pos = null;

        if(ID == 1)
        {
            return ID == 1  ? new Interfaz1(player.inventory, world, pos) : null;
        }
		if(ID == this.Generador_interfaz) return new Generador_De_Carbon_gui(player.inventory, (TileEntity_Generador)world.getTileEntity(new BlockPos(x,y,z)));

        return null;
    }
}
