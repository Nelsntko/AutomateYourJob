/*
 * Copyright (C) 2016 ntko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
        // eventually I will cycle out the use of AutoHotKey but in a manner
        // that doesn't affect the end user. i.e. me and my colleagues.
        r.delay(10); //set delay or it won't work.
        r.keyRelease(KeyEvent.VK_ALT);
        r.keyRelease(KeyEvent.VK_2); // ALT 2 to activate the window with AHK
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(keyCode);
        r.delay(20);
        r.keyRelease(KeyEvent.VK_ALT);
        r.keyRelease(keyCode); // ALT keyCode to start custom command
   
    } catch(AWTException e) {
        }
    
    }
    
}
