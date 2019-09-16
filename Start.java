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
/*    */ public class Start
/*    */   extends Actor
/*    */ {
/* 15 */   int time = 0;
/*    */   
/*    */   public void act() {
/* 18 */     this.time++;
/* 19 */     if (this.time == 2)
/*    */     {
/* 21 */       setImage("Three.png");
/*    */     }
/* 23 */     if (this.time == 50)
/*    */     {
/* 25 */       setImage("Two.png");
/*    */     }
/* 27 */     if (this.time == 100)
/*    */     {
/* 29 */       setImage("One.png");
/*    */     }
/* 31 */     if (this.time == 150)
/*    */     {
/* 33 */       setImage("Hunt!.png");
/*    */     }
/* 35 */     if (this.time == 200) {
/*    */       
/* 37 */       setImage("Blank.png");
/* 38 */       Boar.radish = 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\Start.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */