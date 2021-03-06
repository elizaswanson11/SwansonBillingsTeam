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
public class Game implements Serializable {

    private double numberPeople;
    private double numberOfTributes;

    private Player player;
    private MainCharacter mainCharacter;

    public MainCharacter getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(MainCharacter mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
    private Character[] characters;
    private Map map;

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(double numberPeople) {
        this.numberPeople = numberPeople;
    }

    public double getNumberOfTributes() {
        return numberOfTributes;
    }

    public void setNumberOfTributes(double numberOfTributes) {
        this.numberOfTributes = numberOfTributes;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.numberPeople) ^ (Double.doubleToLongBits(this.numberPeople) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.numberOfTributes) ^ (Double.doubleToLongBits(this.numberOfTributes) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.numberPeople) != Double.doubleToLongBits(other.numberPeople)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfTributes) != Double.doubleToLongBits(other.numberOfTributes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "numberPeople=" + numberPeople + ", numberOfTributes=" + numberOfTributes + '}';
    }
}
