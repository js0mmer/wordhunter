/*     */ import greenfoot.Greenfoot;
/*     */ import greenfoot.GreenfootSound;
/*     */ import greenfoot.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HuntingGrounds
/*     */   extends World
/*     */ {
/*  16 */   int time = 0;
/*     */   boolean placeholder = true;
/*  18 */   GreenfootSound soundZ = new GreenfootSound("BossBattle.mp3");
/*     */ 
/*     */   
/*     */   public HuntingGrounds() {
/*  22 */     super(1200, 800, 1);
/*  23 */     prepare();
/*     */   }
/*     */ 
/*     */   
/*     */   public void act() {
/*  28 */     this.time++;
/*  29 */     if (Pig.PigCount < 6)
/*     */     {
/*  31 */       respawn();
/*     */     }
/*  33 */     if (Pig.BaconCount >= 10 && this.time > 6825 && this.placeholder == true) {
/*     */       
/*  35 */       Boar boar = new Boar();
/*  36 */       addObject(boar, 68, 402);
/*  37 */       this.soundZ.play();
/*  38 */       this.placeholder = false;
/*  39 */       Pig.runAway = 1;
/*     */     } 
/*  41 */     if (Boar.diedie == 1)
/*     */     {
/*  43 */       this.soundZ.stop();
/*     */     }
/*  45 */     if ((Pig.BaconCount < 10 && this.time > 6507) || Redneck.boarDie == 1) {
/*     */       
/*  47 */       GameOver GO = new GameOver();
/*  48 */       addObject(GO, 600, 400);
/*     */     } 
/*  50 */     if (Boar.radish == 1) {
/*     */       
/*  52 */       YouWin winner = new YouWin();
/*  53 */       addObject(winner, 600, 250);
/*  54 */       QUIT quit = new QUIT();
/*  55 */       addObject(quit, 580, 400);
/*  56 */       ShopTransfer strans = new ShopTransfer();
/*  57 */       addObject(strans, 570, 500);
/*     */     } 
/*  59 */     if (this.time < 10)
/*     */     {
/*  61 */       this.placeholder = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void respawn() {
/*  67 */     if (this.time < 6507) {
/*     */       
/*  69 */       int var = Greenfoot.getRandomNumber(150);
/*  70 */       if (var == 5) {
/*     */         
/*  72 */         Pig pignew = new Pig();
/*  73 */         addObject(pignew, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(800));
/*  74 */         Pig.PigCount++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void prepare() {
/*  85 */     Pig pig2 = new Pig();
/*  86 */     addObject(pig2, 142, 409);
/*  87 */     Pig pig3 = new Pig();
/*  88 */     addObject(pig3, 836, 650);
/*  89 */     Pig pig4 = new Pig();
/*  90 */     addObject(pig4, 1052, 392);
/*  91 */     Pig pig5 = new Pig();
/*  92 */     addObject(pig5, 818, 137);
/*  93 */     Pig pig6 = new Pig();
/*  94 */     addObject(pig6, 363, 106);
/*  95 */     Pig pig7 = new Pig();
/*  96 */     addObject(pig7, 387, 646);
/*  97 */     Redneck redneck = new Redneck();
/*  98 */     addObject(redneck, 600, 392);
/*  99 */     BaconCountPreset baconCountPreset = new BaconCountPreset();
/* 100 */     addObject(baconCountPreset, 43, 774);
/* 101 */     BaconCount1 baconCount1 = new BaconCount1();
/* 102 */     addObject(baconCount1, 89, 777);
/* 103 */     BaconCount2 baconCount2 = new BaconCount2();
/* 104 */     addObject(baconCount2, 121, 777);
/*     */     
/* 106 */     TimerMinute timerMinute = new TimerMinute();
/* 107 */     addObject(timerMinute, 29, 29);
/* 108 */     Colon colon = new Colon();
/* 109 */     addObject(colon, 51, 29);
/* 110 */     TimerSecond1 timerSecond1 = new TimerSecond1();
/* 111 */     addObject(timerSecond1, 72, 29);
/* 112 */     TimerSecond2 timerSecond2 = new TimerSecond2();
/* 113 */     addObject(timerSecond2, 102, 28);
/* 114 */     Start start = new Start();
/* 115 */     addObject(start, 600, 392);
/*     */     
/* 117 */     Boar.radish = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\HuntingGrounds.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */