import greenfoot.*;

public class TitleMe
{
    GreenfootImage img = getImage();
    boolean selected = false;
    int mX = 0;
    int mY = 0;
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null)
        {
            mX = mouse.getX();
            mY = mouse.getY();
        }
        move();
    }
    
    public void move() 
    {
        if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
        {
            if(getX()<150) setLocation(getX()+5,getY());
        }
        else if(getX()>25) setLocation(getX()-5,getY());
    }    
}
