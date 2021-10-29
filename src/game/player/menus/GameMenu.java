/**
 * 
 */
package game.player.menus;

import java.util.Scanner;

import game.GameEngine;
import game.gametypes.Game;
import game.player.Player;
import game.player.managers.MenuManager;

/**
 * @author chrisrinaldi
 * @date Feb 8, 2017 11:28:06 AM
 */
public class GameMenu extends MenuManager {
	
	public Game game;
	
	public GameMenu(Game game) {
		this.game = game;
	}
	
	@Override 
	public void displayMenu() {
		Scanner userIn = new Scanner(System.in);
		if (game.isMultiplayer()) {
			System.out.println("How many players? (MAX 4): ");
			int numPlayers;
			
			if (userIn.nextInt() < game.getMaximumPlayers()) 
				numPlayers = userIn.nextInt();
			else {
				System.out.println("Your player count has been set to 4, the"
									+ "maximum amount of players.");
				numPlayers = 4;
			}
			
			for (int i = numPlayers; i > 0; i--) {
				System.out.println("Enter the name of Player " + i + ":");
				GameEngine.addPlayer(new Player(userIn.next(), game.getInitialScore(), " "));
				userIn.next();
			}
		} else {
			System.out.println("Please enter your name: ");
			GameEngine.addPlayer(new Player(userIn.next(), game.getInitialScore(), game.getInitialChoice()));
			GameEngine.addPlayer(new Player("Computer", game.getInitialScore(), game.getInitialChoice()));
		}
		
		
		
	}
	
}
