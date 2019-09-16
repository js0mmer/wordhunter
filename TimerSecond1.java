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
/*    */ public class TimerSecond1
/*    */   extends Actor
/*    */ {
/* 16 */   int time = -200;
/* 17 */   int time2 = 0;
/*    */   boolean pow = true;
/*    */   
/*    */   public void act() {
/* 21 */     this.time++;
/* 22 */     this.time2++;
/* 23 */     if (this.time2 >= 6507) {
/*    */       
/* 25 */       setImage("0.png");
/* 26 */       this.pow = false;
/*    */     } 
/* 28 */     if (this.time < 530 && this.time > 0 && this.pow == true)
/*    */     {
/* 30 */       setImage("5.png");
/*    */     }
/* 32 */     if (this.time < 1060 && this.time > 530 && this.pow == true)
/*    */     {
/* 34 */       setImage("4.png");
/*    */     }
/* 36 */     if (this.time < 1590 && this.time > 1060 && this.pow == true)
/*    */     {
/* 38 */       setImage("3.png");
/*    */     }
/* 40 */     if (this.time < 2120 && this.time > 1590 && this.pow == true)
/*    */     {
/* 42 */       setImage("2.png");
/*    */     }
/* 44 */     if (this.time < 2650 && this.time > 2120 && this.pow == true)
/*    */     {
/* 46 */       setImage("1.png");
/*    */     }
/* 48 */     if (this.time < 3180 && this.time > 2650 && this.pow == true)
/*    */     {
/* 50 */       setImage("0.png");
/*    */     }
/* 52 */     if (this.time > 3180 && this.pow == true)
/*    */     {
/* 54 */       this.time = 0;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\TimerSecond1.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */