import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class Pistol
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 20) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setImage("Blank.png");
      Pig.BaconCount -= 20;
      Redneck.gunMode = 1;
    } 
  }
}


