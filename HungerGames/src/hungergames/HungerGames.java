/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Game;

import byui.cit260.hungerGames.model.Location;

import byui.cit260.hungerGames.model.MainCharacter;

import byui.cit260.hungerGames.model.Character;



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
        

        Location locationOne = new Location();
        
        locationOne.setRow(2);
        locationOne.setColumn(4);
        locationOne.setVisited(9);
        locationOne.setAmountRemaining(24);
        String locationInfo = locationOne.toString();
        System.out.print(locationInfo);

        
        MainCharacter mainCharacterOne = new MainCharacter();
        
        mainCharacterOne.setRebelPopularity(13);
        mainCharacterOne.setCapitolPopularity(5);
        mainCharacterOne.setHealthLevel(12);
        mainCharacterOne.setMaxRebelPopularity(20);
        mainCharacterOne.setCapitolPopularity(20);
        mainCharacterOne.setMaxHealthLevel(20);
        String mainCharacterInfo = mainCharacterOne.toString();
        System.out.println(mainCharacterInfo);
        
        
        Character characterOne = new Character();
        
        characterOne.setName("Tommy");
        characterOne.setCoordinantes(8);
        characterOne.setSkillLevel(5.4);
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
    }
   
    //Here is a change   
}
