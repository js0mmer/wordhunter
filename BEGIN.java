/*    */ import greenfoot.Actor;
/*    */ import greenfoot.Greenfoot;
/*    */ import greenfoot.MouseInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BEGIN
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Greenfoot.mouseClicked(this)) {
/*    */       
/* 19 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 20 */       Greenfoot.setWorld(new HuntingGrounds());
/* 21 */       Boar.radish = 0;
/* 22 */       PoisonBullets.tranqOn = 0;
/* 23 */       HealthPotion.healthOn = 0;
/* 24 */       Medicine.speedOn = 0;
/* 25 */       Redneck.gunMode = 0;
/* 26 */       Pig.BaconCount = 0;
/* 27 */       Pig.SecondaryCount = 0;
/* 28 */       Boar.diedie = 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\BEGIN.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */