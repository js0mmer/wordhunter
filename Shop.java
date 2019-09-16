/*    */ import greenfoot.GreenfootSound;
/*    */ import greenfoot.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Shop
/*    */   extends World
/*    */ {
/* 11 */   GreenfootSound shopmuzak = new GreenfootSound("ShopMusic.mp3");
/* 12 */   int time = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Shop() {
/* 20 */     super(1200, 800, 1);
/* 21 */     prepare();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void prepare() {
/* 30 */     AssaultRifle assaultRifle = new AssaultRifle();
/* 31 */     addObject(assaultRifle, 596, 113);
/* 32 */     HealthPotion healthPotion = new HealthPotion();
/* 33 */     addObject(healthPotion, 291, 584);
/* 34 */     Medicine medicine = new Medicine();
/* 35 */     addObject(medicine, 530, 585);
/* 36 */     PoisonBullets poisonBullets = new PoisonBullets();
/* 37 */     addObject(poisonBullets, 757, 590);
/* 38 */     Pistol pistol = new Pistol();
/* 39 */     addObject(pistol, 395, 441);
/* 40 */     Shotgun shotgun = new Shotgun();
/* 41 */     addObject(shotgun, 579, 296);
/* 42 */     Back2 back2 = new Back2();
/* 43 */     addObject(back2, 1039, 735);
/* 44 */     back2.setLocation(932, 728);
/* 45 */     BaconCountPreset baconCountPreset = new BaconCountPreset();
/* 46 */     addObject(baconCountPreset, 41, 765);
/* 47 */     ShopBaconCount1 shopBaconCount1 = new ShopBaconCount1();
/* 48 */     addObject(shopBaconCount1, 88, 768);
/* 49 */     ShopBaconCount2 shopBaconCount2 = new ShopBaconCount2();
/* 50 */     addObject(shopBaconCount2, 126, 767);
/*    */   }
/*    */ 
/*    */   
/*    */   public void act() {
/* 55 */     if (this.time < 2)
/*    */     {
/* 57 */       this.shopmuzak.play();
/*    */     }
/* 59 */     this.time++;
/* 60 */     if (Back2.music == 1)
/*    */     {
/* 62 */       this.shopmuzak.stop();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Shop.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */