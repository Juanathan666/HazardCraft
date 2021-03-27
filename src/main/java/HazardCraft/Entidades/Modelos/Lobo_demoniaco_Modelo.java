package HazardCraft.Entidades.Modelos;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Lobo_demoniaco - Undefined
 * Created using Tabula 7.1.0
 */
public class Lobo_demoniaco_Modelo extends ModelBase {
    public ModelRenderer Cabeza;
    public ModelRenderer Cuerpo;
    public ModelRenderer Pata_Del_Izq;
    public ModelRenderer Pata_Del_Der;
    public ModelRenderer Pata_Tra_Izq;
    public ModelRenderer Pata_Tra_Der;
    public ModelRenderer Cola;
    public ModelRenderer Hocico;
    public ModelRenderer Cuerpo2;

    public Lobo_demoniaco_Modelo() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Pata_Tra_Der = new ModelRenderer(this, 48, 50);
        this.Pata_Tra_Der.setRotationPoint(-4.0F, 14.0F, 22.0F);
        this.Pata_Tra_Der.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.Cuerpo2 = new ModelRenderer(this, 42, 16);
        this.Cuerpo2.setRotationPoint(1.0F, 1.0F, 8.0F);
        this.Cuerpo2.addBox(0.0F, 0.0F, 0.0F, 10, 10, 16, 0.0F);
        this.Cuerpo = new ModelRenderer(this, 0, 20);
        this.Cuerpo.setRotationPoint(-6.0F, 3.0F, 4.0F);
        this.Cuerpo.addBox(0.0F, 0.0F, 0.0F, 12, 12, 8, 0.0F);
        this.Pata_Del_Der = new ModelRenderer(this, 16, 50);
        this.Pata_Del_Der.setRotationPoint(-4.0F, 14.0F, 5.0F);
        this.Pata_Del_Der.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.Pata_Del_Izq = new ModelRenderer(this, 0, 50);
        this.Pata_Del_Izq.setRotationPoint(1.0F, 14.0F, 5.0F);
        this.Pata_Del_Izq.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.Hocico = new ModelRenderer(this, 36, 0);
        this.Hocico.setRotationPoint(2.5F, 5.0F, -6.0F);
        this.Hocico.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
        this.Pata_Tra_Izq = new ModelRenderer(this, 32, 50);
        this.Pata_Tra_Izq.setRotationPoint(1.0F, 14.0F, 22.0F);
        this.Pata_Tra_Izq.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.Cola = new ModelRenderer(this, 0, 70);
        this.Cola.setRotationPoint(-2.0F, 6.0F, 28.0F);
        this.Cola.addBox(0.0F, 0.0F, 0.0F, 4, 4, 16, 0.0F);
        this.setRotateAngle(Cola, -0.5235987755982988F, 0.0F, 0.0F);
        this.Cabeza = new ModelRenderer(this, 0, 0);
        this.Cabeza.setRotationPoint(-5.0F, 4.0F, -3.0F);
        this.Cabeza.addBox(0.0F, 0.0F, 0.0F, 10, 10, 7, 0.0F);
        this.Cuerpo.addChild(this.Cuerpo2);
        this.Cabeza.addChild(this.Hocico);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Pata_Tra_Der.render(f5);
        this.Cuerpo.render(f5);
        this.Pata_Del_Der.render(f5);
        this.Pata_Del_Izq.render(f5);
        this.Pata_Tra_Izq.render(f5);
        this.Cola.render(f5);
        this.Cabeza.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    	
    }
}
