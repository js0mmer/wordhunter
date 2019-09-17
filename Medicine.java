import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;








public class Medicine
  extends Actor
{
  public static int speedOn = 0;
  
  public void act() {
    if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 15) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setImage("Blank.png");
      speedOn = 1;
      Pig.BaconCount -= 15;
      Pig.SecondaryCount -= 5;
    } 
  }
}


