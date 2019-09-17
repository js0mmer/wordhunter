import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class BACK
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this)) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      Greenfoot.setWorld(new StartScreen());
    } 
  }
}


