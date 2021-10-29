/**
 * 
 */
package game;

import java.util.Scanner;

import game.player.Player;

/**
 * @author chrisrinaldi
 * @date Feb 8, 2017 10:26:38 AM
 */
public class ControlCenter {
	
	//The game engine.
	public GameEngine engine;
	
	/**
	 * Constructs a new <code>ControlCenter</code>.
	 * @param engine
	 */
	public ControlCenter(GameEngine engine) {
		this.engine = engine;
	}
	
	public static void initializeMainMenu() {
		Scanner key = new Scanner(System.in);
		System.out.println("==WELCOME==\n" +
						   "DIRECTIONS: Please enter the number that "
						 + "corresponds to the game you would like to play!\n");
						 for (int i = 0; i < GameEngine.getGameList().size(); i++) {
							 System.out.println((i + 1) + ". " + GameEngine.getGameList().get(i).getDescription());
						 }
		int response = key.nextInt();
		
		key.close();
	}
}
