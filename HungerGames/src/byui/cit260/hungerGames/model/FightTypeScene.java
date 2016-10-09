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
public class FightTypeScene extends Scene implements Serializable{
    private double fightType;

    public FightTypeScene() {
    }
    
    double getFightType() {
        return fightType;
    }

    public void setFightType(double fightType) {
        this.fightType = fightType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.fightType) ^ (Double.doubleToLongBits(this.fightType) >>> 32));
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
        final FightTypeScene other = (FightTypeScene) obj;
        if (Double.doubleToLongBits(this.fightType) != Double.doubleToLongBits(other.fightType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FightTypeScene{" + "fightType=" + fightType + '}';
    }
    
    
}