/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Resource;
import citbyui.cit260.hungerGames.exceptions.ResourceControlException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author elizaswanson
 */
public class ResourceControl {

    public static double calcResourceReward(double capitolPopularity)
            throws ResourceControlException {

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
        } else {
            int award = (int) (Math.random() * 10 + 1);
            double resourceReward = award + (award * (capitolPopularity / 10));
            return resourceReward;
        }
    }

    public static void dummyControl(int resourceValue)
            throws ResourceControlException {
        if (resourceValue > 10) {
            throw new ResourceControlException("Your number is too high.");
        } else if (resourceValue < 10) {
            throw new ResourceControlException("Your number is too low.");
        }
    }

    public static String findResource(String resourceType)
            throws ResourceControlException {
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
                return resourceArray[i].getDescription();
            }
        }
        throw new ResourceControlException("Resource not found.");

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

    public static void printResourceReport(String outputLocation)
            throws FileNotFoundException, IOException {
        
        Resource[] resources = Resource.values();
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\n              Resource Report              ");
            out.printf("%n%-8s%6s%-100s", "Name", "Value", " Description");
            out.printf("%n%-8s%6s%-100s", "----", "-----", " -----------");
            
            for (Resource resource : resources) {
               out.printf("%n%-8s%6d%-100s",
                        resource.name(),
                        resource.getHealthValue(),
                        " " + resource.getDescription());
            }
        }
    }

    public ResourceControl() {
    }

}
