/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;

/**
 *
 * @author eliza
 */
public class RebellionBoxView extends View {

    public RebellionBoxView() {
        super("\nWhat is your rebellion popularity level: ");
    }
    
    @Override
    public boolean doAction(String value) {
        
        double rebellionPopularity = Double.parseDouble(value);
        
        if (rebellionPopularity < 0) {
            System.out.println("Error. Invaild popularity value");
            return false;
        }
        else {
            this.displayMessage = "\nWhat is your capital popularity level: ";
        
            String CPV = this.getInput();
        
            double capitalPopularity = Double.parseDouble(CPV);
        
            double result = PuzzleCalculation.openRebellionBox(capitalPopularity, rebellionPopularity);
        
            if (result >= 0) {
                System.out.println("Congratulations your values were valid.");
                return true;
            }
            else {
                System.out.println("Error. Invaild popularity value");
                return false;
            }
        }
    }
        
    
}
