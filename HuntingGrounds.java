import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;
import greenfoot.World;









public class HuntingGrounds
  extends World
{
  int time = 0;
  boolean placeholder = true;
  GreenfootSound soundZ = new GreenfootSound("BossBattle.mp3");

  
  public HuntingGrounds() {
    super(1200, 800, 1);
    prepare();
  }

  
  public void act() {
    this.time++;
    if (Pig.PigCount < 6)
    {
      respawn();
    }
    if (Pig.BaconCount >= 10 && this.time > 6825 && this.placeholder == true) {
      
      Boar boar = new Boar();
      addObject(boar, 68, 402);
      this.soundZ.play();
      this.placeholder = false;
      Pig.runAway = 1;
    } 
    if (Boar.diedie == 1)
    {
      this.soundZ.stop();
    }
    if ((Pig.BaconCount < 10 && this.time > 6507) || Redneck.boarDie == 1) {
      
      GameOver GO = new GameOver();
      addObject(GO, 600, 400);
    } 
    if (Boar.radish == 1) {
      
      YouWin winner = new YouWin();
      addObject(winner, 600, 250);
      QUIT quit = new QUIT();
      addObject(quit, 580, 400);
    } 
    if (this.time < 10)
    {
      this.placeholder = true;
    }
  }

  
  public void respawn() {
    if (this.time < 6507) {
      
      int var = Greenfoot.getRandomNumber(150);
      if (var == 5) {
        
        Pig pignew = new Pig();
        addObject(pignew, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(800));
        Pig.PigCount++;
      } 
    } 
  }





  
  private void prepare() {
    Pig pig2 = new Pig();
    addObject(pig2, 142, 409);
    Pig pig3 = new Pig();
    addObject(pig3, 836, 650);
    Pig pig4 = new Pig();
    addObject(pig4, 1052, 392);
    Pig pig5 = new Pig();
    addObject(pig5, 818, 137);
    Pig pig6 = new Pig();
    addObject(pig6, 363, 106);
    Pig pig7 = new Pig();
    addObject(pig7, 387, 646);
    Redneck redneck = new Redneck();
    addObject(redneck, 600, 392);
    BaconCountPreset baconCountPreset = new BaconCountPreset();
    addObject(baconCountPreset, 43, 774);
    BaconCount1 baconCount1 = new BaconCount1();
    addObject(baconCount1, 89, 777);
    BaconCount2 baconCount2 = new BaconCount2();
    addObject(baconCount2, 121, 777);
    
    TimerMinute timerMinute = new TimerMinute();
    addObject(timerMinute, 29, 29);
    Colon colon = new Colon();
    addObject(colon, 51, 29);
    TimerSecond1 timerSecond1 = new TimerSecond1();
    addObject(timerSecond1, 72, 29);
    TimerSecond2 timerSecond2 = new TimerSecond2();
    addObject(timerSecond2, 102, 28);
    Start start = new Start();
    addObject(start, 600, 392);
    
    Boar.radish = 0;
  }
}


