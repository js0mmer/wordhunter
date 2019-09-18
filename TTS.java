import java.util.Locale; 
import javax.speech.Central; 
import javax.speech.synthesis.Synthesizer; 
import javax.speech.synthesis.SynthesizerModeDesc; 
import java.io.FileOutputStream;
import java.io.OutputStream;
/**
 * Class for handling text to speech
 * 
 * @author Jacob Sommer
 * @version 2019-09-17
 */
public class TTS  
{
    
    private static boolean setup = false;
    
    private static void setupSynthesizer() {
        try {
            // Set property as Kevin Dictionary 
            System.setProperty( 
                "freetts.voices", 
                "com.sun.speech.freetts.en.us"
                    + ".cmu_us_kal.KevinVoiceDirectory");
    
            // Register Engine 
            Central.registerEngineCentral(
                "com.sun.speech.freetts"
                + ".jsapi.FreeTTSEngineCentral");
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
    
    public static void speak(String text) {
        try {
            if (!setup) { // if not set up, set it up
                setupSynthesizer();
                setup = true;
            }
            
            // Create a Synthesizer 
            Synthesizer synthesizer 
                = Central.createSynthesizer(
                    new SynthesizerModeDesc(Locale.US));
            // Allocate synthesizer 
            synthesizer.allocate(); 
  
            // Resume Synthesizer 
            synthesizer.resume(); 
  
            // Speaks the given text 
            // until the queue is empty. 
            synthesizer.speakPlainText( 
                text, null); 
            synthesizer.waitEngineState( 
                Synthesizer.QUEUE_EMPTY); 
  
            // Deallocate the Synthesizer. 
            // synthesizer.deallocate();  // don't do that, seems to break it
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
}
