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
public class HelpMenuView extends View{

    public HelpMenuView() {
        super("\n"
              + "\n--------------------------------"
              + "\n| Help Menu                    |"
              + "\n--------------------------------"
              + "\nM - Move Character"
              + "\nO - Game Objectives"
              + "\nP - About Popularity"
              + "\nQ - Quit"
              + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
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
