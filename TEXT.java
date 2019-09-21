import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spelling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEXT extends Actor
{
    /**
     * Constant storing a list of words to be used
     */
    private static final String[] WORDS = { "sidewalk", "robin", "three", "protect", "periodic",
    "somber", "majestic", "jump", "pretty", "wound", "jazzy",
    "memory", "join", "crack", "grade", "boot", "cloudy", "sick",
    "mug", "hot", "tart", "dangerous", "mother", "rustic", "economical",
    "weird", "cut", "parallel", "wood", "encouraging", "interrupt",
    "guide", "long", "chief", "mom", "signal", "rely", "abortive",
    "hair", "representative", "earth", "grate", "proud", "feel",
    "hilarious", "addition", "silent", "play", "floor", "numerous",
    "friend", "pizzas", "building", "organic", "past", "mute", "unusual",
    "mellow", "analytical", "crate", "homely", "protest", "hungry",
    "society", "head", "female", "eager", "heap", "dramatic", "present",
    "sin", "box", "pies", "awesome", "root", "available", "sleet", "wax",
    "boring", "smash", "anger", "tasty", "spare", "tray", "daffy", "scarce",
    "account", "spot", "thought", "distinct", "nimble", "practice", "cream",
    "ablaze", "thoughtless", "love", "verdict", "giant", "entrepreneur",
    "awesome", "undulating", "arid", "pungent", "application", "table", "chair",
    "excellent", "extraordinary", "ordinary", "immediate", "generator", "input",
    "meticulous", "rigorous", "extravagant", "preposterous", "illustrious",
    "unreasonable", "quadrilateral", "trigonometry", "pythagoras", "mathematician",
    "biotechnology", "philosophy", "psychology", "pharmaceutical", "technology",
    "engineering", "unavailable", "astrophysics", "recommendation", "procedure",
    "graduation", "concurrent", "enrollment", "appreciation", "production",
    "development", "international", "cooperation", "conceptual", "assignment",
    "expectation", "requirement", "education", "performance", "publication",
    "geography", "pavement", "boulevard", "skyscraper", "beginner",
    "intermediate", "advanced", "diversion", "counseling", "exemption",
    "independence", "responding", "presentation" };
    /**
     * Constant storing the RGBA value of a complete transparency (0, 0, 0, 0)
     */
    private static final Color ALPHA = new Color(0, 0, 0, 0);
    /**
     * One way flag that remembers whether or not the word has been prompted already
     */
    boolean askedOnce = false;
    /**
     * Act - do whatever the spelling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * Starts the spelling prompt when the object is added to the world
     */
    public void act() 
    {
        if (askedOnce == false) {
            spell();
            askedOnce = true;
            setImage(new GreenfootImage("", 0, Color.BLACK, ALPHA));
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Uses Math.random and casting to an integer to determine a random word to use.
     * Displays the word on the screen and prompts the user to type it.
     * Keeps re-prompting if they misspell it.
     * Speaks the word and definition using text-to-speech.
     */
    public void spell() {
        int word = (int) (Math.random() * WORDS.length);
        setImage(new GreenfootImage(WORDS[word], 150, Color.BLACK, ALPHA));
        String spell = "";
        while (!spell.toLowerCase().contains(WORDS[word])) {
            spell = Greenfoot.ask("Please spell the word: " + WORDS[word]);
        }
        TTS.speak(WORDS[word]);
        if (Wordnik.getDefinition(WORDS[word]) == null) {
            System.out.println(WORDS[word] + ": Definition Unknown");
        }
        else {
            System.out.println(WORDS[word] + ": " + Wordnik.getDefinition(WORDS[word]));
        }
   }
}    
