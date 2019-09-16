import greenfoot.*;

public class Rock extends JungleSetup
{
    public Rock()
    {
        GreenfootImage image = getImage();
        image.scale(75,75);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    public void act() 
    {
        
    }    
}
