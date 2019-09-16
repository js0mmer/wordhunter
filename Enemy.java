import greenfoot.*;

public class Enemy extends ActorMethods
{
    int timeCount = 0;
    int actCount = 0;
    int health = 4;
    public String shooterStatus = "No";
    int attackDelay = 0;
    int bayonetTimer = 0;
    private IndicateAttack indicateAttack = new IndicateAttack();
    
    public void addedToWorld(World Vietnam)
    {
        turnTowards(ActorMethods.getSoldierX, ActorMethods.getSoldierY);
    }
        
    public void act() 
    {
        if(shooterStatus == "Active") shoot();
        else move(1);
        Vietnam vietnam = (Vietnam)getWorld();
        if(getX() > 150 && getX() < 850 && getY() > 150 && getY() < 475)
        {
            if(Greenfoot.getRandomNumber(500)==0 && shooterStatus == "No" && vietnam.shooters<2)
            {
                vietnam.enemyAttack(1);
                shooterStatus = "Active";
            }
        }
        pursue();
        gameOver();
        updateStatus();
        timeCount++;
        actCount++;
        bayonetTimer++;
    }    
    
    public void shoot()
    {
        attackDelay++;
        if(attackDelay == 1) getWorld().addObject(indicateAttack,getX(),getY()-50);
        else if(attackDelay == 125)
        {
            EnemyBullet bullet = new EnemyBullet();
            bullet.setRotation(getRotation());
            getWorld().addObject(bullet,getX(),getY());
        }
        else if(attackDelay == 150)
        {
            shooterStatus = "No";
            attackDelay = 0;
            Vietnam vietnam = (Vietnam)getWorld();
            vietnam.enemyAttack(-1);
        }
    }
    
    public void updateStatus()
    {
        if(isTouching(SoldierBullet.class) || isTouching(Explosion.class))
        {
            health--;
            if(shooterStatus == "Active")
            {
                getWorld().removeObject(indicateAttack);
                shooterStatus = "No";
                attackDelay = 0;
                Vietnam vietnam = (Vietnam)getWorld();
                vietnam.enemyAttack(-1);
            }
        }
        if(health<=0)
        {
            if(Greenfoot.getRandomNumber(5)==0)
            {
                Medkit medkit = new Medkit();
                getWorld().addObject(medkit,getX(),getY());
            }
            Vietnam vietnam = (Vietnam)getWorld();
            vietnam.score(100);
            Vietnam.enemiesDefeated++;
            getWorld().removeObject(this);
        }
    }
    
    public void pursue()
    {
        if(attackDelay>100) {}
        else if(actCount>500)
        {
            if(timeCount>=Greenfoot.getRandomNumber(2))
            {
                turnTowards(ActorMethods.getSoldierX, ActorMethods.getSoldierY);
                timeCount = 0;
            }
        }
        else if(timeCount > Greenfoot.getRandomNumber(25)+25-actCount/20 && actCount<500)
        {
            if(timeCount>=Greenfoot.getRandomNumber(2))
            {
                turnTowards(ActorMethods.getSoldierX, ActorMethods.getSoldierY);
                timeCount = 0;
            }
        }
    }
    
    public void gameOver()
    {
        if(isTouching(Soldier.class) && bayonetTimer>50)
        {
            Blood blood = new Blood();
            getWorld().addObject(blood,ActorMethods.getSoldierX, ActorMethods.getSoldierY);
            ActorMethods.health--;
            bayonetTimer=0;
        }
    }
}
