import greenfoot.Actor;










public class TimerSecond2
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
    if (this.time == 530 && this.pow == true)
    {
      this.time = 0;
    }
    if (this.time < 53 && this.time > 0 && this.pow == true)
    {
      setImage("9.png");
    }
    if (this.time < 106 && this.time > 53 && this.pow == true)
    {
      setImage("8.png");
    }
    if (this.time < 159 && this.time > 106 && this.pow == true)
    {
      setImage("7.png");
    }
    if (this.time < 212 && this.time > 159 && this.pow == true)
    {
      setImage("6.png");
    }
    if (this.time < 265 && this.time > 212 && this.pow == true)
    {
      setImage("5.png");
    }
    if (this.time < 318 && this.time > 265 && this.pow == true)
    {
      setImage("4.png");
    }
    if (this.time < 371 && this.time > 318 && this.pow == true)
    {
      setImage("3.png");
    }
    if (this.time < 424 && this.time > 371 && this.pow == true)
    {
      setImage("2.png");
    }
    if (this.time < 477 && this.time > 424 && this.pow == true)
    {
      setImage("1.png");
    }
    if (this.time < 530 && this.time > 477 && this.pow == true)
    {
      setImage("0.png");
    }
  }
}


