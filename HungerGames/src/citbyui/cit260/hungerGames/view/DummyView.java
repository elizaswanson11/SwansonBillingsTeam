/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;

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
        int resourceValue = Integer.parseInt(value);
        int returnValue = ResourceControl.dummyControl(resourceValue);
        if (returnValue == 2) {
            System.out.println("Your number is greater than 10.");
        }
        else if (returnValue == 1) {
            System.out.println("Your number is equal to 10.");
        }
        else if (returnValue == 0) {
            System.out.println("Your number is less than 10.");
        }
        else {
            System.out.println("Invalid value entered. Please enter a valid value.");
        }
        return true;
    }   
}