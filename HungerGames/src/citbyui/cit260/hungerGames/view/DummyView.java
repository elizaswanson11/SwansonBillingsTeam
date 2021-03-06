/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;
import citbyui.cit260.hungerGames.exceptions.ResourceControlException;

/**
 *
 * @author elizaswanson
 */
public class DummyView extends View {

    public DummyView() {
        super("Enter in the number of resources you want.");
    }

    @Override
    public boolean doAction(String value) {
        int resourceValue;
        try {
            resourceValue = Integer.parseInt(value);
            ResourceControl.dummyControl(resourceValue);
            this.console.println("Congrats! Your number is equal to ten.");
        } catch (ResourceControlException rce) {
            ErrorView.display(this.getClass().getName(),
                    rce.getMessage());
            return false;
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(),
                    "You must enter a valid number. Try again.");
            return false;
        }

        return true;
    }
}
