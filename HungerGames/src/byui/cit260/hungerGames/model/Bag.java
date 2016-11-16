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
public class Bag implements Serializable{
    private double maxResourceCount;
    private double resourceCount;
    
    public Bag() {
    }

    public double getMaxResourceCount() {
        return maxResourceCount;
    }

    public void setMaxResourceCount(double maxResourceCount) {
        this.maxResourceCount = maxResourceCount;
    }

    public double getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(double resourceCount) {
        this.resourceCount = resourceCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.maxResourceCount) ^ (Double.doubleToLongBits(this.maxResourceCount) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.resourceCount) ^ (Double.doubleToLongBits(this.resourceCount) >>> 32));
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
        final Bag other = (Bag) obj;
        if (Double.doubleToLongBits(this.maxResourceCount) != Double.doubleToLongBits(other.maxResourceCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourceCount) != Double.doubleToLongBits(other.resourceCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bag{" + "maxResourceCount=" + maxResourceCount + ", resourceCount=" + resourceCount + '}';
    }
    
    
}
