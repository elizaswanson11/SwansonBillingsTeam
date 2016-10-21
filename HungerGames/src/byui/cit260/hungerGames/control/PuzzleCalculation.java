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
    /*calcResourceReward(capitolPopularity) {
    BEGIN
    IF (capitolPopularity < 3 OR capitolPopularity > 15) THEN
    RETURN -1
    award = MathRand(1, 10)
    resourceReward = award + (award * (capitolPopularity / 10))
    RETURN resourceReward
    } */
    public double calcResourceReward(double capitolPopularity) {
        if (capitolPopularity < 3 || capitolPopularity > 15) {
            return -1;
        }
        else {
            int award = (int)(Math.random() * 10 + 1);
            double resourceReward = award + (award * (capitolPopularity / 10));
            return resourceReward;
        }
    }
    

}
