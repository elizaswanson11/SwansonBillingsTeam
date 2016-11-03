/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;
import java.util.Scanner;

/**
 *
 * @author elizaswanson
 */
public class DummyView {
    private String displayMessage;

    void displayDummyView() {
        boolean done = false;
        do {
            String value = this.getValue();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);
    }

    public DummyView() {
        this.displayMessage = "Enter in the number of resources you want.";
    }

    private String getValue() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
    
            while (!valid) {
                System.out.println("\n" + this.displayMessage);
        
                value = keyboard.nextLine();
                value = value.trim();
        
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
        
            break;
        }
    
        return value;
    }
    
    private boolean doAction(String value) {
        int resourceValue = Integer.parseInt(value);
        int returnValue = ResourceControl.dummyControl(resourceValue);
        if (returnValue == 1) {
            System.out.println("Your number is greater than 10.");
        }
        else if (returnValue == 0) {
            System.out.println("Your number is equal to 10.");
        }
        else {
            System.out.println("Your number is less than 10.");
        }
        return true;
    }   
}
