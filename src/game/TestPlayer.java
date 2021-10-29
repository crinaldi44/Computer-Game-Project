/**
 * CSC-122 Spring 2017
 * 
 */
package game;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Logger;

import game.components.Die;
import game.gametypes.PigDice;

/**
 * - DRIVER FILE -
 * Description: A simple dice game, wherein players are required to
 * make a choice.
 * @author chrisrinaldi
 * @date Jan 25, 2017 10:34:46 AM
 */
public class TestPlayer {
	
	private static final Logger logger = Logger.getLogger("System");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	new PigDice();
       
    }
    
    /**
     * Gets the {@link Logger} for this class.
     * @return
     */
    public static Logger getLogger() {
    	return logger;
    }
    
}
