/**
 * 
 */
package game.player.managers;

import game.GameEngine;
import game.player.Player;

/**
 * Description: The <code>PlayerManager</code> handles actions between
 * and on players.
 * @author chrisrinaldi
 * @date Feb 8, 2017 10:43:51 AM
 */
public class PlayerManager {
	
	
	/**
	 * Sets the winner attribute on the <code>Player</code>.
	 * @param player
	 * @param winner
	 */
	public void setWinner(Player player, boolean winner) {
		player.setAttribute("winner", winner);
	}
	
	/**
	 * Clears the map of player attributes for the <code>Player</code>.
	 * @param player
	 */
	public void clearAttributes(Player player) {
		player.getAttributes().clear();
	}

}
