package citbyui.cit260.hungerGames.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliza
 */
public class GameMenuView extends View{

    private String menu;

    public GameMenuView() {
        super("\n"
              + "\n--------------------------------"
              + "\n| Game Menu                    |"
              + "\n--------------------------------"
              + "\nM - Display Map"
              + "\nC - Character Statistics"
              + "\nA - Actions"
              + "\nR - Open Rebellion Box"
              + "\nQ - Quit"
              + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {
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
        ActionMenuView actionMenuView = new ActionMenuView();
        actionMenuView.display();
    }
    
    private void doOpenRebellionBox() {
        RebellionBoxView rebellionBoxView = new RebellionBoxView();
        rebellionBoxView.displayRebellionBoxView();
    }
}
