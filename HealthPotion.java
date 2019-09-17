import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;








public class HealthPotion
  extends Actor
{
  public static int healthOn = 0;
  
  public void act() {
    if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 10) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setImage("Blank.png");
      healthOn = 1;
      Pig.BaconCount -= 10;
    } 
  }
}


