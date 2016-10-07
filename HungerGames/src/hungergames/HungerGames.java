/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Location;

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
        
        locationOne.setrow(2);
        locationOne.setcolumn(4);
        locationOne.setvisited(9);
        locationOne.setamountRemaining(24);
        String locationInfo = locationOne.toString();
        System.out.print(locationInfo);
    }
    //Here is a change   
}
