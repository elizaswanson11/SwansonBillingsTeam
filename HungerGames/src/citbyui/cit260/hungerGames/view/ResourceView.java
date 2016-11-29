/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ResourceControl;
import byui.cit260.hungerGames.model.Resource;

/**
 *
 * @author elizaswanson
 */
public class ResourceView extends View{
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
        
        switch (value) {
            case "W":
                ResourceControl.findResource("water");
                break;
            case "B":
                ResourceControl.findResource("berry");
                break;
            case "F":
                ResourceControl.findResource("fish");
                break;
            case "R":
                ResourceControl.findResource("rabbit");
                break;
            case "M":
                ResourceControl.findResource("mushroom");
                break;
            case "A":
                ResourceControl.findResource("radish");
                break;
            case "I":
                ResourceControl.findResource("bird");
                break;
            case "E":
                ResourceControl.findResource("medicine");
                break;
            case "Q":
                ResourceControl.findResource("medicine");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }
}
