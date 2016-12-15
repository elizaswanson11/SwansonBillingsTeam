/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import citbyui.cit260.hungerGames.exceptions.PuzzleCalculationException;
import java.util.Random;

/**
 *
 * @author elizaswanson
 */
public class PuzzleCalculation {

    /*calcCornucopiaReward(cornucopiaAnswer) {
    BEGIN
    IF (cornucopiaAnswer == FALSE) THEN
    RETURN 11
    ELSE {
    percentageWin = Math.rand(1, 100)
    IF (percentageWin <= 25 AND > 5) {
            cornucopiaAward = (Math.rand(1, 4) * 2) * -1
    }
    ELSE IF (percentageWin <= 5){
            cornucopiaAward = -15
    }
    ELSE {
            cornucopiaAward = (Math.rand(1, 5) * 2) 
    }
    }
    RETURN cornucopiaAward
    } */
    public static int calcCornucopiaReward()
            throws PuzzleCalculationException {
        Random random = new Random();
        int cornucopiaAward;
        int percentageWin = 0;
        try {
            percentageWin = random.nextInt(99) + 1;
        } catch (NumberFormatException nf) {
            throw new PuzzleCalculationException("The calclulation could not be completed, as the input was a numerical number");
        }

        if (percentageWin <= 25 && percentageWin > 5) {
            cornucopiaAward = random.nextInt(3) + 1;
        } else if (percentageWin <= 5) {
            cornucopiaAward = -15;
        } else {
            cornucopiaAward = random.nextInt(4) + 1;
        }
        return cornucopiaAward;

    }

    public static double openRebellionBox(double capitolPopularity, double rebellionPopularity)
            throws PuzzleCalculationException {
        //double openRebellionBox(double capitolPopularity, double rebellionPopularity) {
        //BEGIN
        //IF (capitolPopularity < 0 OR capitolPopularity > 15) THEN
        //  RETURN -1
        //IF (rebellionPopularity < 1 OR rebellionPopularity > 15) THEN
        //  RETURN -1
        //differenceScore = (rebellionPopularity – capitolPopularity) * 100
        //IF(differenceScore > 100) THEN
        //  RETURN 1
        //ELSE
        //  RETURN 0
        //  }
        //}

        if (capitolPopularity < 0 || capitolPopularity > 15) {
            throw new PuzzleCalculationException("Cannot complete calculation. Capital Popularity out of bounds.");
        }
        if (rebellionPopularity < 0 || rebellionPopularity > 15) {
            throw new PuzzleCalculationException("Cannot complete calculation. Rebellion Popularity out of bounds.");
        }

        double differenceScore = (rebellionPopularity - capitolPopularity) * 100;
        if (differenceScore > 100) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void compareTraining(Integer number)
            throws PuzzleCalculationException {
        Random random = new Random();
        Integer numberTwo = random.nextInt(8) + 1;

        if (number < 0 || number > 9) {
            throw new PuzzleCalculationException("Invalid Entry: Please input a number between 0 and 9.");
        } else if (number != numberTwo) {
            throw new PuzzleCalculationException("I'm sorry, your number was not correct."
                    + "\nPlease enter a new number and try again.");
        }
    }

    public static int calcRebelNoteReward()
            throws PuzzleCalculationException {
        Random random = new Random();
        int rebelNoteAward;
        int pointsWin = 0;
        try {
            rebelNoteAward = random.nextInt(99) + 1;
        } catch (NumberFormatException nf) {
            throw new PuzzleCalculationException("The calclulation could not be completed, as the input was invalid");
        }

        if (rebelNoteAward <= 50) {
            rebelNoteAward = random.nextInt(9) + 1;
        } else {
            rebelNoteAward = random.nextInt(3) + 1;
        }
        return rebelNoteAward;
    }
    
    public static int calcAdditionToPopularity()
            throws PuzzleCalculationException {
        Random random = new Random();
        int additionalPop;
        
        try {
            additionalPop = random.nextInt(5) + 1;
        } catch (NumberFormatException nf) {
            throw new PuzzleCalculationException("The calclulation could not be completed, as the input was invalid");
        }
        
        return additionalPop;
    }

}
