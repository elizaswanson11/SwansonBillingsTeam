/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Character;
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
        
        Character[] characters = GameControl.createCharacter();
        game.setCharacters(characters);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveCharactersToStartPosition(map);
    }

    private static Character[] createCharacter() {
        System.out.println("*** createCharacter stub function called in GameControl ***");
        return null;
    }
    
    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        Scene fightScene = new Scene();
        fightScene.setDescription(
            "You have encountered another tribute and now you are going to fight. Hope you survive!");
        scenes[Scene.SceneType.fight.ordinal()] = fightScene;
        
        Scene resourceScene = new Scene();
        resourceScene.setDescription(
            "You've come across some resources you know you can use. Begin collecting now.");
        scenes[Scene.SceneType.resource.ordinal()] = resourceScene;
        
        Scene interviewScene = new Scene();
        interviewScene.setDescription(
            "Welcome to the interview. You will be asked some questions. " +
            "Please answer as honestly as possible.");
        scenes[Scene.SceneType.interview.ordinal()] = interviewScene;
        
        return scenes;
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("*** assignScenesToLocations stub function called in GameControl ***");
    }
}
