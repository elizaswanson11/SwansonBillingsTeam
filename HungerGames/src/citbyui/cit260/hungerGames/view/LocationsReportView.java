/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.MapControl;
import byui.cit260.hungerGames.control.ResourceControl;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author eswanso2
 */
class LocationsReportView extends View {
    public LocationsReportView() {
        super("\n\nEnter the file path for the file where the report "
                + "is to be saved.");
    }
    @Override
    public boolean doAction(String value) {
        try {
            MapControl.printLocationsReport(value);
            return true;
        } catch (FileNotFoundException fnfe) {
            ErrorView.display(this.getClass().getName(),"Error: invalid file location.");
            return false;
        } catch (IOException ioe) {
            ErrorView.display(this.getClass().getName(),ioe.getMessage());
            return false;
        }
    }
    
}
