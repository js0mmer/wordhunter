import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class QUIT
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this)) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      Greenfoot.stop();
    } 
    if (Back2.chicken == 1) {
      
      getWorld().removeObject(this);
      Back2.chicken = 0;
    } 
  }
}


