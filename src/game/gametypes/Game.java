/**
 * 
 */
package game.gametypes;

import game.player.Player;

/**
 * <b>NOTE</b>: Games are required to have a no-args constructor
 * when added to the public games list!
 * 
 * <p>Description: A game is started with a maximum amount of players
 * as well as an initial score and choice. Games must also end and
 * purge the game engine's player list upon completion.</p>
 * @author chrisrinaldi
 * @date Feb 6, 2017 10:24:13 AM
 */
public interface Game {
	
	/**
	 * Starts the game.
	 */
	void startGame();
	
	/**
	 * Ends the game.
	 */
	void endGame();
	
	/**
	 * Gets the maximum amount of players the game might have.
	 * @return
	 */
	int getMaximumPlayers();
	
	/**
	 * Gets the game's description, as displayed through
	 * standard system output.
	 * @return
	 */
	String getDescription();
	
	/**
	 * Represents the initial score that 
	 * each <code>Player</code> receives.
	 */
	int getInitialScore();
	
	/**
	 * Gets the initial choice of the player.
	 * @return
	 */
	String getInitialChoice();
	
	/**
	 * Gets whether the game is multiplayer.
	 * @return
	 */
	boolean isMultiplayer();

}
