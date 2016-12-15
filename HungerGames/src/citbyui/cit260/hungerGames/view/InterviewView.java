/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

/**
 *
 * @author eliza
 */
public class InterviewView extends View {

    public InterviewView() {
        super("\nYou are sitting in the interview being watched by the Capitol, along with all of the rebel"
                + "\nfighters from back home. You are asked questions about everything; your family, your home,"
                + "\nhow you plan to win the games. How do you respond?"
                + "\n"
                + "\nA - Respond with enthusiam, gushing with compliments to the Capitol, Panem and the President."
                + "\nB - Remain passive and distant, not really taking sides and not showing your personality at all."
                + "\nC - State your defiance to the Capitol and the Games and flaunt your rebel status.");

    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "A":
                this.choiceOne();
                break;
            case "B":
                this.choiceTwo();
                break;
            case "C":
                this.chioceThree();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try Again");
                break;
        }

        return false;
    }

    private void choiceOne() {
        this.console.println("\nThe Captial is please with you.");

    }

    private void choiceTwo() {
        this.console.println("\nYou have not angered either party.");
    }

    private void chioceThree() {
        this.console.println("\nThe Rebels are pleased your on their side."); //To change body of generated methods, choose Tools | Templates.
    }
}
