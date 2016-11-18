/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Scene;

/**
 *
 * @author elizaswanson
 */
public class MapControl {

    static Map createMap() {
        Map map = null;
        
        System.out.println("*** createMap() called ***");
        
        return map;
    }

    static void moveCharactersToStartPosition(Map map) {
       System.out.println("*** moveCharactersToStartPosition() called ***");
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        //Location[][] locations = map.getLocations();
        
        
    }
}
