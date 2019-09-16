import greenfoot.*;

public class Explosion extends ActorMethods
{
    GreenfootImage image = getImage();
    public int transparency = 50;
    public int var = 25;
    public int timer = 0;
    public int resize = 10;
    public int scaleTimer = 0;
    private int active = 1;
    
    public Explosion()
    {
        image.scale(200,200);
        image.setTransparency(50);
        setRotation(Greenfoot.getRandomNumber(90)-45);
    }
    
    public void act()
    {
        resize();
        transparency();
        scaleTimer++;
        damage();
        active++;
    }
    
    public void damage()
    {
        if(active<3) if(isTouching(Soldier.class)) Soldier.health=0;
    }
    
    public void resize()
    {
        if(scaleTimer>1)
        {
            image.scale(image.getWidth()+resize,image.getHeight()+resize);
            scaleTimer=0;
        }
    }
    
    public void transparency() 
    {
        transparency = image.getTransparency()+var;
        if(transparency>255)
        {
            transparency=255;
            timer++;
            resize=0;
            if(timer>10)
            {
                var=-10;
                resize--;
            }
        }
        else if(transparency<0) transparency=0;
        image.setTransparency(transparency);
        if(transparency==0) getWorld().removeObject(this);
    }    
}
