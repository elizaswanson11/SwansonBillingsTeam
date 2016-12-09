/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import hungergames.HungerGames;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author elizaswanson
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = HungerGames.getInFile();
    protected final PrintWriter console = HungerGames.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view when done == true
            done = this.doAction(value);
           
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        try {
        //while a valid name has not been retrieved
        while (!valid) {
            
            //prompt for the player's name
            this.console.println("\n" + this.displayMessage);
            
            //get the value entered from the keyboard
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),"/n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return value;
    }
}
