import greenfoot.*;

public class HealthBar extends ActorMethods
{
    public HealthBar()
    {
        GreenfootImage image = getImage();
        image.scale(100,25);
    }
    
    public void act() 
    {
        if(ActorMethods.health>3) ActorMethods.health=3;
        if(ActorMethods.health==3)
        {
            setImage("Health-Green.png");
            GreenfootImage image = getImage();
            image.scale(100,25);
        }
        else if(ActorMethods.health==2)
        {
            setImage("Health-Yellow.png");
            GreenfootImage image = getImage();
            image.scale(100,25);
        }
        else if(ActorMethods.health==1)
        {
            setImage("Health-Red.png");
            GreenfootImage image = getImage();
            image.scale(100,25);
        }
        else
        {
            setImage("Health-Black.png");
            GreenfootImage image = getImage();
            image.scale(100,25);
        }
    }    
}
