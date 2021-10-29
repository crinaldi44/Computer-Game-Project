/**
 * CSC-122 Spring 2017 Lab week #2 Player
 */
package game.player;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author prof aw with CSC-122-02
 * @modified chrisrinaldi
 * date: 01/25/2017
 * Description:  A Player has a name, a score, and a choice. 
 */
public class Player 
{
    private String name;
    private int score;
    private String choice;
    
    private HashMap<String, Object> attributes = new HashMap<>();
    
    /**
     *  C O N S T R U C T O R
     */
    public Player()
    {
        name = "HAL-9000";
        score = 0;
        choice = " ";
    }
    
    public Player(String name, int score, String choice)
    {
        this.name = name;
        this.score = score;
        this.choice = choice;
    }
   
    // S E T T E R S
   
    public void setName(String input)
    {
        name = input;
    }
    
    // G E T T E R S
    
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the set of attributes assigned to the player.
     * @return
     */
    public HashMap<String, Object> getAttributes() {
    	return attributes;
    }
    
    /**
     * Sets an attribute on a player.
     * @param name the name of the attribute
     * @param value the value to set the attribute to
     */
    public void setAttribute(String name, Object value) {
    	if (!attributes.containsKey(name))
    		attributes.put(name, value);
    	else 
    		attributes.replace(name, value);
    }
    
    /**
     * Gets the value of the specified attribute entry.
     * @param name The name of the attribute
     * @return An object mapped to the specified attribute name
     */
    public Object getAttribute(String name) {
    	return attributes.get(name);
    }
    
    /**
     * Removes the attribute from the player.
     * @param name the name of the attribute
     */
    public void removeAttribute(String name) {
    	if (attributes.containsKey(name))
    		attributes.remove(name);
    }
    
    /**
     * Gets the <code>Player</code>'s score.
     * @return score the score
     */
    public int getScore() {
    	return score;
    }
    
    /**
     * Sets the <code>Player</code>'s score.
     * @param score
     */
    public void setScore(int score) {
    	this.score = score;
    }
    
    /**
     * Gets the choice.
     * @return
     */
    public String getChoice() {
    	return choice;
    }
    
    /**
     * Sets the choice.
     * @param choice
     */
    public void setChoice(String choice) {
    	this.choice = choice;
    }
    
}
