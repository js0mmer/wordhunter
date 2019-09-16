import greenfoot.*;

public class EnemySpawn extends ActorMethods
{
    private int lifetime = 100;
    
    public void act() 
    {
        lifetime--;
        if(lifetime==0)
        {
            Enemy enemy = new Enemy();
            getWorld().addObject(enemy,getX(),getY());
            getWorld().removeObject(this);
        }
    }    
}
