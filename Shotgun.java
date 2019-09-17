import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class Shotgun
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 30) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setImage("Blank.png");
      Pig.BaconCount -= 30;
      Redneck.gunMode = 2;
    } 
  }
}


