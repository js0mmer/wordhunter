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
/*    */ public class BACK
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Greenfoot.mouseClicked(this)) {
/*    */       
/* 19 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 20 */       Greenfoot.setWorld(new StartScreen());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\BACK.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */