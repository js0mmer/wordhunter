import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlType extends Actor
{
    GreenfootImage img = getImage();
    public static String controlType = "keys";
    int mX = 0;
    int mY = 0;
    public ControlType()
    {
        img1();
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null)
        {
            mX = mouse.getX();
            mY = mouse.getY();
        }
        if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
        ;//setImage("ControlsButton2.png");
        else ;//setImage("ControlsButton.png");
        if(Greenfoot.mouseClicked(null))
        {
            if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
            {
                //setImage("ControlsButton3.png");
                //Greenfoot.delay(3);
                if(controlType == "mouse")
                {
                    controlType = "keys";
                }
                else if(controlType == "keys")
                {
                    controlType = "mouse";
                }
                img1();
            }
            else ;//setImage("ControlsButton.png");
        }
    }    
    public void img1()
    {
        if(controlType == "mouse")
                {
                    setImage("ControlTypeMouse.png");
                }
                else if(controlType == "keys")
                {
                    setImage("ControlTypeKeys.png");
                }
    }
}
