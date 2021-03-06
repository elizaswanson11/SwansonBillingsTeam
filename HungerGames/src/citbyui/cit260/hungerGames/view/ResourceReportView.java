/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;
import byui.cit260.hungerGames.model.Resource;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author eliza
 */
public class ResourceReportView extends View {

    public ResourceReportView() {
        super("\n\nEnter the file path for the file where the report "
                + "is to be saved.");
    }

    @Override
    public boolean doAction(String value) {
        try {
            ResourceControl.printResourceReport(value);
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
