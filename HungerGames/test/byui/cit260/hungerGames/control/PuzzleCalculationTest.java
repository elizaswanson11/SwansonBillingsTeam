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
        double result = instance.calcCornucopiaReward(cornucopiaAnswer);
        assertTrue(result >= minResult && result <= maxResult);
        
        System.out.println("Test Case 2");
        cornucopiaAnswer = false;
        instance = new PuzzleCalculation();
        int expResult = 11;
        result = instance.calcCornucopiaReward(cornucopiaAnswer);
        assertEquals(expResult, result, 0.0);
    }
    
}
