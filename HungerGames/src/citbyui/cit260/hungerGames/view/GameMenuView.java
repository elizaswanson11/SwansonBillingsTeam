package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;
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
              + "\nR - Open Rebellion Box"
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
            case "R":
                this.doOpenRebellionBox();
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
        System.out.println("*** The displayCharacterStatistics() was called ***");
    }

    private void displayActionsMenu() {
        System.out.println("*** The displayActionsMenu() was called ***");
    }

    private String promptMessage;
    private Double rebellionPopularity;
    private Double capitalPopularity;
    
    private void doOpenRebellionBox() {
     
        this.promptMessage = "\nWhat is your rebellion popularity level: ";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\n" + this.promptMessage);
        rebellionPopularity = keyboard.nextDouble();

        this.promptMessage = "\nWhat is your capital popularity level: ";
        
        System.out.println("\n" + this.promptMessage);
        capitalPopularity = keyboard.nextDouble();
        
        PuzzleCalculation rebellionCalculation = new PuzzleCalculation();
        rebellionCalculation.openRebellionBox(capitalPopularity, rebellionPopularity);
    }
}
