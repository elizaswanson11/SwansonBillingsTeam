/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.MainCharacter;
import byui.cit260.hungerGames.model.Resource;
import byui.cit260.hungerGames.model.Map;

/**
 *
 * @author eliza
 */
public class HungerGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        gameOne.setNumberPeople(24);
        gameOne.setNumberOfTributes(4);
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        MainCharacter mainCharacterOne = new MainCharacter();
        
        mainCharacterOne.setRebelPopularity(13);
        mainCharacterOne.setCapitolPopularity(5);
        mainCharacterOne.setHealthLevel(12);
        mainCharacterOne.setMaxRebelPopularity(20);
        mainCharacterOne.setCapitolPopularity(20);
        mainCharacterOne.setMaxHealthLevel(20);
        String mainCharacterInfo = mainCharacterOne.toString();
        System.out.println(mainCharacterInfo);
        
        Resource resourceOne = new Resource();
        
        resourceOne.setDescription("This is a brief description.");
        resourceOne.setHealthValue(13);
        resourceOne.setMaxAmount(20);
        String resourceInfo = resourceOne.toString();
        System.out.println(resourceInfo);
        
        Map mapOne = new Map();
        
        mapOne.setColumnCount(2);
        mapOne.setRowCount(2);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
    }
   
    //Here is a change   
}
