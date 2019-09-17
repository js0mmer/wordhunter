import greenfoot.World;













public class StartScreen
  extends World
{
  public StartScreen() {
    super(1200, 800, 1);
    prepare();
  }





  
  private void prepare() {
    INSTRUCTIONS iNSTRUCTIONS = new INSTRUCTIONS();
    addObject(iNSTRUCTIONS, 593, 596);
    BEGIN sTART = new BEGIN();
    addObject(sTART, 600, 476);
    QUIT qUIT = new QUIT();
    addObject(qUIT, 593, 704);
  }
}


