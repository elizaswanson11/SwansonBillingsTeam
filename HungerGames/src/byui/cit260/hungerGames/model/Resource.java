/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;
import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author elizaswanson
 */
public enum Resource implements Serializable{
    
    Water("Water can be collected and used to increase health points. It converts to 3 health points."),
    Food("Food can be collected and used to increase health points. It converts to 5 health points.");
    
    private final String description;
    private final double healthValue;
    private final double maxAmount;
    private final Point coordinates;

    Resource(String description) {
        this.description = description;
        this.coordinates = new Point(1,1);
        this.healthValue = 0; // will change value when we decide what it'll be.
        this.maxAmount = 0; // will change value when we decide what it'll be.
    }
    public String getDescription() {
        return description;
    }

    public double getHealthValue() {
        return healthValue;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    @Override
    public String toString() {
        return "Resource{" + "description=" + description + ", healthValue=" + healthValue + ", maxAmount=" + maxAmount + '}';
    }
    
    

}

