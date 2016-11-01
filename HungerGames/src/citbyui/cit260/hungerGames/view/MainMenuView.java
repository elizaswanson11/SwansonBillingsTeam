/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import java.util.Scanner;
import byui.cit260.hungerGames.control.GameControl;
import hungergames.HungerGames;
/**
 *
 * @author eliza
 */
public class MainMenuView {
    
    
    private String menu;

    void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }

    public MainMenuView() {
        this.menu = "\n"
              + "\n--------------------------------"
              + "\n| Main Menu                    |"
              + "\n--------------------------------"
              + "\nB - Begin new game"
              + "\nS - Save Game"
              + "\nO - Open a saved game"
              + "\nH - Help Menu"
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
            case "B":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "O":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }   

    private void startNewGame() {
        GameControl.createNewGame(HungerGames.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
}

