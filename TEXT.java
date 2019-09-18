import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;

/**
 * Write a description of class spelling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEXT extends Actor
{
    /**
     * Act - do whatever the spelling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(String word) 
    {
        setImage(new GreenfootImage(word, 100, Color.BLACK, Color.WHITE));
    }    
}
