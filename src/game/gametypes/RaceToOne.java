/**
 * 
 */
package game.gametypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import game.GameEngine;
import game.components.Die;
import game.player.Player;

/**
 * Race-To-One is a dice game in which players take turns rolling
 * two dice. 
 * 
 * <p>The Race-to-One game is played with multiple players. If one
 * <code>Player</code> is playing, the computer (named HAL-9000) 
 * will play.</p>
 * @author chrisrinaldi
 * @date Feb 1, 2017 12:02:28 PM
 */
public class RaceToOne implements Game {
	
	public RaceToOne() {
		//TODO: Empty constructor.
	}
	
	@Override
	public int getMaximumPlayers() {
		return 2;
	}
	
	@Override
	public int getInitialScore() {
		return 60;
	}
	
	@Override
	public String getInitialChoice() {
		return " ";
	}
	
	@Override
	public boolean isMultiplayer() {
		return false;
	}
	
	public String getDescription() {
		return "Race-To-One : " + getMaximumPlayers() + " Players";
	}
	
	public void startGame() {
		
		Scanner userIn = new Scanner(System.in);
		
		if (isMultiplayer()) {
			System.out.println("How many players? (MAX 4): ");
			int numPlayers;
			
			if (userIn.nextInt() < getMaximumPlayers()) 
				numPlayers = userIn.nextInt();
			else {
				System.out.println("Your player count has been set to 4, the"
									+ "maximum amount of players.");
				numPlayers = 4;
			}
			
			for (int i = numPlayers; i > 0; i--) {
				System.out.println("Enter the name of Player " + i + ":");
				GameEngine.addPlayer(new Player(userIn.next(), getInitialScore(), " "));
				userIn.next();
			}
		} else {
			System.out.println("Please enter your name: ");
			GameEngine.addPlayer(new Player(userIn.next(), getInitialScore(), getInitialChoice()));
			GameEngine.addPlayer(new Player("Computer", getInitialScore(), getInitialChoice()));
		}
		
		System.out.println("Welcome to RACE-TO-ONE!\n"
				+ "DIRECTIONS: Players begin with a score of " + getInitialScore() + ". Players"
				+ "then roll two dice, decrementing the result from their score"
				+ "until they reach a score of ONE (1)! If the decrement results"
				+ "in a score that is less than zero, the result is ADDED"
				+ "to the player's score.");
		
		userIn.close();
	}
	
	public void endGame() {
		//TODO: End the game.
	}
	
	/**
	 * Rolls a die for the given <code>Player</code>.
	 * @param die
	 * @param player
	 */
	public void rollDice(Die die, Player player) {
	
	}

}
