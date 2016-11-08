/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import hungergames.HungerGames;
/**
 *
 * @author eliza
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
              + "\n--------------------------------"
              + "\n| Main Menu                    |"
              + "\n--------------------------------"
              + "\nB - Begin new game"
              + "\nS - Save Game"
              + "\nO - Open a saved game" 
              + "\nH - Help Menu" 
              + "\nC - Cornucopia View"
              + "\nD - Dummy View"  
              + "\nQ - Quit"
              + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
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
            case "C":
                this.displayCornucopiaView();
                break;
            case "D":
                this.displayDummyView();
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
        gameMenu.display();
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
    private void displayCornucopiaView() {
        CornucopiaView cornucopiaView = new CornucopiaView();
        cornucopiaView.display();
    }

    private void displayDummyView() {
        DummyView dummyView = new DummyView();
        dummyView.display();
    }
}

