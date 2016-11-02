/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class RebellionBoxView {
    private String displayMessage;

    void displayRebellionBoxView() {
        boolean done = false;
        do {
            String value = this.getValue();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);
    }
    
    public RebellionBoxView() {
        this.displayMessage = "\nWhat is your rebellion popularity level: ";
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
        double rebellionPopularity = Double.parseDouble(value);
        
        this.displayMessage = "\nWhat is your capital popularity level: ";
        
        String CPV = this.getValue();
        
        double capitalPopularity = Double.parseDouble(CPV);
        
        double result = PuzzleCalculation.openRebellionBox(capitalPopularity, rebellionPopularity);
        if (result >= 0) {
            System.out.println("The box has opened.");
            return true;
        }
        else {
            System.out.println("Error. Invaild popularity value");
            return false;
        }
    }
        
    
}
