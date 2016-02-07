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
/**
 *
 * @author ntko
 */
public class AutomateYourJob {

    public static void main(String[] args) {
        try {
        EmploymentRef e = new EmploymentRef();
        e.EmploymentRef("D&G", "Susan", null, "01/01/2001", "02/02/2002",
                null, "22,500", true);
        }
        catch (IOException ex){
            System.out.println (ex.toString());
        }
    }
}
