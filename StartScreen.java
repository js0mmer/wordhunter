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
    TitleMenu title = new TitleMenu();
    addObject(title, -550, 200);
    
    // Load native libraries for text to speech and json parsing
    NativeLoader loader = new NativeLoader();
    loader.addClasspath("./lib/freetts-jsapi10.jar");
    loader.addClasspath("./lib/freetts.jar");
    loader.addClasspath("./lib/cmu_us_kal.jar");
    loader.addClasspath("./lib/jsapi.jar");
    loader.addClasspath("./lib/gson-2.8.5.jar");
    
    // pre load classes utilizing these libraries so it works properly
    loader.loadClass("TTS");
    loader.loadClass("Wordnik");
    loader.loadClass("Wordnik$Response");
    
    // TTS.speak("table. " + Wordnik.getDefinition("table")); // testing
  }
}



