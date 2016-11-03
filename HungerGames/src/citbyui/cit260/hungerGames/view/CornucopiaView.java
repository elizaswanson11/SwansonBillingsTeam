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
 * @author elizaswanson
 */
public class CornucopiaView {
    private String menu;

    void displayCornucopiaView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }

    public CornucopiaView() {
        this.menu = "\n"
              + "\n------------------------------------------------------------"
              + "\n| At the beginning of the games, do you..                  |"
              + "\n------------------------------------------------------------"
              + "\nA - Run to the Cornucopia and participate in the bloodbath"
              + "\nB - Escape into the woods"
              + "\n------------------------------------------------------------";
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
    
            while (!valid) {
                System.out.println("\n" + this.menu);
        
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
        value = value.toUpperCase();
        
        switch (value) {
            case "A": 
                this.calcCornucopiaReward();
                return true;
            case "B":
                System.out.println("\nYou have avoided the bloodbath. "
                + "You have sustained no injuries, but have gained no rewards.");
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void calcCornucopiaReward() {
       System.out.println("\n*** calcCornucopiaReward stub function called ***");
    }
}
