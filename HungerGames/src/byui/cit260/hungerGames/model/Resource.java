/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author elizaswanson
 */
public class Resource implements Serializable{
    private String description;
    private double healthValue;
    private double maxAmount;

    public Resource() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(double healthValue) {
        this.healthValue = healthValue;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.healthValue) ^ (Double.doubleToLongBits(this.healthValue) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.maxAmount) ^ (Double.doubleToLongBits(this.maxAmount) >>> 32));
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
        final Resource other = (Resource) obj;
        if (Double.doubleToLongBits(this.healthValue) != Double.doubleToLongBits(other.healthValue)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxAmount) != Double.doubleToLongBits(other.maxAmount)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resource{" + "description=" + description + ", healthValue=" + healthValue + ", maxAmount=" + maxAmount + '}';
    }
    
    

}

