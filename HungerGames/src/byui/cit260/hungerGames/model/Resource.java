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
    Water("Water can be collected and used to increase health points. It converts to 3 health points.", 3),
    Berry("A berry can be collected and used to increase health points. It converts to 1 heath point.", 1),
    Fish("Fish can be collected and used to increase health points. It converts to 2 health points.", 2),
    Rabbit("A rabbit can be hunted and used to increase health points. It converts to 3 health points.", 3),
    Mushroom("A mushroom can be collected and used to increase health points. It converts to 1 health point.", 1),
    Radish("A radish can be collected and used to increase health points. It converts to 1 health point.", 1),
    Bird("A bird can be collected and used to increase health points. It converts to 2 health points.", 2),
    Medicine("Some medicine can be collected and used to increase health points. It converts to 4 health points.", 4);
    
    private final String description;
    public final int healthValue;
    private final double maxAmount;
    private final Point coordinates;

    Resource(String description, int healthValue) {
        this.description = description;
        this.coordinates = new Point(1,1);
        this.healthValue = healthValue; // will change value when we decide what it'll be.
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

