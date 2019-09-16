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
/*    */ public class Shotgun
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 30) {
/*    */       
/* 19 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 20 */       setImage("Blank.png");
/* 21 */       Pig.BaconCount -= 30;
/* 22 */       Redneck.gunMode = 2;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Shotgun.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */