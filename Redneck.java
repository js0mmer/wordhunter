import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;

public class Redneck
  extends Actor
{
  boolean isSpacebarDown = true;
  public static int firstShot = 1;
  int time = 0;
  int time2 = 0;
  int time3 = 50;
  int time4 = 0;
  boolean musicYesNo = true;
  GreenfootSound soundT = new GreenfootSound("Banjo.mp3");
  public static int boarDie = 0;
  boolean spaceDown = false;
  int speed = 5;
  public static int gunMode = 0;
  int fireRate = 50;
  
  public void act() {
    playerMechanics();
    playerImage();
    this.time++;
    this.time2++;
    this.time3++;
    this.time4++;
    reset();
    music();
    dodge();
    if (isTouching(Boar.class) && Boar.boarDeadOrNo == 0)
    {
      boarDie++;
    }
    if (gunMode == 3)
    {
      this.fireRate = 10;
    }
  }

  
  public void dodge() {
    if (Medicine.speedOn == 1) {
      
      if (!Greenfoot.isKeyDown("Shift")) {
        
        this.spaceDown = false;
        this.speed = 5;
      } 
      
      if (Greenfoot.isKeyDown("Shift") && !this.spaceDown) {
        
        this.spaceDown = true;
        this.speed = 15;
      } 
    } 
  }

  
  public void reset() {
    if (this.time < 2) {
      
      firstShot = 1;
      boarDie = 0;
      this.time4 = 0;
      this.musicYesNo = true;
      if (HealthPotion.healthOn == 1)
      {
        boarDie = -1;
      }
    } 
  }

  
  public void playerMechanics() {
    if (Greenfoot.isKeyDown("w")) {
      
      setRotation(270);
      move(this.speed);
    } 
    
    if (Greenfoot.isKeyDown("s")) {
      
      setRotation(90);
      move(this.speed);
    } 
    
    if (Greenfoot.isKeyDown("a")) {
      
      setRotation(180);
      move(this.speed);
    } 
    
    if (Greenfoot.isKeyDown("d")) {
      
      setRotation(0);
      move(this.speed);
    } 
    
    fire();
  }

  
  public void fire() {
    if (!Greenfoot.isKeyDown("space"))
    {
      this.isSpacebarDown = false;
    }
    
    if (Greenfoot.isKeyDown("space") && !this.isSpacebarDown && this.time2 > 50 && this.time3 > 200 && gunMode != 2) {

      
      int x = getX();
      int y = getY();
      int angle = getRotation();
      Bullet bullt = new Bullet(angle);
      getWorld().addObject(bullt, x, y);
      this.isSpacebarDown = true;
      firstShot = 2;
      this.time2 = 0;
      
      Greenfoot.playSound("Gunshot.mp3");
    } 
    
    if (Greenfoot.isKeyDown("space") && !this.isSpacebarDown && this.time2 > 10 && this.time3 > 200 && gunMode == 3) {

      
      int x = getX();
      int y = getY();
      int angle = getRotation();
      Bullet bullt = new Bullet(angle);
      getWorld().addObject(bullt, x, y);
      this.isSpacebarDown = true;
      firstShot = 2;
      this.time2 = 0;
      
      Greenfoot.playSound("Gunshot.mp3");
    } 
    
    if (Greenfoot.isKeyDown("space") && !this.isSpacebarDown && this.time2 > 100 && this.time3 > 200 && gunMode == 2) {

      
      Greenfoot.playSound("Gunshot.mp3");
      
      int x = getX();
      int y = getY();
      
      int angle = getRotation();

      
      Bullet bullt = new Bullet(angle);
      Bullet bullt2 = new Bullet(angle);
      Bullet bullt3 = new Bullet(angle);
      
      getWorld().addObject(bullt, x, y);
      getWorld().addObject(bullt2, x, y);
      getWorld().addObject(bullt3, x, y);
      
      bullt.setRotation(getRotation() - 90);
      bullt2.setRotation(getRotation() - 90);
      bullt3.setRotation(getRotation() - 90);
      
      bullt.move(10);
      bullt2.move(10);
      bullt3.move(10);
      
      bullt.turn(90);
      bullt2.turn(100);
      bullt3.turn(80);
      
      bullt.move(10);
      bullt2.move(10);
      bullt3.move(10);
      
      this.isSpacebarDown = true;
      firstShot = 2;
      this.time2 = 0;
    } 
    setRotation(0);
  }

  
  public void music() {
    if (this.time4 > 6560)
    {
      this.soundT.stop();
    }
    if (firstShot == 2 && this.musicYesNo == true) {
      
      this.soundT.play();
      this.musicYesNo = false;
    } 
  }

  
  public void playerImage() {
    if (Greenfoot.isKeyDown("w"))
    {
      setImage("RedneckBack.png");
    }
    
    if (Greenfoot.isKeyDown("s"))
    {
      setImage("RedneckFront.png");
    }
    
    if (Greenfoot.isKeyDown("a"))
    {
      setImage("RedneckLeft.png");
    }
    
    if (Greenfoot.isKeyDown("d"))
    {
      setImage("RedneckRight.png");
    }
  }
}
