package HazardCraft.Entidades.Modelos;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Espiritu ancestral - Juanathan
 * Created using Tabula 7.1.0
 */
public class Espiritu_Ancestral_Modelo extends ModelBase 
{
    public ModelRenderer Cuerpo;
    public ModelRenderer Cabeza;

    
    public Espiritu_Ancestral_Modelo() 
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Cuerpo = new ModelRenderer(this, 0, 0);
        this.Cuerpo.setRotationPoint(-6.0F, 4.0F, 0.0F);
        this.Cuerpo.addBox(0.0F, 0.0F, -2.0F, 12, 16, 4, 0.0F);
        this.Cabeza = new ModelRenderer(this, 0, 21);
        this.Cabeza.setRotationPoint(-4.0F, -4.0F, -4.0F);
        this.Cabeza.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    }

    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.Cuerpo.render(f5);
        this.Cabeza.render(f5);
    }

    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  	    
    	this.Cuerpo.rotateAngleX = f1;
  	  //this.Cuerpo.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
  	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
