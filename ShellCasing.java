import greenfoot.*;

public class ShellCasing extends ActorMethods
{
    private int lifetime = 25+Greenfoot.getRandomNumber(5);
    private int transparency = 255;
    GreenfootImage image;
    public void addedToWorld(World Vietnam)
    {
        move(5);
        turn(90);
        move(13);
        turn(-15);
        turn(Greenfoot.getRandomNumber(30));
    }
    
    public ShellCasing()
    {
        image = getImage();
        image.scale(2,5);
    }

    public void act() 
    {
        if(lifetime>0) move(lifetime/10);
        image.setTransparency(transparency);
        lifetime--;
        if(lifetime<3) transparency=transparency-5;
        if(transparency<50) getWorld().removeObject(this);
    }    
}
