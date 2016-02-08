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
 
 public class KeyReader {
	 
	 public void KeyReader(String ref){
		try {
			Robot r = new Robot();
			CharSequence characters = ref;
			int length = characters.length();
			
			for (int i = 0; i < length; i++) {
				int	keyCode = KeyEvent.getExtendedKeyCodeForChar(characters.charAt(i));
				characters
				r.keyPress(keyCode);
				r.delay(10);
				r.keyRelease(keyCode);
			}
		} catch(AWTException e) {
        }
	 }
 }
