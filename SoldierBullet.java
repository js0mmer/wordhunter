import greenfoot.*;

public class SoldierBullet extends ActorMethods
{
    private int status=0;
    
    public void addedToWorld(World Vietnam)
    {
        turn(ActorMethods.getSoldierRotation+90);
        move(12);
        turn(-91);
        move(37);
    }
    
    public SoldierBullet()
    {
        GreenfootImage image = getImage();  
        image.scale(5, 5);
    }
    
    public void act() 
    {
        move(25);
        makesContact();
    }    
    
    public void makesContact()
    {
        if(status>0) getWorld().removeObject(this);
        else if(isTouching(Enemy.class))
        {
            Blood blood = new Blood();
            getWorld().addObject(blood,getX(),getY());
            status++;
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
