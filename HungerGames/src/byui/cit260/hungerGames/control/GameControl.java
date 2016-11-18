/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Scene;
import hungergames.HungerGames;

/**
 *
 * @author elizaswanson
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        HungerGames.setPlayer(player);
        
        return player;
    } 

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        HungerGames.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Character[] character = GameControl.createCharacter();
        game.setCharacter(character);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartPosition(map);
    }

    private static Character[] createCharacter() {
        System.out.println("*** createCharacter stub function called in GameControl ***");
        return null;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("*** assignScenesToLocations stub function called in GameControl ***");
    }
 
}
