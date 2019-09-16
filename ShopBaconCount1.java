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
/*    */ public class ShopBaconCount1
/*    */   extends Actor
/*    */ {
/*    */   public void act() {
/* 17 */     if (Pig.BaconCount < 10)
/*    */     {
/* 19 */       setImage("0.png");
/*    */     }
/* 21 */     if (Pig.BaconCount >= 10 && Pig.BaconCount < 20)
/*    */     {
/* 23 */       setImage("1.png");
/*    */     }
/* 25 */     if (Pig.BaconCount >= 20 && Pig.BaconCount < 30)
/*    */     {
/* 27 */       setImage("2.png");
/*    */     }
/* 29 */     if (Pig.BaconCount >= 30 && Pig.BaconCount < 40)
/*    */     {
/* 31 */       setImage("3.png");
/*    */     }
/* 33 */     if (Pig.BaconCount >= 40 && Pig.BaconCount < 50)
/*    */     {
/* 35 */       setImage("4.png");
/*    */     }
/* 37 */     if (Pig.BaconCount >= 50 && Pig.BaconCount < 60)
/*    */     {
/* 39 */       setImage("5.png");
/*    */     }
/* 41 */     if (Pig.BaconCount >= 60 && Pig.BaconCount < 70)
/*    */     {
/* 43 */       setImage("6.png");
/*    */     }
/* 45 */     if (Pig.BaconCount >= 70 && Pig.BaconCount < 80)
/*    */     {
/* 47 */       setImage("7.png");
/*    */     }
/* 49 */     if (Pig.BaconCount >= 80 && Pig.BaconCount < 90)
/*    */     {
/* 51 */       setImage("8.png");
/*    */     }
/* 53 */     if (Pig.BaconCount >= 90)
/*    */     {
/* 55 */       setImage("9.png");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\ShopBaconCount1.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */