import greenfoot.World;













public class HOW2PLAY
  extends World
{
  public HOW2PLAY() {
    super(1200, 800, 1);
    prepare();
  }





  
  private void prepare() {
    BACK bACK = new BACK();
    addObject(bACK, 621, 619);
  }
}


