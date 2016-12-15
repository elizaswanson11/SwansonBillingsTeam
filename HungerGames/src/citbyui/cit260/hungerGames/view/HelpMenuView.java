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
public class HelpMenuView extends View{

    public HelpMenuView() {
        super("\n"
              + "\n--------------------------------"
              + "\n| Help Menu                    |"
              + "\n--------------------------------"
              + "\nM - Move Character"
              + "\nO - Game Objectives"
              + "\nP - About Popularity"
              + "\nR - About Resources"
              + "\nQ - Quit"
              + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "M":
                this.viewMoveCharacter();
                break;
            case "O":
                this.viewGameObjectives();
                break;
            case "P":
                this.viewAboutPopularity();
                break;
            case "R":
                this.viewResourceView();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }   

    private void viewAboutPopularity() {
        this.console.println(
                  "\n******************************************************************"
                + "\nAbout Popularity: In the games, you are not in control of your surroundings."
                + "\nThe Capitol controls your situations. Their enemy, the Rebels, are trying to"
                + "\nfight them. Based on your actions throughout the game, you can lose or gain"
                + "\npopularity with either of the groups. This will be important later on, because"
                + "\neach will have its own benefits as you go throughout the game."
                + "\n******************************************************************");
    }

    private void viewGameObjectives() {
        this.console.println(
                  "\n******************************************************************"
                + "\nGame Objectives: The objective of the game is to be the last man standing."
                + "\nThere are other tributes in the game, but you need to outlast them."
                + "\nYou can do this by gathering resources and keeping your health points up."
                + "\nWhen you move to new locations, you may have to challenge an opponent."
                + "\nThis could lower your health points, but it could also increase your chance"
                + "\nof winning. If all other tributes are gone, you have won the game."
                + "\n******************************************************************");
    }

    private void viewMoveCharacter() {
        this.console.println(
                  "\n******************************************************************"
                + "\nMoving [How to move character]: To move your character, you will "
                + "\nneed to choose the map. You will receive a message of “Where do you want to "
                + "\ngo?” followed by a view of the map. You will then be able to choose"
                + "\nany location on the map to travel to. There is no limit on how many "
                + "\nspaces you can move from their certain location, but every change in "
                + "\nlocation will take up some heath points. (as the character had to put effort into "
                + "\nhealth loss for each distance calculation the character moves). To choose "
                + "\na new location, you will enter coordinates (like “9” and “5”) and the"
                + "\ncomputer will search for that pre-programed location in the area. After the "
                + "\nlocation is chosen, you will receive this type of message: “You are "
                + "\nnow in ‘______’ and you used up ‘______’ health level points to get here.” "
                + "\nThis message will be followed with any necessary information about the "
                + "\nlocation you needs to know. If you enter an invalid number, you must try again. "
                + "\n******************************************************************");
    }

    private void viewResourceView() {
        ResourceView resourceView = new ResourceView();
        resourceView.display();
    }
}
