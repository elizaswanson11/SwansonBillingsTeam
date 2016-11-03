
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elizaswanson
 */
public class PuzzleCalculationTest {
    
    public PuzzleCalculationTest() {
    }

    /**
     * Test of calcCornucopiaReward method, of class PuzzleCalculation.
     */
    @Test
    public void testCalcCornucopiaReward() {
        System.out.println("calcCornucopiaReward");
        
        System.out.println("Test Case 1");
        boolean cornucopiaAnswer = true;
        PuzzleCalculation instance = new PuzzleCalculation();
        int minResult = -15;
        int maxResult = 10;
        double result = instance.calcCornucopiaReward();
        assertTrue(result >= minResult && result <= maxResult);
        
        System.out.println("Test Case 2");
        cornucopiaAnswer = false;
        instance = new PuzzleCalculation();
        int expResult = 11;
        result = instance.calcCornucopiaReward();
        assertEquals(expResult, result, 0.0);
    }
    



    /**
     * Test of openRebellionBox method, of class PuzzleCalculation.
     */
    @Test
    public void testOpenRebellionBox() {
        System.out.println("Test Case 1");
        double capitolPopularity = 10;
        double rebellionPopularity = 4;
        PuzzleCalculation instance = new PuzzleCalculation();
        double expResult = 0.0;
        double result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 2");
        capitolPopularity = 7;
        rebellionPopularity = 9;
        expResult = 1;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
        capitolPopularity = 17;
        rebellionPopularity = 7;
        expResult = -1;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
        capitolPopularity = -3;
        rebellionPopularity = 5;
        expResult = -1;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 5");
        capitolPopularity = 8;
        rebellionPopularity = 20;
        expResult = -1;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 6");
        capitolPopularity = 7;
        rebellionPopularity = -9;
        expResult = -1;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 7");
        capitolPopularity = 15;
        rebellionPopularity = 15;
        expResult = 0;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 8");
        capitolPopularity = 0;
        rebellionPopularity = 0;
        expResult = 0;
        result = instance.openRebellionBox(capitolPopularity, rebellionPopularity);
        assertEquals(expResult, result, 0.0);
    }
    
}
