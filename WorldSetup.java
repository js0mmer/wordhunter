import greenfoot.*;

public class WorldSetup extends World
{
    public WorldSetup()
    {    
        super(1000, 600, 1); 
    }
    public void act()
    {
        World menu = new Menu();
        Greenfoot.setWorld(menu);
    }
}
