/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

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

    public double calcCornucopiaReward(boolean cornucopiaAnswer) {
        Random random = new Random();
        int cornucopiaAward;
        if (cornucopiaAnswer == false) {
            return 11;
        }
        else {
            int percentageWin = random.nextInt(99) + 1;
            if (percentageWin <= 25 && percentageWin > 5) {
                cornucopiaAward = random.nextInt(3) + 1;
            }
            else if (percentageWin <= 5) {
                cornucopiaAward = -15;
            }
            else {
                cornucopiaAward = random.nextInt(4) + 1;
            }
        }
        return cornucopiaAward; 
    }
    


    public static double openRebellionBox(double capitolPopularity, double rebellionPopularity) {
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
            return -1;
        }
        if (rebellionPopularity < 0 || rebellionPopularity > 15){
            return -1;
        }
        
        double differenceScore = (rebellionPopularity - capitolPopularity) * 100;
        if (differenceScore > 100) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
