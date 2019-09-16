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
/*    */ public class TimerMinute
/*    */   extends Actor
/*    */ {
/* 15 */   int time = -200;
/* 16 */   int time2 = 0;
/*    */   boolean pow = true;
/*    */   
/*    */   public void act() {
/* 20 */     this.time++;
/* 21 */     this.time2++;
/* 22 */     if (this.time2 >= 6507) {
/*    */       
/* 24 */       setImage("0.png");
/* 25 */       this.pow = false;
/*    */     } 
/* 27 */     if (this.time > 3180 && this.pow == true)
/*    */     {
/* 29 */       setImage("0.png");
/*    */     }
/* 31 */     if (this.time > 0 && this.time < 3180 && this.pow == true)
/*    */     {
/* 33 */       setImage("1.png");
/*    */     }
/* 35 */     if (this.time < 0 && this.pow == true)
/*    */     {
/* 37 */       setImage("2.png");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\TimerMinute.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */