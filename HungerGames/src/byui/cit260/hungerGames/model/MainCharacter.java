/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.io.Serializable;

/**
 *
 * @author elizaswanson
 */
public class MainCharacter extends Character implements Serializable {

    private double rebelPopularity;
    private double capitolPopularity;
    private double healthLevel;
    private double maxRebelPopularity;
    private double maxCapitolPopularity;
    private double maxHealthLevel;
    private String mainCharacterName;

    public MainCharacter() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.rebelPopularity) ^ (Double.doubleToLongBits(this.rebelPopularity) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.capitolPopularity) ^ (Double.doubleToLongBits(this.capitolPopularity) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.healthLevel) ^ (Double.doubleToLongBits(this.healthLevel) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxRebelPopularity) ^ (Double.doubleToLongBits(this.maxRebelPopularity) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxCapitolPopularity) ^ (Double.doubleToLongBits(this.maxCapitolPopularity) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxHealthLevel) ^ (Double.doubleToLongBits(this.maxHealthLevel) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MainCharacter other = (MainCharacter) obj;
        if (Double.doubleToLongBits(this.rebelPopularity) != Double.doubleToLongBits(other.rebelPopularity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.capitolPopularity) != Double.doubleToLongBits(other.capitolPopularity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthLevel) != Double.doubleToLongBits(other.healthLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxRebelPopularity) != Double.doubleToLongBits(other.maxRebelPopularity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCapitolPopularity) != Double.doubleToLongBits(other.maxCapitolPopularity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxHealthLevel) != Double.doubleToLongBits(other.maxHealthLevel)) {
            return false;
        }
        return true;
    }

    public double getRebelPopularity() {
        return rebelPopularity;
    }

    public void setRebelPopularity(double rebelPopularity) {
        this.rebelPopularity = rebelPopularity;
    }

    public double getCapitolPopularity() {
        return capitolPopularity;
    }

    public void setCapitolPopularity(double capitolPopularity) {
        this.capitolPopularity = capitolPopularity;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public double getMaxRebelPopularity() {
        return maxRebelPopularity;
    }

    public void setMaxRebelPopularity(double maxRebelPopularity) {
        this.maxRebelPopularity = maxRebelPopularity;
    }

    public double getMaxCapitolPopularity() {
        return maxCapitolPopularity;
    }

    public void setMaxCapitolPopularity(double maxCapitolPopularity) {
        this.maxCapitolPopularity = maxCapitolPopularity;
    }

    public double getMaxHealthLevel() {
        return maxHealthLevel;
    }

    public void setMaxHealthLevel(double maxHealthLevel) {
        this.maxHealthLevel = maxHealthLevel;
    }

    public String getMainCharacterName() {
        return mainCharacterName;
    }

    public void setMainCharacterName(String mainCharacterName) {
        this.mainCharacterName = mainCharacterName;
    }

    @Override
    public String toString() {
        return "MainCharacter{" + "rebelPopularity=" + rebelPopularity + ", capitolPopularity=" + capitolPopularity + ", healthLevel=" + healthLevel + ", maxRebelPopularity=" + maxRebelPopularity + ", maxCapitolPopularity=" + maxCapitolPopularity + ", maxHealthLevel=" + maxHealthLevel + '}';
    }

}
