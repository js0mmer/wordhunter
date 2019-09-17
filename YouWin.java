 import greenfoot.Actor;
public class YouWin
  extends Actor
{
  public void act() {
    if (Back2.rooster == 1) {
      
      getWorld().removeObject(this);
      Back2.rooster = 0;
    } 
  }
}


