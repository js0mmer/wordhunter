import greenfoot.*;

public class Grenade extends GrenadePath
{
    public Grenade()
    {
        GreenfootImage image = getImage();
        image.scale(20,20);
        setRotation(GrenadePath.rotation);
    }
        
    public void act() 
    {
        getWorld().removeObject(this);
    }    
}
