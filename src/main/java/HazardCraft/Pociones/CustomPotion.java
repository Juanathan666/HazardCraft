package HazardCraft.Pociones;

import HazardCraft.HazardCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class CustomPotion extends Potion {

	public CustomPotion(String name,boolean isBadEffectIn, int liquidColorIn, int IcondIndexX, int IconIndexY) {
		super(isBadEffectIn, liquidColorIn);
       setPotionName("effect." + name);
       setIconIndex(IcondIndexX, IconIndexY);
       setRegistryName(new ResourceLocation(HazardCraft.MODID + ":" + name));
		
	}

	@Override
	public boolean hasStatusIcon() {
	Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(HazardCraft.MODID + "texture/gui/potion_effects.png"));
		return true;
	}
	
}
