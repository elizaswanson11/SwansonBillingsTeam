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
    
    public void displayStartProgramView() {
        /*
        do
            promt for and get playersName
            if playerName == 'Q' then
                return
            do requested action and display next view
        while the view is not done
        */
        
        boolean done = false; //set flag to not done
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
       /*
    getInput(): value
    BEGIN
        WHILE a valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from keyboard
            Trim front and trailing blanks off of the name
    
            IF the length of the value is blank THEN
                DISPLAY "Invalid value: The value cannot be blank"
                CONTINUE
            ENDIF
        
            BREAK
        ENDWHILE
        RETURN name
    END
    */
    
    Scanner keyboard = new Scanner(System.in);
    String value = "";
    boolean valid = false;
    
    while (!valid) {
        System.out.println("\n" + this.promptMessage);
        
        value = keyboard.nextLine();
        value = value.trim();
        
        if (value.length() < 1) {
            System.out.println("\nInvalid value: value cannot be blank");
            continue;
        }
        
        break;
    }
    
    return value;
    }

    private boolean doAction(String playersName) {
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
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n============================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n============================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }


}
