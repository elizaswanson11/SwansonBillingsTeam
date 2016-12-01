/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;
import citbyui.cit260.hungerGames.exceptions.PuzzleCalculationException;

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
        double rebellionPopularity;

        try {
            rebellionPopularity = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("Error. Invaild popularity value");
            return false;
        }
        
        double capitalPopularity = 0;
        
        boolean isBad = true;
        while (isBad) {
            this.displayMessage = "\nWhat is your capital popularity level: ";

            String CPV = this.getInput();

            try {
                capitalPopularity = Double.parseDouble(CPV);
                isBad = false;
            } catch (NumberFormatException nf) {
                System.out.println("Error. Invaild popularity value");
            }
        }
        
        try {
            double result = PuzzleCalculation.openRebellionBox(capitalPopularity, rebellionPopularity);
            System.out.println("Congratulations your values were valid.");
            return true;
        } catch (PuzzleCalculationException pce) {
            System.out.println(pce.getMessage());
            this.displayMessage = "\nWhat is your rebellion popularity level: ";
            return false;
        }

    }

}
