package MuerteEntidades;

import java.util.Random;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Pollos 
{
	@SubscribeEvent
    public void Dropeo(LivingDropsEvent event)
	{
		System.out.println(event.getEntity().getName());
		
		if (event.getEntity() instanceof EntityChicken && event.getSource().getDamageType() == "player")
        {
			event.getDrops().clear();
			
			int looting = EnchantmentHelper.getLootingModifier(event.getEntityLiving().getAttackingEntity()); //Variable para tomar el nivel de looting de la espada del jugador.
			
			int probabilidad;
			Random rand = new Random();
			int tope = 70;
			
        	probabilidad = rand.nextInt(100);
        	
			int CantidadPollos;
			int CantidadPlumas;
			
			CantidadPollos = 1;
			CantidadPlumas = 1 + rand.nextInt(4);
    		
    		if (looting == 0)
    		{
    			if(probabilidad < 60)
    			{
    				CantidadPollos = 0;
    			}
    			
    			else if (probabilidad >= 60)
    			{
    				CantidadPollos = 1;
    			}
    			
    			tope = 70;
    		}
        	
        	if (looting > 0)
        	{
        		tope = tope - (looting * 10);
        		
        		CantidadPollos = CantidadPollos * looting;
        		CantidadPlumas = CantidadPlumas * looting;
        	}
        	
        	if (probabilidad <= tope)
        	{
        		event.getEntity().world.createExplosion(event.getEntity(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 2.7f, true); //Spawn de explosion al morir.
        	}
    		
    		event.getEntityLiving().dropItem(Items.CHICKEN, CantidadPollos);
    		event.getEntityLiving().dropItem(Items.FEATHER, CantidadPlumas);
        }
    }
}


/*//Spawn de rayo al morir

Entity nombre = new EntityLightningBolt(event.getEntity().world,event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, false);
event.getEntity().world.spawnEntity(nombre);

//Spawn de bola de fuego con explosion

Entity prueba = new EntityFireball(event.getEntity().world, event.getEntity().posX, event.getEntity().posY + 10, event.getEntity().posZ, 0, -1, 0) 
{
	@Override
	protected void onImpact(RayTraceResult result) 
	{
		event.getEntity().world.createExplosion(event.getEntity(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 2.7f, true);
	}
};

event.getEntity().world.spawnEntity(prueba);*/


