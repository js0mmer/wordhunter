/*     */ import greenfoot.Actor;
/*     */ import greenfoot.Greenfoot;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pig
/*     */   extends Actor
/*     */ {
/*     */   boolean baconOrNot = false;
/*  16 */   int health = 15;
/*  17 */   int time = 0;
/*  18 */   int constantTime = 0;
/*  19 */   int Bacon = 0;
/*  20 */   public static int BaconCount = 0;
/*  21 */   public static int SecondaryCount = 0;
/*  22 */   public static int PigCount = 6;
/*  23 */   public static int runAway = 0;
/*     */   boolean calm = true;
/*  25 */   int maybeMove = 0;
/*  26 */   int pigStride = 15;
/*  27 */   int extraint = Greenfoot.getRandomNumber(100);
/*  28 */   int rodeo = 5;
/*     */   
/*     */   public void act() {
/*  31 */     movement();
/*  32 */     takeDamage();
/*  33 */     die();
/*  34 */     this.time++;
/*  35 */     this.constantTime++;
/*  36 */     baconConversion();
/*  37 */     countBacon();
/*  38 */     reset();
/*  39 */     run();
/*  40 */     this.extraint = Greenfoot.getRandomNumber(this.rodeo);
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  45 */     if (runAway == 1) {
/*     */       
/*  47 */       setRotation(0);
/*  48 */       move(15);
/*  49 */       this.calm = false;
/*  50 */       if (isAtEdge())
/*     */       {
/*  52 */         getWorld().removeObject(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/*  59 */     if (this.constantTime < 2) {
/*     */ 
/*     */ 
/*     */       
/*  63 */       PigCount = 6;
/*  64 */       runAway = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void movement() {
/*  73 */     if (!this.baconOrNot && this.calm == true) {
/*     */       
/*  75 */       setRotation(Greenfoot.getRandomNumber(360));
/*     */       
/*  77 */       if (Redneck.firstShot == 1) {
/*     */         
/*  79 */         this.maybeMove = Greenfoot.getRandomNumber(100);
/*  80 */         this.pigStride = 15;
/*     */       } 
/*  82 */       if (Redneck.firstShot == 2) {
/*     */         
/*  84 */         this.maybeMove = this.extraint;
/*  85 */         this.pigStride = 20;
/*     */       } 
/*  87 */       if (this.maybeMove == 1)
/*     */       {
/*  89 */         move(this.pigStride);
/*     */       }
/*     */       
/*  92 */       setRotation(0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void die() {
/*  99 */     if (this.health < 1 && !this.baconOrNot) {
/*     */       
/* 101 */       setImage("Bacon.png");
/* 102 */       this.baconOrNot = true;
/* 103 */       Greenfoot.playSound("Deadpig.mp3");
/* 104 */       PigCount--;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void takeDamage() {
/* 110 */     if (isTouching(Bullet.class) && !this.baconOrNot && this.time > 0) {
/*     */       
/* 112 */       setImage("PigRightDamage.png");
/* 113 */       this.health -= Bullet.damage;
/* 114 */       removeTouching(Bullet.class);
/* 115 */       this.time = 0;
/* 116 */       Greenfoot.playSound("Squeal.mp3");
/* 117 */       if (PoisonBullets.tranqOn == 1)
/*     */       {
/* 119 */         this.rodeo = 100;
/*     */       }
/*     */     } 
/* 122 */     if (this.time > 8 && !this.baconOrNot)
/*     */     {
/* 124 */       setImage("PigRight.png");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void countBacon() {
/* 130 */     if (this.Bacon == 1)
/*     */     {
/* 132 */       if (isTouching(Redneck.class)) {
/*     */         
/* 134 */         getWorld().removeObject(this);
/* 135 */         BaconCount++;
/* 136 */         SecondaryCount++;
/* 137 */         Greenfoot.playSound("Slap.mp3");
/*     */       } 
/*     */     }
/*     */     
/* 141 */     if (SecondaryCount >= 10)
/*     */     {
/* 143 */       SecondaryCount = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void baconConversion() {
/* 149 */     if (this.baconOrNot == true)
/*     */     {
/* 151 */       this.Bacon = 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Pig.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */