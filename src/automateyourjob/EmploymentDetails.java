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

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ntko
 */
public class EmploymentDetails {
    // This should take the input from the GUI, merge it with the ReadTemplate
    // and paste it where it belongs.
    public void EmploymentDetails(String ref, String title, String dateStart,
            String dateEnd, String position, String salary, boolean info) throws IOException{
        
        Path path = Paths.get("employment.txt");

        Charset charset = StandardCharsets.UTF_8;

        String content = new String(Files.readAllBytes(path), charset);
        
        //copy original to write back to file.
        String original = new String(Files.readAllBytes(path), charset); 

        //check for nulls so the write-up still works if there is no data for a variable.
        if (position == null && salary == null){
            content = content.replaceAll(" in the position of [POSITION] with"
                    + " a salary of [SALARY]", ".");            
        }        
        else if (salary == null){
            content = content.replaceAll(" with a salary of [SALARY]", ".");
        } 
        else if (position == null){
            content = content.replaceAll("in the position of [POSITION]", ".");            
        }

        content = content.replaceAll("[REF]", ref);
        content = content.replaceAll("[TITLE]", title);
        content = content.replaceAll("[DATESTART]", dateStart);
        content = content.replaceAll("[DATEEND]", dateEnd);
        content = content.replaceAll("[POSITION]", position);
        content = content.replaceAll("[SALARY]", salary);
        
        if (info){
            content = content.replaceAll("[INFO]", "The referee described the "
                    + "Candidate as " + "\r\n" + "\r\n" + "They further advised"
                    + " that the Candidate was honest and showed integrity, and"
                    + " the Candidate's health and disciplinary record were "
                    + "clean." + "\r\n" + "\r\n" + "The reason for leaving "
                    + "stated was XXX and the Company would re-employ the "
                    + "Candidate.");            
        }
        System.out.print(content);
        Files.write(path, content.getBytes(charset));
    }
}
