/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Game;

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
    }
    //Here is a change   
}
