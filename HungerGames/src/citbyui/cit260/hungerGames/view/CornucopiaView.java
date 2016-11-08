/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;

/**
 *
 * @author elizaswanson
 */
public class CornucopiaView extends View {
    private String menu;

    public CornucopiaView() {
        super("\n"
              + "\n------------------------------------------------------------"
              + "\n| At the beginning of the games, do you..                  |"
              + "\n------------------------------------------------------------"
              + "\nA - Run to the Cornucopia and participate in the bloodbath"
              + "\nB - Escape into the woods"
              + "\n------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        String compareValue = "A";
        String compareSecondValue = "B";
       
        if (value.equals(compareValue)) {
            int reward = PuzzleCalculation.calcCornucopiaReward();
            System.out.println("Your reward is " + reward + ".");
        }
        else if (value.equals(compareSecondValue)) {
            System.out.println("You have avoided the bloodbath. You have incurred no injuries but earned no reward.");
        }
        else  {
            System.out.println("Invalid value. Please enter a valid value.");
            return false;
        }
        
        return true;
    }
}
