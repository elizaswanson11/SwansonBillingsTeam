/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Player;
import citbyui.cit260.hungerGames.view.StartProgramView;

/**
 *
 * @author eliza
 */
public class HungerGames {
    
    private static Game currentGame = null;
    
    private static Player player = null;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
    }
   


    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HungerGames.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HungerGames.player = player;
    }
    
}
