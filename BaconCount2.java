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
/*    */ public class BaconCount2
/*    */   extends Actor
/*    */ {
/* 15 */   int time = 0;
/*    */   
/*    */   public void act() {
/* 18 */     if (Pig.SecondaryCount < 0)
/*    */     {
/* 20 */       Pig.SecondaryCount = 10 - Pig.SecondaryCount;
/*    */     }
/* 22 */     if (Pig.SecondaryCount == 0)
/*    */     {
/* 24 */       setImage("0.png");
/*    */     }
/* 26 */     if (Pig.SecondaryCount == 1)
/*    */     {
/* 28 */       setImage("1.png");
/*    */     }
/* 30 */     if (Pig.SecondaryCount == 2)
/*    */     {
/* 32 */       setImage("2.png");
/*    */     }
/* 34 */     if (Pig.SecondaryCount == 3)
/*    */     {
/* 36 */       setImage("3.png");
/*    */     }
/* 38 */     if (Pig.SecondaryCount == 4)
/*    */     {
/* 40 */       setImage("4.png");
/*    */     }
/* 42 */     if (Pig.SecondaryCount == 5)
/*    */     {
/* 44 */       setImage("5.png");
/*    */     }
/* 46 */     if (Pig.SecondaryCount == 6)
/*    */     {
/* 48 */       setImage("6.png");
/*    */     }
/* 50 */     if (Pig.SecondaryCount == 7)
/*    */     {
/* 52 */       setImage("7.png");
/*    */     }
/* 54 */     if (Pig.SecondaryCount == 8)
/*    */     {
/* 56 */       setImage("8.png");
/*    */     }
/* 58 */     if (Pig.SecondaryCount == 9)
/*    */     {
/* 60 */       setImage("9.png");
/*    */     }
/* 62 */     this.time++;
/* 63 */     if (this.time == 1 && Back2.reset == 0)
/*    */     {
/* 65 */       Pig.SecondaryCount = 0;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\BaconCount2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */