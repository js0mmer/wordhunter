<<<<<<< HEAD
/*    */ import greenfoot.World;
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
/*    */ 
/*    */ 
/*    */ public class StartScreen
/*    */   extends World
/*    */ {
/*    */   public StartScreen() {
/* 19 */     super(1200, 800, 1);
/* 20 */     prepare();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void prepare() {
/* 29 */     INSTRUCTIONS iNSTRUCTIONS = new INSTRUCTIONS();
/* 30 */     addObject(iNSTRUCTIONS, 593, 596);
/* 31 */     BEGIN sTART = new BEGIN();
/* 32 */     addObject(sTART, 600, 476);
/* 33 */     QUIT qUIT = new QUIT();
/* 34 */     addObject(qUIT, 593, 704);
             TitleMenu title = new TitleMenu();
             addObject(title, 200, 200);
/*    */   }
/*    */ }


/* Location:              C:\Users\jacob\Desktop\jd\greenfoot6984158792478336299.jar!\StartScreen.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.0.7
 */
=======
import greenfoot.World;













public class StartScreen
  extends World
{
  public StartScreen() {
    super(1200, 800, 1);
    prepare();
  }





  
  private void prepare() {
    INSTRUCTIONS iNSTRUCTIONS = new INSTRUCTIONS();
    addObject(iNSTRUCTIONS, 593, 596);
    BEGIN sTART = new BEGIN();
    addObject(sTART, 600, 476);
    QUIT qUIT = new QUIT();
    addObject(qUIT, 593, 704);
  }
}


>>>>>>> abeccdadea413c761b053ae09cfe2a4b84545234
