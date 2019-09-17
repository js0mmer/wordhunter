import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Pig
  extends Actor
{
  boolean baconOrNot = false;
  int health = 15;
  int time = 0;
  int constantTime = 0;
  int Bacon = 0;
  public static int BaconCount = 0;
  public static int SecondaryCount = 0;
  public static int PigCount = 6;
  public static int runAway = 0;
  boolean calm = true;
  int maybeMove = 0;
  int pigStride = 15;
  int extraint = Greenfoot.getRandomNumber(100);
  int rodeo = 5;
  
  public void act() {
    movement();
    takeDamage();
    die();
    this.time++;
    this.constantTime++;
    baconConversion();
    countBacon();
    reset();
    run();
    this.extraint = Greenfoot.getRandomNumber(this.rodeo);
  }

  
  public void run() {
    if (runAway == 1) {
      
      setRotation(0);
      move(15);
      this.calm = false;
      if (isAtEdge())
      {
        getWorld().removeObject(this);
      }
    } 
  }

  
  public void reset() {
    if (this.constantTime < 2) {


      
      PigCount = 6;
      runAway = 0;
    } 
  }




  
  public void movement() {
    if (!this.baconOrNot && this.calm == true) {
      
      setRotation(Greenfoot.getRandomNumber(360));
      
      if (Redneck.firstShot == 1) {
        
        this.maybeMove = Greenfoot.getRandomNumber(100);
        this.pigStride = 15;
      } 
      if (Redneck.firstShot == 2) {
        
        this.maybeMove = this.extraint;
        this.pigStride = 40;
      } 
      if (this.maybeMove == 1)
      {
        move(this.pigStride);
      }
      
      setRotation(0);
    } 
  }


  
  public void die() {
    if (this.health < 1 && !this.baconOrNot) {
      
      setImage("Bacon.png");
      this.baconOrNot = true;
      Greenfoot.playSound("Deadpig.mp3");
      PigCount--;
    } 
  }

  
  public void takeDamage() {
    if (isTouching(Bullet.class) && !this.baconOrNot && this.time > 0) {
      
      setImage("PigRightDamage.png");
      this.health -= Bullet.damage;
      removeTouching(Bullet.class);
      this.time = 0;
      Greenfoot.playSound("Squeal.mp3");
      if (PoisonBullets.tranqOn == 1)
      {
        this.rodeo = 100;
      }
    } 
    if (this.time > 8 && !this.baconOrNot)
    {
      setImage("PigRight.png");
    }
  }

  
  public void countBacon() {
    if (this.Bacon == 1)
    {
      if (isTouching(Redneck.class)) {
        
        getWorld().removeObject(this);
        BaconCount++;
        SecondaryCount++;
        Greenfoot.playSound("Slap.mp3");
      } 
    }
    
    if (SecondaryCount >= 10)
    {
      SecondaryCount = 0;
    }
  }

  
  public void baconConversion() {
    if (this.baconOrNot == true)
    {
      this.Bacon = 1;
    }
  }
}


