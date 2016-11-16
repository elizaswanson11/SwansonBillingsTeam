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
public class Character implements Serializable{
    private String name;
    private double coordinantes;
    private double skillLevel;

    private Bag bag;    

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }
    
    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoordinantes() {
        return coordinantes;
    }

    public void setCoordinantes(double coordinantes) {
        this.coordinantes = coordinantes;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.coordinantes) ^ (Double.doubleToLongBits(this.coordinantes) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.skillLevel) ^ (Double.doubleToLongBits(this.skillLevel) >>> 32));
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.coordinantes) != Double.doubleToLongBits(other.coordinantes)) {
            return false;
        }
        if (Double.doubleToLongBits(this.skillLevel) != Double.doubleToLongBits(other.skillLevel)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", coordinantes=" + coordinantes + ", skillLevel=" + skillLevel + '}';
    }
    
    
}