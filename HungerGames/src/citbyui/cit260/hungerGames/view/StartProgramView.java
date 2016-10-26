/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

/**
 *
 * @author eliza
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
    }

    public void displayBanner() {
        System.out.println(
        "\n****************************************************" +
        "\n*                                                  *" +
        "\n*                 The Hunger Games.                *" +
        "\n* This is a game of survival, not only physically  *" +
        "\n* but socially as well. Your success in the Games  *" +
        "\n* will be dependent on loyalty to our people, the  *" +
        "\n* Rebel Alliance. What decisions will you make and *" +
        "\n* where will these decisions take you? Let's begin *" +
        "\n* and find out.                                    *" +
        "\n*                                                  *" +
        "\n****************************************************"
        );
    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
    }
}
