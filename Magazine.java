import greenfoot.*;

public class Magazine extends ActorMethods
{
    private int lifetime = 25;
    private int transparency = 255;
    GreenfootImage image;
    public void addedToWorld(World Vietnam)
    {
        move(8);
        turn(90);
        move(18);
        turn(-15);
    }
    
    public Magazine()
    {
        image = getImage();
        image.scale(20,15);
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
