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
public class PracticeTrainingView extends View {

    private String value;
    private int counter = 1;

    public PracticeTrainingView() {
        super("\nPlease enter a number between 1 and 9.");
    }

    @Override
    public boolean doAction(String value) {
        try {
            Integer number = Integer.parseInt(value);
            PuzzleCalculation.compareTraining(number);
            System.out.println("Congratulations you were successful in learning a new skill."
                    + "\n1 point has been added to your training level.");
            System.out.println("It took you " + counter + " times to guess the right answer.");
            return true;
        } catch (PuzzleCalculationException pce) {
            System.out.println(pce.getMessage());
            counter++;
            return false;
        } catch (NumberFormatException nfe) {
            System.out.println("Error. The value you entered was not a numeric number.");
            counter++;
            return false;
        }
    }
}
