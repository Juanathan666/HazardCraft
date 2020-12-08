package HazardCraft.Entidades.Modelos;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Enano - Juanathan
 * Created using Tabula 7.1.0
 */
public class Enano_Modelo extends ModelBase {
    public ModelRenderer PiernaDerecha;
    public ModelRenderer PiernaIzquierda;
    public ModelRenderer Cuerpo;
    public ModelRenderer Cabeza;
    public ModelRenderer BrazoDerecho;
    public ModelRenderer BrazoIzquierdo;
    public ModelRenderer CejaDerecha;
    public ModelRenderer CejaIzquierda;
    public ModelRenderer Nariz;
    public ModelRenderer Barba1;
    public ModelRenderer Barba2;
    public ModelRenderer Barba3;
    public ModelRenderer Barba4;
    public ModelRenderer Barba5;
    public ModelRenderer Barba6;
    public ModelRenderer Barba7;
    public ModelRenderer Barba8;
    public ModelRenderer Barba9;
    public ModelRenderer Barba10;

    public Enano_Modelo() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Barba6 = new ModelRenderer(this, 35, 14);
        this.Barba6.setRotationPoint(-1.0F, 4.0F, 1.0F);
        this.Barba6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.BrazoIzquierdo = new ModelRenderer(this, 42, 0);
        this.BrazoIzquierdo.setRotationPoint(4.0F, 8.0F, -2.0F);
        this.BrazoIzquierdo.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.CejaDerecha = new ModelRenderer(this, 0, 13);
        this.CejaDerecha.setRotationPoint(4.0F, 1.0F, -1.0F);
        this.CejaDerecha.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Barba2 = new ModelRenderer(this, 19, 17);
        this.Barba2.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.Barba2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.Barba10 = new ModelRenderer(this, 50, 12);
        this.Barba10.setRotationPoint(6.0F, 3.0F, 0.0F);
        this.Barba10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Barba5 = new ModelRenderer(this, 21, 13);
        this.Barba5.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.Barba5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Barba4 = new ModelRenderer(this, 45, 17);
        this.Barba4.setRotationPoint(2.0F, 8.0F, -1.0F);
        this.Barba4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.PiernaIzquierda = new ModelRenderer(this, 0, 20);
        this.PiernaIzquierda.setRotationPoint(0.0F, 16.0F, -2.0F);
        this.PiernaIzquierda.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.Barba8 = new ModelRenderer(this, 40, 13);
        this.Barba8.setRotationPoint(6.0F, 4.0F, 0.0F);
        this.Barba8.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Barba7 = new ModelRenderer(this, 26, 12);
        this.Barba7.setRotationPoint(-1.0F, 3.0F, 0.0F);
        this.Barba7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Barba3 = new ModelRenderer(this, 34, 17);
        this.Barba3.setRotationPoint(1.0F, 7.0F, -1.0F);
        this.Barba3.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.Cuerpo = new ModelRenderer(this, 34, 20);
        this.Cuerpo.setRotationPoint(-4.0F, 8.0F, -2.0F);
        this.Cuerpo.addBox(0.0F, 0.0F, 0.0F, 8, 8, 4, 0.0F);
        this.BrazoDerecho = new ModelRenderer(this, 25, 0);
        this.BrazoDerecho.setRotationPoint(-8.0F, 8.0F, -2.0F);
        this.BrazoDerecho.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.PiernaDerecha = new ModelRenderer(this, 17, 20);
        this.PiernaDerecha.setRotationPoint(-4.0F, 16.0F, -2.0F);
        this.PiernaDerecha.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.CejaIzquierda = new ModelRenderer(this, 7, 13);
        this.CejaIzquierda.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.CejaIzquierda.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Barba1 = new ModelRenderer(this, 0, 16);
        this.Barba1.setRotationPoint(-1.0F, 4.0F, -1.0F);
        this.Barba1.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
        this.Cabeza = new ModelRenderer(this, 0, 0);
        this.Cabeza.setRotationPoint(-3.0F, 2.0F, -3.0F);
        this.Cabeza.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.Nariz = new ModelRenderer(this, 14, 13);
        this.Nariz.setRotationPoint(2.0F, 3.0F, -1.0F);
        this.Nariz.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Barba9 = new ModelRenderer(this, 45, 14);
        this.Barba9.setRotationPoint(6.0F, 4.0F, 1.0F);
        this.Barba9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Cabeza.addChild(this.Barba6);
        this.Cabeza.addChild(this.CejaDerecha);
        this.Cabeza.addChild(this.Barba2);
        this.Cabeza.addChild(this.Barba10);
        this.Cabeza.addChild(this.Barba5);
        this.Cabeza.addChild(this.Barba4);
        this.Cabeza.addChild(this.Barba8);
        this.Cabeza.addChild(this.Barba7);
        this.Cabeza.addChild(this.Barba3);
        this.Cabeza.addChild(this.CejaIzquierda);
        this.Cabeza.addChild(this.Barba1);
        this.Cabeza.addChild(this.Nariz);
        this.Cabeza.addChild(this.Barba9);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BrazoIzquierdo.render(f5);
        this.PiernaIzquierda.render(f5);
        this.Cuerpo.render(f5);
        this.BrazoDerecho.render(f5);
        this.PiernaDerecha.render(f5);
        this.Cabeza.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    /*public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }*/
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
  	  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  	    
  	  this.Cabeza.rotateAngleX = f4 / (180F / (float)Math.PI);
  	  this.BrazoDerecho.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
  	  this.BrazoIzquierdo.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
  	  this.BrazoDerecho.rotateAngleZ = 0.0F;
  	  this.BrazoIzquierdo.rotateAngleZ = 0.0F;
  	  this.PiernaDerecha.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  	  this.PiernaIzquierda.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  	  this.PiernaDerecha.rotateAngleY = 0.0F;
  	  this.PiernaIzquierda.rotateAngleY = 0.0F;
  	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
