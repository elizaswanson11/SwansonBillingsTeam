/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

/**
 *
 * @author elizaswanson
 */
public class PuzzleCalculation {
    public double openRebellionBox(double capitolPopularity, double rebellionPopularity) {
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
