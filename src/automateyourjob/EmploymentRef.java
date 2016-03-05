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

import com.google.common.base.Charsets;
import java.io.IOException;
import java.net.URL;
import com.google.common.io.Resources;
/**
 *
 * @author ntko
 */
public class EmploymentRef {
    // This should take the input from the GUI, merge it with the ReadTemplate
    // and paste it where it belongs.
    public String EmploymentRef(String company, String ref, String title, String dateStart,
            String dateEnd, String position, String salary, boolean info) throws IOException {
        
        URL url = Resources.getResource("src\\automateyourjob\\employment.template");
        String content = Resources.toString(url, Charsets.UTF_8);
        
        //check for nulls so the write-up still makes sense if there is no data for a variable.
        if (position == null && salary == null){
            content = content.replaceAll(" in the position of <position> with"
                    + " a salary of <salary>", ".");            
        }        
        else if (salary == null){
            content = content.replaceAll(" with a salary of <salary>", ".");
        } 
        else if (position == null){
            content = content.replaceAll(" in the position of <position>", "");            
        }

        content = content.replaceAll("<position>", position);
        content = content.replaceAll("<salary>", salary);        

        if (title == null){
            content = content.replaceAll("<title>", "").replaceAll(" \\(", "")
                    .replaceAll("\\)", "");
        }
        else {
            content = content.replaceAll("<title>", title);
        }
        if (ref == null){
            content = content.replaceAll("<ref>", company);
        }
        else {
            content = content.replaceAll("<ref>", ref);
        }


        content = content.replaceAll("<date start>", dateStart);
        content = content.replaceAll("<date end>", dateEnd);
        
        if (info){
            content = content.replaceAll("<info>", "The referee described the "
                    + "Candidate as " + "\r\n" + "\r\n" + "They further advised"
                    + " that the Candidate was honest and showed integrity, and"
                    + " the Candidate's health and disciplinary record were "
                    + "clean." + "\r\n" + "\r\n" + "The reason for leaving "
                    + "stated was XXX and the Company would re-employ the "
                    + "Candidate.");            
        }
        else { // delete info and two new lines.
            content = content.replaceAll("<info>" + "\r\n" + "\r\n", "");
        }
        return content;
        
    }
}