import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;










public class ShopTransfer
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this)) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      Greenfoot.setWorld(new Shop());
      Back2.music = 0;
    } 
    if (Back2.reebok == 1) {
      
      getWorld().removeObject(this);
      Back2.reebok = 0;
    } 
  }
}


