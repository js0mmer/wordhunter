import greenfoot.Actor;










public class TimerMinute
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
    if (this.time > 3180 && this.pow == true)
    {
      setImage("0.png");
    }
    if (this.time > 0 && this.time < 3180 && this.pow == true)
    {
      setImage("1.png");
    }
    if (this.time < 0 && this.pow == true)
    {
      setImage("2.png");
    }
  }
}


