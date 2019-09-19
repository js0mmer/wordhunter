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
    private String[] words = new String[]{ "test", "gay", "bruh", "moment" };
    Color alpha = new Color(0, 0, 0, 0);
    boolean askedOnce = false;
    /**
     * Act - do whatever the spelling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (askedOnce == false) {
            spell();
            askedOnce = true;
            setImage(new GreenfootImage("", 0, Color.BLACK, alpha));
            getWorld().removeObject(this);
        }
    }
    
    public void spell() {
        int word = Greenfoot.getRandomNumber(words.length);
        setImage(new GreenfootImage(words[word], 300, Color.BLACK, alpha));
        String spell = Greenfoot.ask("Please spell the word: " + words[word]);
        while (!spell.toLowerCase().contains(words[word])) {
            spell = Greenfoot.ask("Please spell the word: " + words[word]);
            if (spell.contains(words[word])) {
                TTS.speak(words[word]);
                break;
            }
        }
    }
}    
