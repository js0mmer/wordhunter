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
/*    */ public class ShopBaconCount2
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Pig.SecondaryCount < 0)
/*    */     {
/* 19 */       Pig.SecondaryCount = 10 - Pig.SecondaryCount;
/*    */     }
/* 21 */     if (Pig.SecondaryCount == 0)
/*    */     {
/* 23 */       setImage("0.png");
/*    */     }
/* 25 */     if (Pig.SecondaryCount == 1)
/*    */     {
/* 27 */       setImage("1.png");
/*    */     }
/* 29 */     if (Pig.SecondaryCount == 2)
/*    */     {
/* 31 */       setImage("2.png");
/*    */     }
/* 33 */     if (Pig.SecondaryCount == 3)
/*    */     {
/* 35 */       setImage("3.png");
/*    */     }
/* 37 */     if (Pig.SecondaryCount == 4)
/*    */     {
/* 39 */       setImage("4.png");
/*    */     }
/* 41 */     if (Pig.SecondaryCount == 5)
/*    */     {
/* 43 */       setImage("5.png");
/*    */     }
/* 45 */     if (Pig.SecondaryCount == 6)
/*    */     {
/* 47 */       setImage("6.png");
/*    */     }
/* 49 */     if (Pig.SecondaryCount == 7)
/*    */     {
/* 51 */       setImage("7.png");
/*    */     }
/* 53 */     if (Pig.SecondaryCount == 8)
/*    */     {
/* 55 */       setImage("8.png");
/*    */     }
/* 57 */     if (Pig.SecondaryCount == 9)
/*    */     {
/* 59 */       setImage("9.png");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\ShopBaconCount2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */