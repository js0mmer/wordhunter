import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;









public class BEGIN
  extends Actor
{
  public void act() {
    if (Greenfoot.mouseClicked(this)) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      Greenfoot.setWorld(new HuntingGrounds());
      Boar.radish = 0;
      HealthPotion.healthOn = 0;
      Redneck.gunMode = 0;
      Pig.BaconCount = 0;
      Pig.SecondaryCount = 0;
      Boar.diedie = 0;
    } 
  }
}


