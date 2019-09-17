import greenfoot.Actor;











public class Bullet
  extends Actor
{
  public static int damage = 5;


  
  public Bullet(int angle) { setRotation(angle); }


  
  public void act() {
    move(10);
    removeMe();
    if (Redneck.gunMode == 1)
    {
      damage = 10;
    }
    if (Redneck.gunMode == 2)
    {
      damage = 8;
    }
    if (Redneck.gunMode == 3)
    {
      damage = 3;
    }
  }

  
  public void removeMe() {
    if (isAtEdge())
    {
      getWorld().removeObject(this);
    }
  }
}


