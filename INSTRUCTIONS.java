import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class INSTRUCTIONS
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this)) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      Greenfoot.setWorld(new HOW2PLAY());
    } 
  }
}


