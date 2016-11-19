/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Scene;
import byui.cit260.hungerGames.model.Scene.SceneType;

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
       Location[][] locations = map.getLocations();
       
       // start point
       locations[0][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[0][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[0][2].setScene(scenes[SceneType.resource.ordinal()]);
       locations[0][3].setScene(scenes[SceneType.resource.ordinal()]);
       locations[0][4].setScene(scenes[SceneType.fight.ordinal()]);
       locations[0][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[0][6].setScene(scenes[SceneType.fight.ordinal()]);
       locations[0][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[0][8].setScene(scenes[SceneType.fight.ordinal()]);
       locations[0][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[1][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[1][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[1][2].setScene(scenes[SceneType.fight.ordinal()]);
       locations[1][3].setScene(scenes[SceneType.resource.ordinal()]);
       locations[1][4].setScene(scenes[SceneType.fight.ordinal()]);
       locations[1][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[1][6].setScene(scenes[SceneType.resource.ordinal()]);
       locations[1][7].setScene(scenes[SceneType.fight.ordinal()]);
       locations[1][8].setScene(scenes[SceneType.resource.ordinal()]);
       locations[1][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[2][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[2][1].setScene(scenes[SceneType.fight.ordinal()]);
       locations[2][2].setScene(scenes[SceneType.fight.ordinal()]);
       locations[2][3].setScene(scenes[SceneType.fight.ordinal()]);
       locations[2][4].setScene(scenes[SceneType.resource.ordinal()]);
       locations[2][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[2][6].setScene(scenes[SceneType.resource.ordinal()]);
       locations[2][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[2][8].setScene(scenes[SceneType.resource.ordinal()]);
       locations[2][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][0].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][2].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][3].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][4].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[3][6].setScene(scenes[SceneType.fight.ordinal()]);
       locations[3][7].setScene(scenes[SceneType.fight.ordinal()]);
       locations[3][8].setScene(scenes[SceneType.fight.ordinal()]);
       locations[3][9].setScene(scenes[SceneType.fight.ordinal()]);
       locations[4][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[4][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[4][2].setScene(scenes[SceneType.resource.ordinal()]);
       locations[4][3].setScene(scenes[SceneType.fight.ordinal()]);
       locations[4][4].setScene(scenes[SceneType.resource.ordinal()]);
       locations[4][5].setScene(scenes[SceneType.fight.ordinal()]);
       locations[4][6].setScene(scenes[SceneType.resource.ordinal()]);
       locations[4][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[4][8].setScene(scenes[SceneType.fight.ordinal()]);
       locations[4][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[5][0].setScene(scenes[SceneType.resource.ordinal()]);
       locations[5][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[5][2].setScene(scenes[SceneType.fight.ordinal()]);
       locations[5][3].setScene(scenes[SceneType.fight.ordinal()]);
       locations[5][4].setScene(scenes[SceneType.resource.ordinal()]);
       locations[5][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[5][6].setScene(scenes[SceneType.fight.ordinal()]);
       locations[5][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[5][8].setScene(scenes[SceneType.fight.ordinal()]);
       locations[5][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[6][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[6][1].setScene(scenes[SceneType.fight.ordinal()]);
       locations[6][2].setScene(scenes[SceneType.resource.ordinal()]);
       locations[6][3].setScene(scenes[SceneType.resource.ordinal()]);
       locations[6][4].setScene(scenes[SceneType.fight.ordinal()]);
       locations[6][5].setScene(scenes[SceneType.fight.ordinal()]);
       locations[6][6].setScene(scenes[SceneType.resource.ordinal()]);
       locations[6][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[6][8].setScene(scenes[SceneType.resource.ordinal()]);
       locations[6][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[7][0].setScene(scenes[SceneType.resource.ordinal()]);
       locations[7][1].setScene(scenes[SceneType.fight.ordinal()]);
       locations[7][2].setScene(scenes[SceneType.fight.ordinal()]);
       locations[7][3].setScene(scenes[SceneType.resource.ordinal()]);
       locations[7][4].setScene(scenes[SceneType.resource.ordinal()]);
       locations[7][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[7][6].setScene(scenes[SceneType.resource.ordinal()]);
       locations[7][7].setScene(scenes[SceneType.fight.ordinal()]);
       locations[7][8].setScene(scenes[SceneType.fight.ordinal()]);
       locations[7][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[8][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[8][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[8][2].setScene(scenes[SceneType.resource.ordinal()]);
       locations[8][3].setScene(scenes[SceneType.resource.ordinal()]);
       locations[8][4].setScene(scenes[SceneType.fight.ordinal()]);
       locations[8][5].setScene(scenes[SceneType.fight.ordinal()]);
       locations[8][6].setScene(scenes[SceneType.fight.ordinal()]);
       locations[8][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[8][8].setScene(scenes[SceneType.resource.ordinal()]);
       locations[8][9].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][0].setScene(scenes[SceneType.fight.ordinal()]);
       locations[9][1].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][2].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][3].setScene(scenes[SceneType.fight.ordinal()]);
       locations[9][4].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][5].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][6].setScene(scenes[SceneType.fight.ordinal()]);
       locations[9][7].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][8].setScene(scenes[SceneType.resource.ordinal()]);
       locations[9][9].setScene(scenes[SceneType.fight.ordinal()]);
    }
}

