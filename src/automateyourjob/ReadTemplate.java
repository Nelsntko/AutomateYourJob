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
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author ntko
 */
public class ReadTemplate {

    public ArrayList<String> ReadTemplate(String fileName) throws IOException {

            URL url = Resources.getResource(fileName);
            String text = Resources.toString(url, Charsets.UTF_8);
            ArrayList<String> textArray = new ArrayList<>(Arrays.asList(text.split("¦")));
            return textArray;
        }
}
    