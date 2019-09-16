/*    */ import greenfoot.Actor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class YouWin
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Back2.rooster == 1) {
/*    */       
/* 19 */       getWorld().removeObject(this);
/* 20 */       Back2.rooster = 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\YouWin.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */