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
public class ResourceTypeScene extends Scene implements Serializable {
    public double ResourceType;
    public double amountAvailable;

    public ResourceTypeScene() {
    }

    public double getResourceType() {
        return ResourceType;
    }

    public void setResourceType(double ResourceType) {
        this.ResourceType = ResourceType;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.ResourceType) ^ (Double.doubleToLongBits(this.ResourceType) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
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
        final ResourceTypeScene other = (ResourceTypeScene) obj;
        if (Double.doubleToLongBits(this.ResourceType) != Double.doubleToLongBits(other.ResourceType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceTypeScene{" + "ResourceType=" + ResourceType + ", amountAvailable=" + amountAvailable + '}';
    }
    
    
}
