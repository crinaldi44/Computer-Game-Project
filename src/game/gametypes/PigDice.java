/**
 * 
 */
package game.gametypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import game.TestPlayer;
import game.components.Die;
import game.player.Player;

/**
 * Description: Pig Dice is a game in which two players race to reach
 * 100 points. A player will repeatedly roll a single <code>Die</code>
 * until a 1 is rolled or the player holds and scores the sum of the
 * rolls (i.e. - a player's <i>turn</i> total). The player is eventually
 * faced with two decisions:
 * 
 * 1. Roll: If the player rolls a...
 * 		1: The player scores nothing and it becomes opponent's turn
 * 		2-6: The number is added to the player's turn total and the 
 * 			 player's turn continues.
 * 2. Hold: The turn total is added to the player's score and it becomes
 * 			the opponent's turn
 * 
 * First player to reach 100 points wins the game.
 * NOTE: Address each <code>Player</code> by name.
 * 
 * @author chrisrinaldi
 * @date Feb 8, 2017 11:19:46 AM
 */
public class PigDice implements Game {
	
	//Represents the score required to win the game.
	private static final int WINNING_SCORE = 100;
	
	private Player player, opponent;
	private Scanner key;
	private Die die;

	/**
	 * Constructs a new <code>PigDice</code>.
	 * @param player1
	 * @param player2
	 */
	public PigDice(Player player1, Player player2) {
		player = player1;
		opponent = player2;
		key = new Scanner(System.in);
		die = new Die();
	}
	
	/**
	 * Constructs a <code>PigDice</code>.
	 */
	public PigDice() {
		key = new Scanner(System.in);
		die = new Die();
		startGame();
	}
	
	@Override
	public void startGame() {
		System.out.println("Welcome! Please enter a name for Player 1: ");
		player = new Player(key.next(), getInitialScore(), getInitialChoice());
		System.out.println("Enter a name for Player 2: ");
		opponent = new Player(key.next(), getInitialScore(), getInitialChoice());
		setFlags(player, opponent);
		
		do {
			takeTurn(player, true);
		} while(player.getAttributes().get("winner").equals(false) && opponent.getAttributes().get("winner").equals(false));
		if (player.getAttributes().get("winner").equals(true) || opponent.getAttributes().get("winner").equals(true)) {
			endGame();
		} else {
			TestPlayer.getLogger().severe("An error occured between lines 72-75!"); //We should not arrive here.
			System.exit(0);
		}
		
	}
	
	/**
	 * Takes a turn for the specified <code>Player</code>. Ends
	 * the game if the player is the winner.
	 * @param player
	 * @param first whether the turn is the first of the game
	 */
	private void takeTurn(Player player, boolean first) {
		if (first) {
			System.out.println(player.getName() + " rolls first.");
			die.roll();
			System.out.println(player.getName() + " rolled a " + die.getFace());
			player.setScore(player.getScore() + die.getFace());
			takeTurn((Player) player.getAttribute("opponent"), false);
			TestPlayer.getLogger().severe("Flag first: " + first);
		} else {
			System.out.println(player.getName() + " is up. Enter roll or hold.");
			String choice = key.next();
			if (choice.equalsIgnoreCase("roll")) {
				die.roll();
				if (die.getFace() == 1) {
					System.out.println(player.getName() + " has rolled a 1, thus it is now " + 
							((Player) player.getAttribute("opponent")).getName() + "'s turn.");
					takeTurn((Player) player.getAttribute("opponent"), false);
				}
				player.setScore(player.getScore() + die.getFace());
				System.out.println(player.getName() + " has rolled a " + die.getFace() + ". Score: " + player.getScore());
				if (player.getScore() >= WINNING_SCORE) {
					System.out.println(player.getName() + " has won!");
					player.setAttribute("winner", true);
				} else {
				takeTurn((Player) player.getAttribute("opponent"), false);
				}
			} else if (choice.equalsIgnoreCase("hold")) {
				System.out.println(player.getName() + " has opted to hold with a score of " + player.getScore());
				//Type cast required, as attributes are mapped as generic objects.
				takeTurn((Player) player.getAttribute("opponent"), false);
			} else { 
				TestPlayer.getLogger().severe("Unrecognized response: " + choice + "\n Program will exit immediately.");
				System.exit(0);
			}
		}
	}
	
	/**
	 * Sets required game entry flags.
	 * @param p1 the first player
	 * @param p2 the second player
	 */
	private void setFlags(Player p1, Player p2) {
		p1.setAttribute("winner", false);
		p2.setAttribute("winner", false);
		p1.setAttribute("opponent", p2);
		p2.setAttribute("opponent", p1);
	}
	
	@Override
	public void endGame() {
		System.out.println("Thank you for playing Pig Dice!");
	}

	@Override
	public int getMaximumPlayers() {
		return 2;
	}

	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public int getInitialScore() {
		return 0;
	}

	@Override
	public String getInitialChoice() {
		return " ";
	}
	
	@Override
	public boolean isMultiplayer() {
		return true;
	}
	
	

}
