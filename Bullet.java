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
/*    */ public class Bullet
/*    */   extends Actor
/*    */ {
/* 16 */   public static int damage = 5;
/*    */ 
/*    */ 
/*    */   
/* 20 */   public Bullet(int angle) { setRotation(angle); }
/*    */ 
/*    */ 
/*    */   
/*    */   public void act() {
/* 25 */     move(10);
/* 26 */     removeMe();
/* 27 */     if (Redneck.gunMode == 1)
/*    */     {
/* 29 */       damage = 10;
/*    */     }
/* 31 */     if (Redneck.gunMode == 2)
/*    */     {
/* 33 */       damage = 8;
/*    */     }
/* 35 */     if (Redneck.gunMode == 3)
/*    */     {
/* 37 */       damage = 3;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeMe() {
/* 43 */     if (isAtEdge())
/*    */     {
/* 45 */       getWorld().removeObject(this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Bullet.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */