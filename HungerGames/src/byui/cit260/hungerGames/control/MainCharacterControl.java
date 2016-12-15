/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.MainCharacter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

    public static void printCharacterReport(String outputLocation)
            throws FileNotFoundException, IOException {

        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\n              Character Stats Report              ");
            out.printf("%n%-8s%15s%-12s", "Type", "Current Value", "Max Value");
            out.printf("%n%-8s%15s%-12s", "----", "-----", " -----------");

            out.printf("%n%-8s%15d%-12s",
                    MainCharacter.name(),
                    resource.getHealthValue(),
                    " " + resource.getDescription());
        }
    }

//    public ArrayList<Stats> addCharacterValue() {
//
//        ArrayList<MainChar> mc = new ArrayList<>();
//        MainChar mc = new MainChar("");
//    }
}
