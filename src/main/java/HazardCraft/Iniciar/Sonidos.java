package HazardCraft.Iniciar;

import HazardCraft.HazardCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Sonidos {


	public static SoundEvent bloque_de_netherita_romper;
	public static SoundEvent bloque_de_netherita_colocar;
	public static SoundEvent bloque_de_netherita_andar;
    public static SoundEvent armadura_de_netherita_poner;
    public static SoundEvent romper_varita;
    public static SoundEvent enano_muerte;
    public static SoundEvent enano_atacado;

	public static void Iniciar(){
		
		bloque_de_netherita_romper = registrar("block.bloque_de_netherita_romper");
		bloque_de_netherita_colocar = registrar("block.bloque_de_netherita_colocar");
		bloque_de_netherita_andar = registrar("block.bloque_de_netherita_andar");
		armadura_de_netherita_poner = registrar("armor.armadura_de_netherita_poner");
		romper_varita = registrar("item.romper_varita");
		enano_muerte = registrar("entity.enano_muerte");
		enano_atacado = registrar("entity.enano_atacado");
		

	}
	public static SoundEvent registrar(String name){
		ResourceLocation location = new ResourceLocation(HazardCraft.MODID, name);
		SoundEvent e = new SoundEvent(location);
		e.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(e);
		
		return e;
	}

	
}
