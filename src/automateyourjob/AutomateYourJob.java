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
import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ntko
 */
public class AutomateYourJob {

    public static void main(String[] args) {

        EmploymentDetails e = new EmploymentDetails();
        try {
            e.EmploymentDetails("Susan", "HR", "12/12/2012", "01/01/2015", "Delivery Driver", null, true);
        } catch (IOException ex) {
            Logger.getLogger(AutomateYourJob.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
