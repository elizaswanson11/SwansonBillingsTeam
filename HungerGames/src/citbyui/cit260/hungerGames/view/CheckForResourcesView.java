/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

/**
 *
 * @author elizaswanson
 */
public class CheckForResourcesView extends View{
    public CheckForResourcesView() {
        
        super("\n"
              + "\n---------------------------------------------------------------------------"
              + "\n| You have " + "** characterHealthPoints here **" + " health points.          |"
              + "\n| Select what resource you want to use.                                   |"
              + "\n---------------------------------------------------------------------------"
              + "\nF - Food (You have " + "** characterFoodResource here **" +"food resource.)"
              + "\nW - Water (You have " + "** characterWaterResource here **" + "water resource.)" 
              + "\nQ - Quit"
              + "\n---------------------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        //BEGIN
        //Get character health, food, and water levels.
        //Display the values
        //Display a menu to select what resource to transfer to health points.
        //Transfer the resource points to health points.
        //Alert the user if it was successful or not.
        value = value.toUpperCase();
        
        switch (value) {
            case "F":
                this.convertFoodResource();
                break;
            case "W":
                this.convertWaterResource();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }   

    private void convertWaterResource() {
        System.out.println("** convertWaterResource function called");
    }

    private void convertFoodResource() {
        System.out.println("** convertFoodResource function called");
    }
    
    
}
