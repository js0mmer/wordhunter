import greenfoot.*;

public class GrenadeAmmoProgress extends ActorMethods
{
    GreenfootImage image;
    public GrenadeAmmoProgress()
    {
        image = getImage();
        image.scale(20,50);
    }
    
    public void act() 
    {
        if(getX()<875) image.scale(20,Vietnam.grenade1Progress);
        if(getX()>875) image.scale(20,Vietnam.grenade2Progress);
    }    
}
