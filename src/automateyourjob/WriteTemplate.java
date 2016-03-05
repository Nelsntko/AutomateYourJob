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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.text.JTextComponent;

/**
 *
 * @author ntko
 */
public class WriteTemplate {
    
    public WriteTemplate(String fileURL, JTextComponent... components) throws IOException{

        String[] textFieldContent = new String[components.length];
        
        for (int i = 0; i < components.length; ++i){
            textFieldContent[i] = components[i].getText();
        }
            BufferedWriter writer = null;
            writer = new BufferedWriter(new FileWriter(fileURL));
            for(int i = 0; i < components.length; i++)
            {
                writer.write(textFieldContent[i]);
                writer.append('¦');
            }
            writer.flush();
            writer.close();
    }
}