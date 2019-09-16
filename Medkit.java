import greenfoot.*;

public class Medkit extends ActorMethods
{
    GreenfootImage image = getImage();
    private int lifetime = 0;
    private int timer1 = 0;
    private int timer2 = 25;
    
    public void act() 
    {
        if(lifetime>100) timer1++;
        else lifetime++;
        
        if(isTouching(Soldier.class))
        {
            ActorMethods.health = 3;
            getWorld().removeObject(this);
        }
        if(timer1>timer2/2)
        {
            image.setTransparency(100);
            if(timer1>timer2)
            {
                timer1=0;
                timer2=timer2-1;
            }
        }
        else image.setTransparency(255);
        
        if(timer2==0) getWorld().removeObject(this);
    }    
}
