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
/*    */ public class Back2
/*    */   extends Actor
/*    */ {
/* 15 */   public static int macarel = 0;
/* 16 */   public static int reset = 0;
/* 17 */   public static int rooster = 0;
/* 18 */   public static int chicken = 0;
/* 19 */   public static int reebok = 0;
/* 20 */   public static int music = 0;
/*    */   
/*    */   public void act() {
/* 23 */     if (Greenfoot.mouseClicked(this)) {
/*    */       
/* 25 */       MouseInfo mouse = Greenfoot.getMouseInfo();
/* 26 */       Greenfoot.setWorld(new HuntingGrounds());
/* 27 */       reset = 1;
/* 28 */       macarel = 1;
/* 29 */       Boar.radish = 0;
/* 30 */       rooster = 1;
/* 31 */       chicken = 1;
/* 32 */       reebok = 1;
/* 33 */       music = 1;
/* 34 */       Boar.diedie = 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Back2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */