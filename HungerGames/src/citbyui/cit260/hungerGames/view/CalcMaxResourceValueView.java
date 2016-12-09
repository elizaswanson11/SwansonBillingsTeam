/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;
import byui.cit260.hungerGames.model.Resource;
import citbyui.cit260.hungerGames.exceptions.ResourceControlException;

/**
 *
 * @author eliza
 */
public class CalcMaxResourceValueView extends View {

    public CalcMaxResourceValueView() {
        super("Do you want to calculate the max health value recieved from a resource?"
                + "\nY - Yes"
                + "\nN - No"
                + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "Y":
                this.calcMaxResource();
                break;
            case "N":
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try Again");
                break;
        }

        return true;
    }

    private void calcMaxResource() {
        try {
            ResourceControl.calcMaxResourceValue();
        } catch (ResourceControlException rce) {
            ErrorView.display(this.getClass().getName(),
                    rce.getMessage());
            return;
        }
        
        Resource[] resource = Resource.values();
        int maxAmount = 0;
        for (Resource item : resource) {
            if (item.healthValue > maxAmount) {
                maxAmount = item.healthValue;
            }
        }
        this.console.println("The max health value from a resource is " + maxAmount + ".");
    }
}
