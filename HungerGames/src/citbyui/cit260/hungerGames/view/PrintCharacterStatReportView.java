/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.MainCharacter;
import hungergames.HungerGames;

/**
 *
 * @author eliza
 */
public class PrintCharacterStatReportView extends View {

    public PrintCharacterStatReportView() {
    
    }

    @Override
    public boolean doAction(String value) {
        HungerGames.getOutFile().println("*** PrintCharacterStatReportView stub function called ***");
        return true;
    }
    
    
}
