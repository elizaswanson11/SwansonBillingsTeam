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
 * @author eliza
 */
public class Scene implements Serializable{
    private String description;
    private double travelHealth;
    private String displaySymbol;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelHealth() {
        return travelHealth;
    }

    public void setTravelHealth(double travelHealth) {
        this.travelHealth = travelHealth;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.travelHealth) ^ (Double.doubleToLongBits(this.travelHealth) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.displaySymbol);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelHealth) != Double.doubleToLongBits(other.travelHealth)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelHealth=" + travelHealth + ", displaySymbol=" + displaySymbol + '}';
    }
    
    
}
