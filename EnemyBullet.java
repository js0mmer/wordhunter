import greenfoot.*;

public class EnemyBullet extends ActorMethods
{
    public void addedToWorld(World Vietnam)
    {
        turn(90);
        move(12);
        turn(-91);
        move(10);
    }
    
    public EnemyBullet()
    {
        GreenfootImage image = getImage();  
        image.scale(5, 5);
    }
    
    public void act() 
    {
        move(25);
        makesContact();
    }    
    
    public void makesContact()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
