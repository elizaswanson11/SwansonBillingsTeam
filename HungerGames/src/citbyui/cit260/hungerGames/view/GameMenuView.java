package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import hungergames.HungerGames;

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
              + "\nV - Print Resource Report"
              + "\nO - Open Rebellion Box"
              + "\nR - Calculate Max Resource Value"
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
            case "V":
                this.displayResourceReport();
                break;
            case "A":
                this.displayActionsMenu();
                break;
            case "O":
                this.doOpenRebellionBox();
                break;
            case "R":
                this.calcMaxResource();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try Again");
                break;
        }
        return false;
    }

    private void displayMap() {
        //BEGIN
        // get the 2-D locations array in the map in the current game
        Game game = HungerGames.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.locations;
        // PRINT the title
        // PRINT the column numbers in the header
        this.console.println("\n                      THE ARENA"
                + "\n                                                                                      "
                + "\n    0    1    2    3    4    5    6    7    8    9   ");
        // FOR every row in map
        for (int i = 0; i <= Map.rowCount; i++) {
            // PRINT a row divider
            this.console.println("-----------------------------------------------------");
        // PRINT the row number on a new line
            this.console.printf((i) + " "); 
        // FOR every column in row
            for (int w = 0; w <= Map.columnCount; w++) {
        // PRINT a column divider
                this.console.printf("|" + " ?? ");
        //location = locations[row][column]
        //location = locations[Map.rowCount][Map.columnCount];
        // IF location has been visited
        // PRINT the mapSymbol in the scene in this location
        // ELSE
        // DISPLAY " ?? "
            // ENDIF
            }
        // PRINT the ending column divider
        this.console.println("|  ");
        // ENDFOR
        }
// PRINT ending row divider
this.console.println("-----------------------------------------------------");
//END
}      
       
        
        
            
           
            
                
                

    private void displayCharacterStatistics() {
        CharacterStatReportView characterStatReportView = new CharacterStatReportView();
        characterStatReportView.display();
    }

    private void displayActionsMenu() {
        ActionMenuView actionMenuView = new ActionMenuView();
        actionMenuView.display();
    }
    
    private void doOpenRebellionBox() {
        RebellionBoxView rebellionBoxView = new RebellionBoxView();
        rebellionBoxView.display();
    }
    
    private void calcMaxResource() {
        CalcMaxResourceValueView calcMaxResourceValueView = new CalcMaxResourceValueView();
        calcMaxResourceValueView.display();
    }

    private void displayResourceReport() {
        ResourceReportView resourceReportView = new ResourceReportView();
        resourceReportView.display();
    }
}
