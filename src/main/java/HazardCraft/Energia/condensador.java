package HazardCraft.Energia;

import HazardCraft.Bloques.Registrar.Bloques_Arboles;
import HazardCraft.Bloques.Registrar.Bloques_End_Menas;
import HazardCraft.Bloques.Registrar.Bloques_Nether_Menas;
import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Menas;
import HazardCraft.Bloques.Registrar.Bloques_Overworld_Plantas;
import HazardCraft.Items.Registrar.Items_OverWorld;
import HazardCraft.Util.Modelos;
import net.minecraft.item.ItemBlock;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.energy.EnergyStorage;

public class condensador extends EnergyStorage implements Modelos {

	

	
	  public condensador(int capacity)
	    {
	        super(capacity, capacity, capacity, 0);
	    }

	    public condensador(int capacity, int maxTransfer)
	    {
	        super(capacity, maxTransfer, maxTransfer, 0);
	    }

	    public condensador(int capacity, int maxReceive, int maxExtract)
	    {
	        super(capacity, maxReceive, maxExtract, 0);
	    }

	    public condensador(int capacity, int maxReceive, int maxExtract, int energy) {
	    	
	    	super(capacity, maxReceive, maxExtract, energy);
	    	
	    }
	
	
	    @Override
	    public int receiveEnergy(int maxReceive, boolean simulate) {
	    	// TODO Auto-generated method stub
	    	return super.receiveEnergy(maxReceive, simulate);
	    }
	    
	    
	    @Override
	    public int extractEnergy(int maxExtract, boolean simulate) {
	    	// TODO Auto-generated method stub
	    	return super.extractEnergy(maxExtract, simulate);
	    }
	    
	    @Override
	    public int getEnergyStored() {
	    	// TODO Auto-generated method stub
	    	return super.getEnergyStored();
	    }
	    
	    @Override
	    public boolean canReceive() {
	    	// TODO Auto-generated method stub
	    	return super.canReceive();
	    }
	    
	    public void readFromNBT(NBTTagCompound compound) {
	    	
	    	this.energy = compound.getInteger("Energy");
	    	this.capacity = compound.getInteger("Capacity");
	    	this.maxReceive = compound.getInteger("MaxReceive");
	    	this.maxExtract = compound.getInteger("MaxExtract");
	    	
	    	
	    }
	    
	    public void writetoNBT(NBTTagCompound compound) {
	    	
	    	compound.setInteger("Energy", this.energy);
	    	compound.setInteger("Capacity", this.capacity);
	    	compound.setInteger("MaxReceive", this.maxReceive);
	    	compound.setInteger("MaxExtract", this.maxExtract);
	    }
	    
	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}

}
