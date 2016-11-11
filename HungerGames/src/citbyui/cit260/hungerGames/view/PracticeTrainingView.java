/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;

/**
 *
 * @author eliza
 */
public class PracticeTrainingView extends View{
    private String value;
    
    public PracticeTrainingView() {
        super("\nPlease enter a number between 1 and 9.");
        
    }
    
    @Override
    public boolean doAction(String value) {
        Integer number = Integer.parseInt(value);
        
        if (number < 0 || number > 9) {
            System.out.println("Invalid Entry: Please input a number between 0 and 9.");
            return false;
        }
        
        double result = PuzzleCalculation.compareTraining(number);
        
        if (result > 0){
            System.out.println("Congratulations you were successful in learning a new skill." +
                               "\n1 point has been added to your training level.");
            return true;
        }
        else {
            System.out.println("I'm sorry, your number was not correct." +
                               "\nPlease enter a new number and try again.");
            return false;
        }
        
    }
}
