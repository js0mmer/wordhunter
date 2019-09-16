import greenfoot.*;

public class Gameover extends ActorMethods
{
    int actCount = 0;
    int var1 = 0;
    int var2 = -3;
    int transparency = 250;
    GreenfootImage img = getImage();
    public void act() 
    {
        if(var1==30)
        {
            var1 = 0;
            var2 *=-1;
        }
        else
        {
            var1++;
        }
        transparency += var2;
        if(actCount>60) img.setTransparency(transparency);
        actCount++;
    }    
}
