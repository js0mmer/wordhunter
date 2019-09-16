import greenfoot.*;

public class IndicateAttack extends ActorMethods
{
    private int timer = 0;
    private int Y = 1;
    private int interval = 0;
    private int lifetime = 125;

    public IndicateAttack()
    {
        GreenfootImage image = getImage();
        image.scale(40,60);
    }
        
    public void act() 
    {
        if(interval>3)
        {
            setLocation(getX(),getY()+Y);
            interval=0;
        }
        timer++;
        interval++;
        lifetime--;
        if(timer>24 && Y==1)
        {
            Y=-1;
            timer=0;
        }
        else if(timer>24 && Y==-1)
        {
            Y=1;
            timer=0;
        }
        if(lifetime<=0) getWorld().removeObject(this);
    }    
}