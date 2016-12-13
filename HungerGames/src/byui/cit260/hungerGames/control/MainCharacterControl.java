/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.MainCharacter;

/**
 *
 * @author eswanso2
 */
public class MainCharacterControl {
    
    public static MainCharacter createMainCharacter() {
        MainCharacter mainCharacter = new MainCharacter();
        MainCharacterControl.assignCharacterStartValues(mainCharacter);
        return mainCharacter;
    }
    public static void assignCharacterStartValues(MainCharacter mainCharacter) {
        mainCharacter.setCapitolPopularity(5);
        mainCharacter.setRebelPopularity(5);
        mainCharacter.setHealthLevel(20);
        mainCharacter.setMaxCapitolPopularity(20);
        mainCharacter.setMaxRebelPopularity(20);
        mainCharacter.setMaxHealthLevel(20);
    }
    public MainCharacterControl() {
    }
    
}
