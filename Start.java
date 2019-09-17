import greenfoot.Actor;










public class Start
  extends Actor
{
  int time = 0;
  
  public void act() {
    this.time++;
    if (this.time == 2)
    {
      setImage("Three.png");
    }
    if (this.time == 50)
    {
      setImage("Two.png");
    }
    if (this.time == 100)
    {
      setImage("One.png");
    }
    if (this.time == 150)
    {
      setImage("Hunt!.png");
    }
    if (this.time == 200) {
      
      setImage("Blank.png");
      Boar.radish = 0;
    } 
  }
}


