/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;
import citbyui.cit260.hungerGames.exceptions.ResourceControlException;

/**
 *
 * @author elizaswanson
 */
public class ResourceView extends View {

    public ResourceView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| About Resources              |"
                + "\n--------------------------------"
                + "\nW - Water"
                + "\nB - Berry"
                + "\nF - Fish"
                + "\nR - Rabbit"
                + "\nM - Mushroom"
                + "\nA - Radish"
                + "\nI - Bird"
                + "\nE - Medicine"
                + "\nQ - Quit"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        try {
            switch (value) {
                case "W":
                    ResourceControl.findResource("Water");
                    break;
                case "B":
                    ResourceControl.findResource("Berry");
                    break;
                case "F":
                    ResourceControl.findResource("Fish");
                    break;
                case "R":
                    ResourceControl.findResource("Rabbit");
                    break;
                case "M":
                    ResourceControl.findResource("Mushroom");
                    break;
                case "A":
                    ResourceControl.findResource("Radish");
                    break;
                case "I":
                    ResourceControl.findResource("Bird");
                    break;
                case "E":
                    ResourceControl.findResource("Medicine");
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try Again");
                    break;
            }
        } catch (ResourceControlException rce) {
            System.out.println(rce.getMessage());
            return false;
        }

        return true;
    }
}
