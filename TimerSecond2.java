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
/*    */ public class TimerSecond2
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
/* 27 */     if (this.time == 530 && this.pow == true)
/*    */     {
/* 29 */       this.time = 0;
/*    */     }
/* 31 */     if (this.time < 53 && this.time > 0 && this.pow == true)
/*    */     {
/* 33 */       setImage("9.png");
/*    */     }
/* 35 */     if (this.time < 106 && this.time > 53 && this.pow == true)
/*    */     {
/* 37 */       setImage("8.png");
/*    */     }
/* 39 */     if (this.time < 159 && this.time > 106 && this.pow == true)
/*    */     {
/* 41 */       setImage("7.png");
/*    */     }
/* 43 */     if (this.time < 212 && this.time > 159 && this.pow == true)
/*    */     {
/* 45 */       setImage("6.png");
/*    */     }
/* 47 */     if (this.time < 265 && this.time > 212 && this.pow == true)
/*    */     {
/* 49 */       setImage("5.png");
/*    */     }
/* 51 */     if (this.time < 318 && this.time > 265 && this.pow == true)
/*    */     {
/* 53 */       setImage("4.png");
/*    */     }
/* 55 */     if (this.time < 371 && this.time > 318 && this.pow == true)
/*    */     {
/* 57 */       setImage("3.png");
/*    */     }
/* 59 */     if (this.time < 424 && this.time > 371 && this.pow == true)
/*    */     {
/* 61 */       setImage("2.png");
/*    */     }
/* 63 */     if (this.time < 477 && this.time > 424 && this.pow == true)
/*    */     {
/* 65 */       setImage("1.png");
/*    */     }
/* 67 */     if (this.time < 530 && this.time > 477 && this.pow == true)
/*    */     {
/* 69 */       setImage("0.png");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\TimerSecond2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */