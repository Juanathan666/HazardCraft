package HazardCraft.Energia;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Energia.TileEntity.TileEntity_Energia;
import HazardCraft.Energia.TileEntity.TileEntity_Generador;
import HazardCraft.Interfaces.RegistroInterfaces;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Generador_de_Carbon extends Registro_Bloques implements ITileEntityProvider {

	public Generador_de_Carbon(String name, Material material) {
		super(name, material);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		
		if(!world.isRemote) {
			
			player.openGui(HazardCraft.instance, RegistroInterfaces.Generador_interfaz, player.world, (int)player.posX, (int)player.posY, (int)player.posZ);
		}
		return true;
	}

	@Override
	public boolean hasTileEntity() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		// TODO Auto-generated method stub
		return new TileEntity_Generador();
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntity_Generador();
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
	
		TileEntity_Generador tileentity = (TileEntity_Generador)world.getTileEntity(pos);
		world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), tileentity.handler.getStackInSlot(0)));
		super.breakBlock(world, pos, state);
	}
	
}
