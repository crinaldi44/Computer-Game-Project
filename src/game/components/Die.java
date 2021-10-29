/**
 * CSC-122 Spring 2017 Week #2 Die Class
 */
package game.components;

import java.util.Random;

/**
 *
 * @author prof aw with CSC-122-02
 * 1/25/2017
 * Description: A single die consists of a face up
 *              that can be values 1 - 6
 */

public class Die 
{
   
   private int face;

 /**
  * CONSTRUCTOR
  */   
    public Die() {
        face = 1;
    }
    
    /**
     * setFace()
     * 
     * preconditions: input is 1 - 6
     * postconditions: if input is valid face is changed to the input
     *                 otherwise, face is not changed
     */
    public void setFace(int input) {
        if( input >= 1 && input <= 6)
            face = input;
            
    }
    
    public int getFace() {
        return face;
    }
    
    public void roll() {
        Random rand = new Random();
        int rFace = rand.nextInt(6)+1;
        face = rFace;
    }
}
