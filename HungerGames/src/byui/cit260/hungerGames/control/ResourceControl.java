/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Resource;
import citbyui.cit260.hungerGames.exceptions.ResourceControlException;


/**
 *
 * @author elizaswanson
 */
public class ResourceControl {
    
    public double calcResourceReward(double capitolPopularity) 
        throws ResourceControlException{
        
        //calcResourceReward(capitolPopularity) {
        //BEGIN
        //IF (capitolPopularity < 3 OR capitolPopularity > 15) THEN
        //RETURN -1
        //award = MathRand(1, 10)
        //resourceReward = award + (award * (capitolPopularity / 10))
        //RETURN resourceReward
        //}
        if (capitolPopularity < 3 || capitolPopularity > 15) {
            throw new ResourceControlException("Cannot complete calculation. Capital Popularity out of bounds.");
        }
        else {
            int award = (int)(Math.random() * 10 + 1);
            double resourceReward = award + (award * (capitolPopularity / 10));
            return resourceReward;
        }
    }
    public static int dummyControl(int resourceValue) {
        if (resourceValue > 10) {
            return 2;
        }
        else if(resourceValue == 10) {
            return 1;
        }
        else if (resourceValue < 10) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public static boolean findResource(String resourceType) {
        //FOR index = 0 TO list.length-1
        //IF ( list[index] = = value)
        //THEN
        //RETURN index
        //ENDIF
        //ENDFOR
        //RETURN -1 
        Resource[] resourceArray = Resource.values();
        for (int i = 0; i <= resourceArray.length; i++) {
            if (resourceArray[i].name().equals(resourceType)) {
                System.out.println(resourceArray[i].getDescription());
                return true;
            }
        }
        return false;
    }
    public static void calcMaxResourceValue() 
        throws ResourceControlException {
        Resource[] resource = Resource.values();
        int returnValue = 0;
        for (Resource item : resource) {
            if (item.healthValue < 0) {
                throw new ResourceControlException("Cannot complete function. Health Value is less than 0.");
            }
        }
    }

}
    
    
