<<<<<<< HEAD
/*     */ import greenfoot.Actor;
/*     */ import greenfoot.Greenfoot;
/*     */ import greenfoot.GreenfootSound;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Redneck
/*     */   extends Actor
/*     */ {
/*     */   boolean isSpacebarDown = true;
/*  16 */   public static int firstShot = 1;
/*  17 */   int time = 0;
/*  18 */   int time2 = 0;
/*  19 */   int time3 = 50;
/*  20 */   int time4 = 0;
/*     */   boolean musicYesNo = true;
/*  22 */   GreenfootSound soundT = new GreenfootSound("Banjo.mp3");
/*  23 */   public static int boarDie = 0;
/*     */   boolean spaceDown = false;
/*  25 */   int speed = 5;
/*  26 */   public static int gunMode = 0;
/*  27 */   int fireRate = 50;
/*     */   
/*     */   public void act() {
/*  30 */     playerMechanics();
/*  31 */     playerImage();
/*  32 */     this.time++;
/*  33 */     this.time2++;
/*  34 */     this.time3++;
/*  35 */     this.time4++;
/*  36 */     reset();
/*  37 */     music();
/*  38 */     dodge();
/*  39 */     if (isTouching(Boar.class) && Boar.boarDeadOrNo == 0)
/*     */     {
/*  41 */       boarDie++;
/*     */     }
/*  43 */     if (gunMode == 3)
/*     */     {
/*  45 */       this.fireRate = 10;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void dodge() {
/*  51 */     if (Medicine.speedOn == 1) {
/*     */       
/*  53 */       if (!Greenfoot.isKeyDown("Shift")) {
/*     */         
/*  55 */         this.spaceDown = false;
/*  56 */         this.speed = 5;
/*     */       } 
/*     */       
/*  59 */       if (Greenfoot.isKeyDown("Shift") && !this.spaceDown) {
/*     */         
/*  61 */         this.spaceDown = true;
/*  62 */         this.speed = 15;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/*  69 */     if (this.time < 2) {
/*     */       
/*  71 */       firstShot = 1;
/*  72 */       boarDie = 0;
/*  73 */       this.time4 = 0;
/*  74 */       this.musicYesNo = true;
/*  75 */       if (HealthPotion.healthOn == 1)
/*     */       {
/*  77 */         boarDie = -1;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerMechanics() {
/*  84 */     if (Greenfoot.isKeyDown("w")) {
/*     */       
/*  86 */       setRotation(270);
/*  87 */       move(this.speed);
/*     */     } 
/*     */     
/*  90 */     if (Greenfoot.isKeyDown("s")) {
/*     */       
/*  92 */       setRotation(90);
/*  93 */       move(this.speed);
/*     */     } 
/*     */     
/*  96 */     if (Greenfoot.isKeyDown("a")) {
/*     */       
/*  98 */       setRotation(180);
/*  99 */       move(this.speed);
/*     */     } 
/*     */     
/* 102 */     if (Greenfoot.isKeyDown("d")) {
/*     */       
/* 104 */       setRotation(0);
/* 105 */       move(this.speed);
/*     */     } 
/*     */     
/* 108 */     fire();
/*     */   }
/*     */ 
/*     */   
/*     */   public void fire() {
/* 113 */     if (!Greenfoot.isKeyDown("space"))
/*     */     {
/* 115 */       this.isSpacebarDown = false;
/*     */     }
/*     */     
/* 118 */     if (Greenfoot.isKeyDown("space") && !this.isSpacebarDown && this.time2 > 50 && this.time3 > 200 && gunMode != 2) {
/*     */ 
/*     */       
/* 121 */       int x = getX();
/* 122 */       int y = getY();
/* 123 */       int angle = getRotation();
/* 124 */       Bullet bullet = new Bullet(angle);
/* 125 */       getWorld().addObject(bullet, x, y);
/* 126 */       this.isSpacebarDown = true;
/* 127 */       firstShot = 2;
/* 128 */       this.time2 = 0;
/*     */       
/* 130 */       Greenfoot.playSound("Gunshot.mp3");
/*     */     } 
/*     */     
/* 133 */     if (Greenfoot.isKeyDown("space") && !this.isSpacebarDown && this.time2 > 10 && this.time3 > 200 && gunMode == 3) {
/*     */ 
/*     */       
/* 136 */       int x = getX();
/* 137 */       int y = getY();
/* 138 */       int angle = getRotation();
/* 139 */       Bullet bullt = new Bullet(angle);
/* 140 */       getWorld().addObject(bullt, x, y);
/* 141 */       this.isSpacebarDown = true;
/* 142 */       firstShot = 2;
/* 143 */       this.time2 = 0;
/*     */       
/* 145 */       Greenfoot.playSound("Gunshot.mp3");
/*     */     } 
/*     */     
/* 148 */     if (Greenfoot.isKeyDown("space") && !this.isSpacebarDown && this.time2 > 100 && this.time3 > 200 && gunMode == 2) {
/*     */ 
/*     */       
/* 151 */       Greenfoot.playSound("Gunshot.mp3");
/*     */       
/* 153 */       int x = getX();
/* 154 */       int y = getY();
/*     */       
/* 156 */       int angle = getRotation();
/*     */ 
/*     */       
/* 159 */       Bullet bullt = new Bullet(angle);
/* 160 */       Bullet bullt2 = new Bullet(angle);
/* 161 */       Bullet bullt3 = new Bullet(angle);
/*     */       
/* 163 */       getWorld().addObject(bullt, x, y);
/* 164 */       getWorld().addObject(bullt2, x, y);
/* 165 */       getWorld().addObject(bullt3, x, y);
/*     */       
/* 167 */       bullt.setRotation(getRotation() - 90);
/* 168 */       bullt2.setRotation(getRotation() - 90);
/* 169 */       bullt3.setRotation(getRotation() - 90);
/*     */       
/* 171 */       bullt.move(10);
/* 172 */       bullt2.move(10);
/* 173 */       bullt3.move(10);
/*     */       
/* 175 */       bullt.turn(90);
/* 176 */       bullt2.turn(100);
/* 177 */       bullt3.turn(80);
/*     */       
/* 179 */       bullt.move(10);
/* 180 */       bullt2.move(10);
/* 181 */       bullt3.move(10);
/*     */       
/* 183 */       this.isSpacebarDown = true;
/* 184 */       firstShot = 2;
/* 185 */       this.time2 = 0;
/*     */     } 
/* 187 */     setRotation(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void music() {
/* 192 */     if (this.time4 > 6560)
/*     */     {
/* 194 */       this.soundT.stop();
/*     */     }
/* 196 */     if (firstShot == 2 && this.musicYesNo == true) {
/*     */       
/* 198 */       this.soundT.play();
/* 199 */       this.musicYesNo = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerImage() {
/* 205 */     if (Greenfoot.isKeyDown("w"))
/*     */     {
/* 207 */       setImage("RedneckBack.png");
/*     */     }
/*     */     
/* 210 */     if (Greenfoot.isKeyDown("s"))
/*     */     {
/* 212 */       setImage("RedneckFront.png");
/*     */     }
/*     */     
/* 215 */     if (Greenfoot.isKeyDown("a"))
/*     */     {
/* 217 */       setImage("RedneckLeft.png");
/*     */     }
/*     */     
/* 220 */     if (Greenfoot.isKeyDown("d"))
/*     */     {
/* 222 */       setImage("RedneckRight.png");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Redneck.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */
=======
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


>>>>>>> abeccdadea413c761b053ae09cfe2a4b84545234
