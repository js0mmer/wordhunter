import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class AssaultRifle
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 40) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setImage("Blank.png");
      Pig.BaconCount -= 40;
      Redneck.gunMode = 3;
    } 
  }
}


