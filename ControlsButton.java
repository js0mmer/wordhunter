import greenfoot.*;

public class ControlsButton extends Actor
{
    GreenfootImage img = getImage();
    int mX = 0;
    int mY = 0;
    boolean active = false;
    Controls controls = new Controls();
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null)
        {
            mX = mouse.getX();
            mY = mouse.getY();
        }
        if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
        setImage("ControlsButton2.png");
        else setImage("ControlsButton.png");
        if(Greenfoot.mouseClicked(null))
        {
            if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
            {
                if(!active)
                {
                    getWorld().addObject(controls,300,230);
                    active = true;
                }
                else
                {
                    getWorld().removeObject(controls);
                    active = false;
                }
                setImage("ControlsButton3.png");
                Greenfoot.delay(3);
                setImage("ControlsButton2.png");
            }
            else setImage("ControlsButton.png");
        }
    }    
}
