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
import com.google.common.io.Resources;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author ntko
 */
public class TemplateCreation {
    void TemplateCreation() throws IOException{
        File employment;
        File education;
        String dir = System.getenv("APPDATA") + "\\AYJ\\";
        employment = new File(dir, "employment.template");
        education = new File(dir, "education.template");
        URL educationURL = Resources.getResource("automateyourjob\\education.template");
        String educationText = Resources.toString(educationURL, Charsets.UTF_8);
        URL employmentURL = Resources.getResource("automateyourjob\\employment.template");
        String employmentText = Resources.toString(employmentURL, Charsets.UTF_8);
        
        if (!employment.exists()){
            employment.createNewFile();
            education.createNewFile();
            
            FileWriter f1 = new FileWriter(employment, false);
            f1.write(employmentText);
            f1.close();
            FileWriter f2 = new FileWriter(education, false);
            f2.write(educationText);
            f2.close();
            
        }
    }
}
