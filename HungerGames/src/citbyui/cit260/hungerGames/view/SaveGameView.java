/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import hungergames.HungerGames;

/**
 *
 * @author eliza
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("\n\nEnter the file path for the file where the game "
            + "is to be saved.");
    }

    @Override
    public boolean doAction(String filePath) {
        try {
            GameControl.saveGame(HungerGames.getCurrentGame(), filePath);
            return true;
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            return false;
        }
    }
    
}
