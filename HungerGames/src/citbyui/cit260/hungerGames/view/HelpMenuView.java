/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import java.util.Scanner;

/**
 *
 * @author elizaswanson
 */
public class HelpMenuView {
        
    
    private String menu;

    void displayHelpMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }

    public HelpMenuView() {
        this.menu = "\n"
              + "\n--------------------------------"
              + "\n| Help Menu                    |"
              + "\n--------------------------------"
              + "\nM - Move Character"
              + "\nO - Game Objectives"
              + "\nP - About Popularity"
              + "\nQ - Quit"
              + "\n--------------------------------";
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
            case "M":
                this.viewMoveCharacter();
                break;
            case "O":
                this.viewGameObjectives();
                break;
            case "P":
                this.viewAboutPopularity();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }   

    private void viewAboutPopularity() {
        System.out.println("\n*** viewAboutPopularity stub function called ***");
    }

    private void viewGameObjectives() {
        System.out.println("\n*** viewGameObjectives stub function called ***");
    }

    private void viewMoveCharacter() {
        System.out.println("\n*** wiewMoveCharacter stub function called ***");
    }
}
