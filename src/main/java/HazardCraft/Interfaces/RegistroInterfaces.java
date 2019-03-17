package HazardCraft.Interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class RegistroInterfaces implements IGuiHandler
{
	@Override 
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
        BlockPos pos = null;

        if(ID == 1)
        {
            return ID == 1  ? new LibroContainer(player.inventory, world, pos) : null;
        }
        
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

        return null;
    }
}
