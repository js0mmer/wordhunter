import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;








public class PoisonBullets
  extends Actor
{
  public static int tranqOn = 0;
  
  public void act() {
    if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 20) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setImage("Blank.png");
      tranqOn = 1;
      Pig.BaconCount -= 20;
    } 
  }
}


