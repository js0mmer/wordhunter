import greenfoot.*;

public class PlayButton extends Actor
{
    GreenfootImage img = getImage();
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
        if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
        setImage("PlayButton2.png");
        else setImage("PlayButton.png");
        if(Greenfoot.mouseClicked(null))
        {
            if(mX>=getX()-img.getWidth()/2 && mX<=getX()+img.getWidth()/2 && mY>=getY()-img.getHeight()/2 && mY<=getY()+img.getHeight()/2)
            {
                setImage("PlayButton3.png");
                Greenfoot.delay(3);
                setImage("PlayButton2.png");
                Greenfoot.delay(1);
                World vietnam = new Vietnam();
                Greenfoot.setWorld(vietnam);
            }
            else setImage("PlayButton.png");
        }
    }    
}
