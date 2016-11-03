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
        String compareValue = "A";
        String compareSecondValue = "B";
       
        if (value.equals(compareValue)) {
            int reward = PuzzleCalculation.calcCornucopiaReward();
            System.out.println("Your reward is " + reward + ".");
        }
        else if (value.equals(compareSecondValue)) {
            System.out.println("You have avoided the bloodbath. You have incurred no injuries but earned no reward.");
        }
        else  {
            System.out.println("Invalid value. Please enter a valid value.");
            return false;
        }
        
        return true;
    }
}
