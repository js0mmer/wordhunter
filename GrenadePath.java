import greenfoot.*;

public class GrenadePath extends ActorMethods
{
    GreenfootImage image = getImage();
    public static int rotation = 0;
    private int lifetime = 0;
    
    public GrenadePath()
    {
        setRotation(ActorMethods.getSoldierRotation);
    }
    
    public void act() 
    {
        if(lifetime<30) move(5);
        else if(lifetime<40) move(4);
        else if(lifetime<50) move(3);
        else if(lifetime<55) move(2);
        else if(lifetime<60) move(1);
        Grenade grenade = new Grenade();
        getWorld().addObject(grenade,getX(),getY());
        if(lifetime<35) rotation = rotation+5;
        else if(lifetime<45) rotation = rotation+4;
        else if(lifetime<55) rotation = rotation+3;
        else if(lifetime<60) rotation = rotation+2;
        else if(lifetime<65) rotation++;
        lifetime++;
        if(lifetime>100)
        {
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion,getX(),getY());
            getWorld().removeObject(this);
        }
    }    
}
