import greenfoot.Actor;
import greenfoot.Greenfoot;









public class Boar
  extends Actor
{
  boolean atEdge = false;
  boolean placeHolder = false;
  boolean bounce = true;
  boolean nowMove = false;
  boolean chargeBackReady = false;
  boolean yetAnotherPlaceholder = true;
  int health = 25;
  boolean hamOrNot = false;
  int time = 0;
  boolean LeftOrRight = false;
  boolean deadOrNot = false;
  public static int diedie = 0;
  int time2 = 0;
  boolean whoop = false;
  public static int radish = 0;
  public static int boarDeadOrNo = 0;

  
  public void act() {
    if (!this.deadOrNot) {
      
      mover();
      charge();
    } 
    die();
    takeDamage();
    this.time++;
    this.time2++;
    if (this.time2 < 5) {
      
      diedie = 0;
      radish = 0;
    } 
    if (this.hamOrNot == true)
    {
      radish = 1;
    }
    consumeMyself();
  }

  
  public void consumeMyself() {
    if (this.hamOrNot == true) {
      
      boarDeadOrNo = 1;
      if (isTouching(Redneck.class)) {
        
        Pig.BaconCount += 10;
        getWorld().removeObject(this);
      } 
    } 
  }



  
  public void takeDamage() {
    if (isTouching(Bullet.class) && !this.hamOrNot && this.time > 0) {
      
      if (this.LeftOrRight == true)
      {
        setImage("BoarLeftDamage.png");
      }
      if (!this.LeftOrRight)
      {
        setImage("BoarRightDamage.png");
      }
      this.health -= Bullet.damage;
      removeTouching(Bullet.class);
      this.time = 0;
      Greenfoot.playSound("Squeal.mp3");
    } 
    if (this.time > 8 && !this.hamOrNot) {
      
      if (!this.LeftOrRight)
      {
        setImage("BoarRight.png");
      }
      if (this.LeftOrRight == true)
      {
        setImage("BoarLeft.png");
      }
    } 
  }

  
  public void die() {
    if (this.health < 1) {
      
      setImage("Ham.png");
      if (!this.whoop) {
        
        Greenfoot.playSound("Deadpig.mp3");
        this.whoop = true;
      } 
      this.hamOrNot = true;
      this.deadOrNot = true;
      diedie = 1;
    } 
  }

  
  public void mover() {
    if (this.bounce == true) {
      
      if (!this.atEdge) {
        
        setRotation(-90);
        move(5);
        setRotation(0);
      } 
      if (this.atEdge == true) {
        
        setRotation(90);
        move(5);
        setRotation(0);
      } 
      if (isAtEdge() && !this.placeHolder) {
        
        this.atEdge = true;
        setRotation(90);
        move(2);
        setRotation(0);
        this.placeHolder = true;
      } 
      if (isAtEdge() && this.placeHolder == true) {
        
        this.atEdge = false;
        setRotation(-90);
        move(2);
        setRotation(0);
        this.placeHolder = false;
      } 
    } 
  }

  
  public void charge() {
    int maybe = Greenfoot.getRandomNumber(200);
    if (maybe == 1) {
      
      setRotation(0);
      this.nowMove = true;
      this.bounce = false;
    } 
    if (this.nowMove == true && !this.chargeBackReady) {
      
      setRotation(0);
      move(20);
      this.yetAnotherPlaceholder = true;
    } 
    if (this.nowMove == true && isAtEdge()) {
      
      this.nowMove = false;
      if (!this.chargeBackReady)
      {
        move(-100);
      }
      if (this.chargeBackReady == true)
      {
        move(100);
      }
      this.bounce = true;
      if (this.chargeBackReady == true && this.yetAnotherPlaceholder == true) {
        
        this.chargeBackReady = false;
        this.yetAnotherPlaceholder = false;
        setImage("BoarRight.png");
        this.LeftOrRight = false;
      } 
      if (!this.chargeBackReady && this.yetAnotherPlaceholder == true) {
        
        this.chargeBackReady = true;
        this.yetAnotherPlaceholder = false;
        setImage("BoarLeft.png");
        this.LeftOrRight = true;
      } 
    } 
    if (this.nowMove == true && this.chargeBackReady == true) {
      
      setRotation(180);
      move(20);
      setRotation(0);
      this.yetAnotherPlaceholder = true;
    } 
  }
}


