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
public class Map implements Serializable{

    public static int rowCount = 9;
    public static int columnCount = 9;
    public Location[][] locations;
    private Scene scene;
    
//BEGIN
 //Create and initialize new map
 //Create all of the scenes for the map
 //Assign each scene to a location in the map
//END
    
    
//Map(rows, columns)
//BEGIN
//IF rows < 1 OR columns < 1 THEN
//DISPLAY “rows and columns must be > 0” RETURN
//ENDIF
// Save the number of rows and columns
//Create a 2-D array of Locations

 //FOR every row in the array
//FOR every column in the array
//Create and initialize a new Location object
//locations[row][column] = location
//ENDFOR
//END
    
    public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The numbers of rows/columns must be greater than 0.");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        //create a 2D array for Location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                //assign the Location object to the current position in the array
                locations[row][column] = location;
            }
        }
    }
    
//createScenes()
//BEGIN
//Create the scenes array
//Create scene 1
//Assign scene 1 to array
//…
//Create scene N
//Assign scene N to array
//return scenes array
//END
    //private static Scene[] createScenes() {
        //Scene[] scenes = new Scene[SceneType.values().length];
        
    //}
    
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Map() {
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
    
    
    
}