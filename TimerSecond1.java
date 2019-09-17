import greenfoot.Actor;











public class TimerSecond1
  extends Actor
{
  int time = -200;
  int time2 = 0;
  boolean pow = true;
  
  public void act() {
    this.time++;
    this.time2++;
    if (this.time2 >= 6507) {
      
      setImage("0.png");
      this.pow = false;
    } 
    if (this.time < 530 && this.time > 0 && this.pow == true)
    {
      setImage("5.png");
    }
    if (this.time < 1060 && this.time > 530 && this.pow == true)
    {
      setImage("4.png");
    }
    if (this.time < 1590 && this.time > 1060 && this.pow == true)
    {
      setImage("3.png");
    }
    if (this.time < 2120 && this.time > 1590 && this.pow == true)
    {
      setImage("2.png");
    }
    if (this.time < 2650 && this.time > 2120 && this.pow == true)
    {
      setImage("1.png");
    }
    if (this.time < 3180 && this.time > 2650 && this.pow == true)
    {
      setImage("0.png");
    }
    if (this.time > 3180 && this.pow == true)
    {
      this.time = 0;
    }
  }
}


