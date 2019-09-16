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
/*    */ 
/*    */ public class ShopTransfer
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 18 */     if (Greenfoot.mouseClicked(this)) {
/*    */       
/* 20 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 21 */       Greenfoot.setWorld(new Shop());
/* 22 */       Back2.music = 0;
/*    */     } 
/* 24 */     if (Back2.reebok == 1) {
/*    */       
/* 26 */       getWorld().removeObject(this);
/* 27 */       Back2.reebok = 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\ShopTransfer.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */