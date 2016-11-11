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
public class ActionMenuView extends View{    
    private String menu;

    public ActionMenuView() {
        super( "\n"
              + "\n----------------------------------------------"
              + "\n|   Action Menu                              |"
              + "\n----------------------------------------------"
              + "\nG - Gather Resources"
              + "\nA - Ask for resources from sponsors"
              + "\nU - Use Resources (convert into health points)"
              + "\nQ - Quit"
              + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "G":
                this.gatherResources();
                break;
            case "A":
                this.askForResources();
                break;
            case "U":
                this.checkForResources();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }   

    private void gatherResources() {
        System.out.println("\n*** gatherResources stub function called ***");
    }

    private void askForResources() {
        System.out.println("\n*** askForResources stub function called ***");
    }

    private void checkForResources() {
       CheckForResourcesView checkForResourcesView = new CheckForResourcesView();
       checkForResourcesView.display();
    }
}
