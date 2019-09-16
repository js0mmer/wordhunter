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
/*    */ public class Pistol
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Greenfoot.mouseClicked(this) && Pig.BaconCount >= 20) {
/*    */       
/* 19 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 20 */       setImage("Blank.png");
/* 21 */       Pig.BaconCount -= 20;
/* 22 */       Redneck.gunMode = 1;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Pistol.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */