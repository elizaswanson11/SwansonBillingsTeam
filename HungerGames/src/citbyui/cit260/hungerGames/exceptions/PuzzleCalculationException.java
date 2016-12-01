/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hungerGames.exceptions;

/**
 *
 * @author eliza
 */
public class PuzzleCalculationException extends Exception{

    public PuzzleCalculationException() {
    }

    public PuzzleCalculationException(String string) {
        super(string);
    }

    public PuzzleCalculationException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PuzzleCalculationException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PuzzleCalculationException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
