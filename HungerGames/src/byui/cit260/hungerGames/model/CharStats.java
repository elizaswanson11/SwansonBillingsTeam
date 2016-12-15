/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.io.Serializable;

/**
 *
 * @author eliza
 */
public class CharStats implements Serializable {
    private double current;
    private double max;
    private String name;

    public CharStats(double current, double max, String name) {
        this.current = current;
        this.max = max;
        this.name = name;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
