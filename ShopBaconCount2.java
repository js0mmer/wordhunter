import greenfoot.Actor;











public class ShopBaconCount2
  extends Actor
{
  public void act() {
    if (Pig.SecondaryCount < 0)
    {
      Pig.SecondaryCount = 10 - Pig.SecondaryCount;
    }
    if (Pig.SecondaryCount == 0)
    {
      setImage("0.png");
    }
    if (Pig.SecondaryCount == 1)
    {
      setImage("1.png");
    }
    if (Pig.SecondaryCount == 2)
    {
      setImage("2.png");
    }
    if (Pig.SecondaryCount == 3)
    {
      setImage("3.png");
    }
    if (Pig.SecondaryCount == 4)
    {
      setImage("4.png");
    }
    if (Pig.SecondaryCount == 5)
    {
      setImage("5.png");
    }
    if (Pig.SecondaryCount == 6)
    {
      setImage("6.png");
    }
    if (Pig.SecondaryCount == 7)
    {
      setImage("7.png");
    }
    if (Pig.SecondaryCount == 8)
    {
      setImage("8.png");
    }
    if (Pig.SecondaryCount == 9)
    {
      setImage("9.png");
    }
  }
}


