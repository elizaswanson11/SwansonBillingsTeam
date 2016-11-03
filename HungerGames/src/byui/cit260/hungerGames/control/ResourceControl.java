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
public class ResourceControl {
    public double calcResourceReward(double capitolPopularity) {
        //calcResourceReward(capitolPopularity) {
        //BEGIN
        //IF (capitolPopularity < 3 OR capitolPopularity > 15) THEN
        //RETURN -1
        //award = MathRand(1, 10)
        //resourceReward = award + (award * (capitolPopularity / 10))
        //RETURN resourceReward
        //}
        if (capitolPopularity < 3 || capitolPopularity > 15) {
            return -1;
        }
        else {
            int award = (int)(Math.random() * 10 + 1);
            double resourceReward = award + (award * (capitolPopularity / 10));
            return resourceReward;
        }
    }
    public static int dummyControl(int resourceValue) {
        if (resourceValue > 10) {
            return 1;
        }
        else if(resourceValue == 10) {
            return 0;
        }
        else {
            return -1;
        }
}
}
