import greenfoot.*;

public class ActorMethods extends Actor
{
    public static int randomOne = 0;
    
    public static int getSoldierX = 500;
    public static int getSoldierY = 300;
    public static int getSoldierRotation = 0;
    public static int health = 3;
    
    public static int getShooter1X = 0;
    public static int getShooter1Y = 0;
    public static int getShooter1Rotation = 0;
    public static int getShooter2X = 0;
    public static int getShooter2Y = 0;
    public static int getShooter2Rotation = 0;
    public static int shooter1Status = 0;
    public static int shooter2Status = 0;
    public static int shooter1Active = 0;
    public static int shooter2Active = 0;
    
    public void act() 
    {
        
    } 
    
    public static void randomOne() 
    {
        if(randomOne==1)randomOne=-1;
        else randomOne=1;
    } 
}
