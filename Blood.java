import greenfoot.*;

public class Blood extends ActorMethods
{
    private int resizeTimer = 0;
    
    public void addedToWorld(World Vietnam)
    {
        GreenfootImage image = getImage();  
        image.scale(40,40);
        image.setTransparency(225);
        setRotation(Greenfoot.getRandomNumber(70)-35);
    }
    
    public void act() 
    {
        GreenfootImage image = getImage();
        image.setTransparency(image.getTransparency()-2);
        resizeTimer++;
        if(resizeTimer>50)
        {
            image.scale(image.getWidth()-10,image.getHeight()-10);
            resizeTimer = 0;
        }
        if(image.getTransparency()<10) getWorld().removeObject(this);
    }    
}
