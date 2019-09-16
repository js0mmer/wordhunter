import greenfoot.*;

public class Menu extends World
{
    VietnamWarfare vietnamWarfare = new VietnamWarfare();
    PlayButton playButton = new PlayButton();
    ControlsButton controlsButton = new ControlsButton();
    ControlType controlType = new ControlType();
    public Menu()
    {    
        super(600,450,1,false); 
        
        addObject(vietnamWarfare,25,75);
        addObject(playButton,175,375);
        addObject(controlsButton,425,375);
        addObject(controlType,549,59);
    }
}
