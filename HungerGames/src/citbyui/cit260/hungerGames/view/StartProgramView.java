/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import byui.cit260.hungerGames.model.Player;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class StartProgramView extends View{
    
    public StartProgramView() {
        
        super("\nPlease enter your name: ");
        
        this.displayBanner();
    }

    public void displayBanner() {
        this.console.println(
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
    /*
    getInput(): value
    BEGIN
        WHILE a valid value has not been entered
            DISPLAY a message prompting the user to enter a value
            GET the value entered from keyboard
            Trim front and trailing blanks off of the value
    
            IF the length of the value is blank THEN
                DISPLAY "Invalid value: The value cannot be blank"
                CONTINUE
            ENDIF
        
            BREAK
        ENDWHILE
        
        RETURN value
    END
    */
    
    @Override
    public boolean doAction(String playersName) {
        /*
        if the length of the playersName < 2 then
            display "Invalid name: The name msut be > 1 character
            return false
        
        create Player with specified name
        if unsuccessful then
            display "Invalid name: The name is too short
            return false
        
        display customized welcom message
        display mainMenuView
        return true
        
        */
        
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        this.console.println("\n============================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n============================================="
        );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }


}
