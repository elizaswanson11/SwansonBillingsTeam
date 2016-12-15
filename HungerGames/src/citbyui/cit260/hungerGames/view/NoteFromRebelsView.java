/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.PuzzleCalculation;
import citbyui.cit260.hungerGames.exceptions.PuzzleCalculationException;

/**
 *
 * @author spr9890
 */
public class NoteFromRebelsView extends View {

    public NoteFromRebelsView() {
        super("Your training is going well! However, as you prepare to go into the games, you receive a note from the Rebels. It says, "
                + "\nWe need you to meet as soon as possible! Your help could be critical to the operation of the Rebel Alliance."
                + "\nMeet at 0100 near the Games Memorial."
                + "\n\nYou know that the Capitol is watching. What do you do?"
                + "\n------------------------------------------------------------"
                + "\nA - Join the Rebels and officially join their forces."
                + "\nB - Stay at home and keep your family safe and the Capitol happy."
                + "\n------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        String compareValue = "A";
        String compareSecondValue = "B";

        if (value.equals(compareValue)) {
            int reward = 0;
            try {
                reward = PuzzleCalculation.calcRebelNoteReward();
            } catch (PuzzleCalculationException pce) {
                ErrorView.display(this.getClass().getName(),
                        pce.getMessage());
            }
            this.console.println("You have been awarded " + reward + " Rebel popularity.");
        } else if (value.equals(compareSecondValue)) {
            int reward = 0;
            try {
                reward = PuzzleCalculation.calcRebelNoteReward();
            } catch (PuzzleCalculationException pce) {
                ErrorView.display(this.getClass().getName(),
                        pce.getMessage());
            }
            this.console.println("You have been awarded " + reward + " Capitol popularity.");
        } else {
            ErrorView.display(this.getClass().getName(),
                    "Invalid value. Please enter a valid value.");
            return false;
        }

        return true;
    }

}
