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
/*    */ public class BaconCount1
/*    */   extends Actor
/*    */ {
/* 15 */   int time = 0;
/*    */   
/*    */   public void act() {
/* 18 */     if (Pig.BaconCount < 10)
/*    */     {
/* 20 */       setImage("0.png");
/*    */     }
/* 22 */     if (Pig.BaconCount >= 10 && Pig.BaconCount < 20)
/*    */     {
/* 24 */       setImage("1.png");
/*    */     }
/* 26 */     if (Pig.BaconCount >= 20 && Pig.BaconCount < 30)
/*    */     {
/* 28 */       setImage("2.png");
/*    */     }
/* 30 */     if (Pig.BaconCount >= 30 && Pig.BaconCount < 40)
/*    */     {
/* 32 */       setImage("3.png");
/*    */     }
/* 34 */     if (Pig.BaconCount >= 40 && Pig.BaconCount < 50)
/*    */     {
/* 36 */       setImage("4.png");
/*    */     }
/* 38 */     if (Pig.BaconCount >= 50 && Pig.BaconCount < 60)
/*    */     {
/* 40 */       setImage("5.png");
/*    */     }
/* 42 */     if (Pig.BaconCount >= 60 && Pig.BaconCount < 70)
/*    */     {
/* 44 */       setImage("6.png");
/*    */     }
/* 46 */     if (Pig.BaconCount >= 70 && Pig.BaconCount < 80)
/*    */     {
/* 48 */       setImage("7.png");
/*    */     }
/* 50 */     if (Pig.BaconCount >= 80 && Pig.BaconCount < 90)
/*    */     {
/* 52 */       setImage("8.png");
/*    */     }
/* 54 */     if (Pig.BaconCount >= 90)
/*    */     {
/* 56 */       setImage("9.png");
/*    */     }
/* 58 */     this.time++;
/* 59 */     if (this.time == 1 && Back2.reset == 0)
/*    */     {
/* 61 */       Pig.BaconCount = 0;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\BaconCount1.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */