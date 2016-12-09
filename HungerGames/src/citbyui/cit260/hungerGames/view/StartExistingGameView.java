/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;

/**
 *
 * @author eliza
 */
public class StartExistingGameView extends View {

    public StartExistingGameView() {
        super("\n\nEnter the file path for file where the game "
                + "is saved.");
    }

    @Override
    public boolean doAction(String filePath) {
        try {
            GameControl.getSavedGame(filePath);

            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
            return true;
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            return false;
        }

    }

}
