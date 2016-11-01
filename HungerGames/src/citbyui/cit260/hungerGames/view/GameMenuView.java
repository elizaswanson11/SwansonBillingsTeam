package citbyui.cit260.hungerGames.view;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliza
 */
public class GameMenuView {
    
    private String menu;

    void displayGameMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    public GameMenuView() {
        this.menu = "\n"
              + "\n--------------------------------"
              + "\n| Game Menu                    |"
              + "\n--------------------------------"
              + "\nM - Display Map"
              + "\nC - Character Statistics"
              + "\nA - Actions"
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
                this.displayMap();
                break;
            case "C":
                this.displayCharacterStatistics();
                break;
            case "A":
                this.displayActionsMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        return false;
    }

    private void displayMap() {
        System.out.println("*** The displayMap() was called ***");
        
    }

    private void displayCharacterStatistics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayActionsMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
