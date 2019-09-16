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
/*    */ public class PoisonBullets
/*    */   extends Actor
/*    */ {
/* 15 */   public static int tranqOn = 0;
/*    */   
/*    */   public void act() {
/* 18 */     if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 20) {
/*    */       
/* 20 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 21 */       setImage("Blank.png");
/* 22 */       tranqOn = 1;
/* 23 */       Pig.BaconCount -= 20;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\PoisonBullets.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */