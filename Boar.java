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
/*     */ public class Boar
/*     */   extends Actor
/*     */ {
/*     */   boolean atEdge = false;
/*     */   boolean placeHolder = false;
/*     */   boolean bounce = true;
/*     */   boolean nowMove = false;
/*     */   boolean chargeBackReady = false;
/*     */   boolean yetAnotherPlaceholder = true;
/*  21 */   int health = 25;
/*     */   boolean hamOrNot = false;
/*  23 */   int time = 0;
/*     */   boolean LeftOrRight = false;
/*     */   boolean deadOrNot = false;
/*  26 */   public static int diedie = 0;
/*  27 */   int time2 = 0;
/*     */   boolean whoop = false;
/*  29 */   public static int radish = 0;
/*  30 */   public static int boarDeadOrNo = 0;
/*     */ 
/*     */   
/*     */   public void act() {
/*  34 */     if (!this.deadOrNot) {
/*     */       
/*  36 */       mover();
/*  37 */       charge();
/*     */     } 
/*  39 */     die();
/*  40 */     takeDamage();
/*  41 */     this.time++;
/*  42 */     this.time2++;
/*  43 */     if (this.time2 < 5) {
/*     */       
/*  45 */       diedie = 0;
/*  46 */       radish = 0;
/*     */     } 
/*  48 */     if (this.hamOrNot == true)
/*     */     {
/*  50 */       radish = 1;
/*     */     }
/*  52 */     consumeMyself();
/*     */   }
/*     */ 
/*     */   
/*     */   public void consumeMyself() {
/*  57 */     if (this.hamOrNot == true) {
/*     */       
/*  59 */       boarDeadOrNo = 1;
/*  60 */       if (isTouching(Redneck.class)) {
/*     */         
/*  62 */         Pig.BaconCount += 10;
/*  63 */         getWorld().removeObject(this);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void takeDamage() {
/*  72 */     if (isTouching(Bullet.class) && !this.hamOrNot && this.time > 0) {
/*     */       
/*  74 */       if (this.LeftOrRight == true)
/*     */       {
/*  76 */         setImage("BoarLeftDamage.png");
/*     */       }
/*  78 */       if (!this.LeftOrRight)
/*     */       {
/*  80 */         setImage("BoarRightDamage.png");
/*     */       }
/*  82 */       this.health -= Bullet.damage;
/*  83 */       removeTouching(Bullet.class);
/*  84 */       this.time = 0;
/*  85 */       Greenfoot.playSound("Squeal.mp3");
/*     */     } 
/*  87 */     if (this.time > 8 && !this.hamOrNot) {
/*     */       
/*  89 */       if (!this.LeftOrRight)
/*     */       {
/*  91 */         setImage("BoarRight.png");
/*     */       }
/*  93 */       if (this.LeftOrRight == true)
/*     */       {
/*  95 */         setImage("BoarLeft.png");
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void die() {
/* 102 */     if (this.health < 1) {
/*     */       
/* 104 */       setImage("Ham.png");
/* 105 */       if (!this.whoop) {
/*     */         
/* 107 */         Greenfoot.playSound("Deadpig.mp3");
/* 108 */         this.whoop = true;
/*     */       } 
/* 110 */       this.hamOrNot = true;
/* 111 */       this.deadOrNot = true;
/* 112 */       diedie = 1;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void mover() {
/* 118 */     if (this.bounce == true) {
/*     */       
/* 120 */       if (!this.atEdge) {
/*     */         
/* 122 */         setRotation(-90);
/* 123 */         move(5);
/* 124 */         setRotation(0);
/*     */       } 
/* 126 */       if (this.atEdge == true) {
/*     */         
/* 128 */         setRotation(90);
/* 129 */         move(5);
/* 130 */         setRotation(0);
/*     */       } 
/* 132 */       if (isAtEdge() && !this.placeHolder) {
/*     */         
/* 134 */         this.atEdge = true;
/* 135 */         setRotation(90);
/* 136 */         move(2);
/* 137 */         setRotation(0);
/* 138 */         this.placeHolder = true;
/*     */       } 
/* 140 */       if (isAtEdge() && this.placeHolder == true) {
/*     */         
/* 142 */         this.atEdge = false;
/* 143 */         setRotation(-90);
/* 144 */         move(2);
/* 145 */         setRotation(0);
/* 146 */         this.placeHolder = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void charge() {
/* 153 */     int maybe = Greenfoot.getRandomNumber(200);
/* 154 */     if (maybe == 1) {
/*     */       
/* 156 */       setRotation(0);
/* 157 */       this.nowMove = true;
/* 158 */       this.bounce = false;
/*     */     } 
/* 160 */     if (this.nowMove == true && !this.chargeBackReady) {
/*     */       
/* 162 */       setRotation(0);
/* 163 */       move(20);
/* 164 */       this.yetAnotherPlaceholder = true;
/*     */     } 
/* 166 */     if (this.nowMove == true && isAtEdge()) {
/*     */       
/* 168 */       this.nowMove = false;
/* 169 */       if (!this.chargeBackReady)
/*     */       {
/* 171 */         move(-100);
/*     */       }
/* 173 */       if (this.chargeBackReady == true)
/*     */       {
/* 175 */         move(100);
/*     */       }
/* 177 */       this.bounce = true;
/* 178 */       if (this.chargeBackReady == true && this.yetAnotherPlaceholder == true) {
/*     */         
/* 180 */         this.chargeBackReady = false;
/* 181 */         this.yetAnotherPlaceholder = false;
/* 182 */         setImage("BoarRight.png");
/* 183 */         this.LeftOrRight = false;
/*     */       } 
/* 185 */       if (!this.chargeBackReady && this.yetAnotherPlaceholder == true) {
/*     */         
/* 187 */         this.chargeBackReady = true;
/* 188 */         this.yetAnotherPlaceholder = false;
/* 189 */         setImage("BoarLeft.png");
/* 190 */         this.LeftOrRight = true;
/*     */       } 
/*     */     } 
/* 193 */     if (this.nowMove == true && this.chargeBackReady == true) {
/*     */       
/* 195 */       setRotation(180);
/* 196 */       move(20);
/* 197 */       setRotation(0);
/* 198 */       this.yetAnotherPlaceholder = true;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Boar.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */