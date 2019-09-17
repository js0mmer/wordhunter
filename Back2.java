import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;








public class Back2
  extends Actor
{
  public static int macarel = 0;
  public static int reset = 0;
  public static int rooster = 0;
  public static int chicken = 0;
  public static int reebok = 0;
  public static int music = 0;
  
  public void act() {
    if (Greenfoot.mouseClicked(this)) {
      
      MouseInfo mouse = Greenfoot.getMouseInfo();
      Greenfoot.setWorld(new HuntingGrounds());
      reset = 1;
      macarel = 1;
      Boar.radish = 0;
      rooster = 1;
      chicken = 1;
      reebok = 1;
      music = 1;
      Boar.diedie = 0;
    } 
  }
}


