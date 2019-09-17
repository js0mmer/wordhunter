import greenfoot.Actor;











public class ShopBaconCount1
  extends Actor
{
  public void act() {
    if (Pig.BaconCount < 10)
    {
      setImage("0.png");
    }
    if (Pig.BaconCount >= 10 && Pig.BaconCount < 20)
    {
      setImage("1.png");
    }
    if (Pig.BaconCount >= 20 && Pig.BaconCount < 30)
    {
      setImage("2.png");
    }
    if (Pig.BaconCount >= 30 && Pig.BaconCount < 40)
    {
      setImage("3.png");
    }
    if (Pig.BaconCount >= 40 && Pig.BaconCount < 50)
    {
      setImage("4.png");
    }
    if (Pig.BaconCount >= 50 && Pig.BaconCount < 60)
    {
      setImage("5.png");
    }
    if (Pig.BaconCount >= 60 && Pig.BaconCount < 70)
    {
      setImage("6.png");
    }
    if (Pig.BaconCount >= 70 && Pig.BaconCount < 80)
    {
      setImage("7.png");
    }
    if (Pig.BaconCount >= 80 && Pig.BaconCount < 90)
    {
      setImage("8.png");
    }
    if (Pig.BaconCount >= 90)
    {
      setImage("9.png");
    }
  }
}


