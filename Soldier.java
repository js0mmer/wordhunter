import greenfoot.*;

public class Soldier extends ActorMethods
{
    private int grenadeTimer = 250;
    private int firerate = 0;
    private int ammo = 30;
    Reloading reloading = new Reloading();
    
    public void addedToWorld(World Vietnam)
    {
        setRotation(0);
        ammo();
        getWorld().addObject(reloading,830,15);
    }
    
    public void act() 
    {
        if(ActorMethods.health>0) userInputs();
        ammo();
        setPosition();
        updateStatus();
        grenadeTimer++;
        firerate++;
    }    
    
    public void updateStatus()
    {
        if(isTouching(EnemyBullet.class))
        {
            removeTouching(EnemyBullet.class);
            ActorMethods.health--;
            Blood blood = new Blood();
            getWorld().addObject(blood,getX(),getY());
        }
        if(ActorMethods.health<=0)
        {
            Gameover gameover = new Gameover();
            getWorld().addObject(gameover,500,250);
            Vietnam vietnam = (Vietnam)getWorld();
            getWorld().showText("Final Score: "+ vietnam.score,500,350);
            getWorld().removeObject(this);
        }
    }
    
    public void setPosition()
    {
        getSoldierX = getX();
        getSoldierY = getY();
        getSoldierRotation = getRotation();
    }
    
    public void ammo()
    {
        if(ammo==0)
        {
            reloading.image.setTransparency(255);
            if(firerate==0)
            {
                Magazine magazine = new Magazine();
                magazine.setRotation(getRotation());
                getWorld().addObject(magazine,getX(),getY());
            }
            if(firerate>100)
            {
                ammo=30;
                reloading.image.setTransparency(0);
            }
        }
        if(ammo>0)
        {
            getWorld().showText(ammo+"/30",830,15);
        }
        else getWorld().showText("",830,15);
    }
    
    public void userInputs()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+2,getY());
        }
        if(Greenfoot.isKeyDown("space") && ammo>0)
        {
            if(ammo!=30) ammo=0;
            firerate=0;
        }
	   if(ControlType.controlType == "keys") keyInputs();
	   //if(ControlType.controlType == "mouse") mouseInputs();
    }
//public void mouseInputs()
//{
	//MouseInfo mouse = new Greenfoot.getMouseInfo();
	//turnTowards();
//}

public void keyInputs()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-6);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(6);
        }
        if(Greenfoot.isKeyDown("up") && firerate > 6 && ammo > 0)
        {
            SoldierBullet soldierBullet = new SoldierBullet();
            getWorld().addObject(soldierBullet,getX(),getY());
            ShellCasing shellCasing = new ShellCasing();
            shellCasing.setRotation(getRotation());
            getWorld().addObject(shellCasing,getX(),getY());
            firerate=0;
            ammo--;
        }
        if(Greenfoot.isKeyDown("down") && grenadeTimer>25 && Vietnam.grenadeCount>0)
        {
            GrenadePath grenadePath = new GrenadePath();
            getWorld().addObject(grenadePath,getX(),getY());
            grenadeTimer=0;
            Vietnam.reloadGrenade=Vietnam.reloadGrenade-50;
        }
    }

}
