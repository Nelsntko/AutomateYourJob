/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automateyourjob;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.AWTException;
/**
 *
 * @author ntko
 */
public class AltKey {
    public void AltKey(char letter) {

    try {
        int keyCode = KeyEvent.getExtendedKeyCodeForChar(letter);
        
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_2);
        // AutoHotKey needs to switch the tab to ensure that if the hotkey
        // process(es) are multi-threaded it prioritises them in the correct order
        r.delay(10); //set delay or it won't work.
        r.keyRelease(KeyEvent.VK_ALT);
        r.keyRelease(KeyEvent.VK_2); // ALT 2 to activate the window
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(keyCode);
        r.delay(20); //set the delay
        r.keyRelease(KeyEvent.VK_ALT);
        r.keyRelease(keyCode); // ALT keyCode to start custom command
   
    } catch(AWTException e) {
        }
    
    }
    
}
