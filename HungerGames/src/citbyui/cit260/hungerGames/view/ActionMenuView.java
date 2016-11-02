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
public class ActionMenuView {    
    private String menu;

    void displayActionMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }

    public ActionMenuView() {
        this.menu = "\n"
              + "\n----------------------------------------------"
              + "\n|   Action Menu                              |"
              + "\n----------------------------------------------"
              + "\nG - Gather Resources"
              + "\nA - Ask for resources from sponsors"
              + "\nU - Use Resources (convert into health points)"
              + "\nQ - Quit"
              + "\n----------------------------------------------";
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
            case "G":
                this.gatherResources();
                break;
            case "A":
                this.askForResources();
                break;
            case "U":
                this.useResources();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }   

    private void gatherResources() {
        System.out.println("\n*** gatherResources stub function called ***");
    }

    private void askForResources() {
        System.out.println("\n*** askForResources stub function called ***");
    }

    private void useResources() {
       System.out.println("\n*** useResources stub function called ***");
    }
}
