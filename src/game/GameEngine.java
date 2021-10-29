/**
 * 
 */
package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import game.gametypes.Game;
import game.gametypes.PigDice;
import game.gametypes.RaceToOne;
import game.player.Player;
import game.player.managers.MenuManager;
import game.player.managers.PlayerManager;

/**
 * @author chrisrinaldi
 * @date Feb 1, 2017 12:07:49 PM
 */
public class GameEngine {
	
	/**
	 * The logger for this class.
	 */
	private static final Logger logger = Logger.getLogger(GameEngine.class.getName());
	
	//Represents the game build.
	public static final double BUILD = 0.5;
	
	public static void main2(String[] args) {
		initializeGameList();
		new MenuManager();
		logger.info("Game service successfully started.");
	}
	
	private static ArrayList<Player> players = new ArrayList<>();
	
	private static List<Game> gameList = new ArrayList<>();
	
	/**
	 * Constructs a new <code>GameEngine</code>. Adds each
	 * game to the games list, so as to simplify the addition
	 * of new games. To add a game to the list, you must first
	 * declare a no-args constructor in the <code>Game</code>'s
	 * class.
	 */
	public static void initializeGameList() {
		gameList.add(new RaceToOne());
		gameList.add(new PigDice());
	}
	
	/**
	 * Adds the specified player to the list. Their
	 * ordinal in the list represents their temporary
	 * player ID.
	 * @param player
	 */
	public static void addPlayer(Player player) {
		players.add(player);
	}
	
	/**
	 * Removes the player from the list.
	 * @param player
	 */
	public void removePlayer(Player player) {
		players.remove(player);
	}
	
	/**
	 * Removes all players from the player list.
	 */
	public void purgePlayerList() {
		players.clear();
	}
	
	public static List<Game> getGameList() {
		return gameList;
	}
	
	/**
	 * Searches the player list for the specified player with username.
	 * @param username
	 * @return
	 */
	public boolean searchUsername(String username) {
		if (players.stream().anyMatch(i -> i.getName() == username)) {
			return true;
		}
		return false;
	}

}
