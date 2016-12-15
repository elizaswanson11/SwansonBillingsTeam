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
public class WelcomeMessageBeforeGameView extends View {

    public WelcomeMessageBeforeGameView() {
        super("\nWelcome to Panem, a post-apocalyptic government with complete control."
                + "\nThis is all you’ve known for your whole life. As a child you sat with"
                + "\nyour family to watch the Games, but growing up in District 6, you"
                + "\nlearned not to laugh at the jokes of the interviewers and not to swallow"
                + "\nthe lies of the greatness of Panem. Secretly, ever since you were of"
                + "\nage to participate in the Games, you’ve been involved in an underground"
                + "\neffort to overthrow the Capitol. Today is the event that will start the"
                + "\n36th Hunger Games: the selection of the tributes. You are barely paying"
                + "\nattention to the over enthusiastic announcer when you hear your name."
                + "\nYou have been selected as a tribute for Panem’s Hunger Games. Everything's"
                + "\na blur, you’re whisked away to get ready for your first interview."
                + "\n"
                + "Do you wish to continue and complete?"
                + "\nA - Yes. Lets Go!"
                + "\nQ - No, I'd rather quit.");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "A":
                this.yesChoice();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try Again");
                break;
        }
        return false;
    }

    private void yesChoice() {
        InterviewView interviewView = new InterviewView();
        interviewView.display();
    }

}
