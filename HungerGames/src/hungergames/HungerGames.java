/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Player;
import citbyui.cit260.hungerGames.view.ErrorView;
import citbyui.cit260.hungerGames.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author eliza
 */
public class HungerGames {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        try {
            HungerGames.inFile = new BufferedReader(new InputStreamReader(System.in));
            HungerGames.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            HungerGames.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

            
        } catch (Exception e) {
            ErrorView.display("HungerGames","Exception: " + e.toString()
                             + "\nCause: " + e.getCause()
                             + "\nMessage: " + e.getMessage());
        } catch (Throwable e) {
            ErrorView.display("HungerGames","Exception: " + e.toString()
                             + "\nCause: " + e.getCause()
                             + "\nMessage: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (HungerGames.inFile != null) {
                    HungerGames.inFile.close();
                }
                if (HungerGames.outFile != null) {
                    HungerGames.outFile.close();
                }
                if (HungerGames.logFile != null)
                    HungerGames.outFile.close();
            } catch (IOException ex) {
                ErrorView.display("HungerGames","Error closing files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HungerGames.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HungerGames.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HungerGames.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HungerGames.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HungerGames.logFile = logFile;
    }

}
