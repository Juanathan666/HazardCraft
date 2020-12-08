package HazardCraft.Entidades;

import java.util.Random;
import java.util.UUID;

import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Enano extends EntityMob
{
    /** The attribute which determines the chance that this mob will spawn reinforcements */
    protected static final IAttribute SPAWN_REINFORCEMENTS_CHANCE = (new RangedAttribute((IAttribute)null, "zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).setDescription("Spawn Reinforcements Chance");
    
    private static final UUID BABY_SPEED_BOOST_ID = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final AttributeModifier BABY_SPEED_BOOST = new AttributeModifier(BABY_SPEED_BOOST_ID, "Baby speed boost", 0.5D, 1);
    private static final DataParameter<Boolean> IS_CHILD = EntityDataManager.<Boolean>createKey(Enano.class, DataSerializers.BOOLEAN);
    /**
     * Was the type of villager for zombie villagers prior to 1.11. Now unused. Use {@link
     * EntityZombieVillager#PROFESSION} instead.
     */
    private static final DataParameter<Integer> VILLAGER_TYPE = EntityDataManager.<Integer>createKey(Enano.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> ARMS_RAISED = EntityDataManager.<Boolean>createKey(Enano.class, DataSerializers.BOOLEAN);
    
    private boolean isBreakDoorsTaskSet;
    /** The width of the entity */
    private float zombieWidth = -1.0F;
    /** The height of the the entity. */
    private float zombieHeight;

    
    public Enano(World worldIn)
    {
        super(worldIn);
        this.setSize(0.9F, 1.44F);
    }

    
    @Override
    public boolean getCanSpawnHere() 
    {
    	return super.getCanSpawnHere() && !this.world.canSeeSky(this.getPosition());
    }
    
    
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    
    protected void applyEntityAI()
    {
        //this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
       // this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
      // this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        //this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }

    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
    }

    
    protected void entityInit()
    {
        super.entityInit();
    }


    
    /**
     * Get the experience points the entity currently has.
     */
    protected int getExperiencePoints(EntityPlayer player)
    {
        if (this.isChild())
        {
            this.experienceValue = (int)((float)this.experienceValue * 2.5F);
        }

        return super.getExperiencePoints(player);
    }


    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }


    public boolean attackEntityAsMob(Entity entityIn)
    {
    	 boolean flag = super.attackEntityAsMob(entityIn);

         if (flag)
         {
             float f = this.world.getDifficultyForLocation(new BlockPos(this)).getAdditionalDifficulty();

             if (this.getHeldItemMainhand().isEmpty() && this.isBurning() && this.rand.nextFloat() < f * 0.3F)
             {
                 entityIn.setFire(2 * (int)f);
             }
         }

        return flag;
    }
    

    protected SoundEvent getAmbientSound()
    {
        return null;
    }
    

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return Sonidos.enano_atacado;
    }
    

    protected SoundEvent getDeathSound()
    {
        return Sonidos.enano_muerte;
    }
    

    /*protected SoundEvent getStepSound()
    {
        return SoundEvents.ENTITY_ZOMBIE_STEP;
    }

    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(this.getStepSound(), 0.15F, 1.0F);
    }
    

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    
    
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.ILLAGER;
    } 

    
    public static void registerFixesZombie(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, Enano.class);
    }

   

	@Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) 
    {
    	int prob;
    	
    	int tope1;  // Dropeo piedra
    	int tope2;  // Dropeo lingote iron
    	int tope3;  // Dropeo lingote oro
    	int tope4;  // Dropeo zafiro
    	int tope5;  // Dropeo diamante
    	
    	Random rand = new Random ();
    	
    	prob = rand.nextInt(100); //coge del 0 al 99
    	
    	if (lootingModifier == 0)
    	{
    		tope1 = 84;  // 85%
    		tope2 = 99;  // 15%
    		
    		if (prob <= tope1)
    		{
    			this.entityDropItem(new ItemStack(Blocks.STONE), 1);
    		}
    		
    		else if (prob > tope1 && prob <= tope2)
    		{
    			this.dropItem(Items.IRON_INGOT, 1);
    		}
    	}
    	
    	if (lootingModifier == 1)
    	{
    		tope1 = 79;  // 80%
    		tope2 = 94;  // 15%
    		tope3 = 99;  // 5%
    		
    		if (prob <= tope1)
    		{
    			this.entityDropItem(new ItemStack(Blocks.STONE), 1);
    		}
    		
    		else if (prob > tope1 && prob <= tope2)
    		{
    			this.dropItem(Items.IRON_INGOT, 1);
    		}
    		
    		else if (prob > tope2 && prob <= tope3)
    		{
    			this.dropItem(Items.GOLD_INGOT, 1);
    		}
    	}
    	
    	if (lootingModifier == 2)
    	{
    		tope1 = 74;  // 75%
    		tope2 = 89;  // 15%
    		tope3 = 96;  // 7%
    		tope4 = 99;  // 3%
    		
    		if (prob <= tope1)
    		{
    			this.entityDropItem(new ItemStack(Blocks.STONE), 1);
    		}
    		
    		else if (prob > tope1 && prob <= tope2)
    		{
    			this.dropItem(Items.IRON_INGOT, 1);
    		}
    		
    		else if (prob > tope2 && prob <= tope3)
    		{
    			this.dropItem(Items.GOLD_INGOT, 1);
    		}
    		
    		else if (prob > tope3 && prob <= tope4)
    		{
    			this.dropItem(Items_OverWorld.GEMA_DE_ZAFIRO, 1);
    		}
    	}
    	
    	if (lootingModifier == 3)
    	{
    		tope1 = 69;  // 70%
    		tope2 = 84;  // 15%
    		tope3 = 92;  // 8%
    		tope4 = 97;  // 5%
    		tope5 = 99;  // 2%
    		
    		if (prob <= tope1)
    		{
    			this.entityDropItem(new ItemStack(Blocks.STONE), 1);
    		}
    		
    		else if (prob > tope1 && prob <= tope2)
    		{
    			this.dropItem(Items.IRON_INGOT, 1);
    		}
    		
    		else if (prob > tope2 && prob <= tope3)
    		{
    			this.dropItem(Items.GOLD_INGOT, 1);
    		}
    		
    		else if (prob > tope3 && prob <= tope4)
    		{
    			this.dropItem(Items_OverWorld.GEMA_DE_ZAFIRO, 1);
    		}
    		
    		else if (prob > tope4 && prob <= tope5)
    		{
    			this.dropItem(Items.DIAMOND, 1);
    		}
    	}
    	
    	super.dropFewItems(wasRecentlyHit, lootingModifier);
    }

    
    public float getEyeHeight()
    {
        float f = 1.225F;

        if (this.isChild())
        {
            f = (float)((double)f - 0.81D);
        }

        return f;
    }
    
    

    /**
     * Multiplies the height and width by the provided float.
     */
    protected final void multiplySize(float size)
    {
        super.setSize(this.zombieWidth * size, this.zombieHeight * size);
    }
    

    /**
     * Returns the Y Offset of this entity.
     */
    public double getYOffset()
    {
        return this.isChild() ? 0.0D : -0.45D;
    }


   
}