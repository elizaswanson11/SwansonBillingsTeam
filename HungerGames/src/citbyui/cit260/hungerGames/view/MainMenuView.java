/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

/**
 *
 * @author eliza
 */
public class MainMenuView {
    
    
    private String menu;

    void displayMainMenuView() {
        System.out.println("\n*** displayMenu() function called ***");
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
    
}

