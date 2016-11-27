/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;
import byui.cit260.hungerGames.control.ResourceControl;

/**
 *
 * @author eliza
 */
public class CalcMaxResourceValueView extends View{  
    public CalcMaxResourceValueView() {
        super("Do you want to calculate the max health value recieved from a resource?"
              + "\nY - Yes"
              + "\nN - No"
              + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "Y":
                this.calcMaxResource();
                break;
            case "N":
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return true;
    }   
    
    private void calcMaxResource(){
        int healthValue = ResourceControl.calcMaxResourceValue();
        System.out.println("The max health value from a resource is " + healthValue + ".");
    }

}
