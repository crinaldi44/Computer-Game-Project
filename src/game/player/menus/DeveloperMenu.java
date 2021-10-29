/**
 * 
 */
package game.player.menus;

import java.util.Scanner;

import game.GameEngine;
import game.player.managers.MenuManager;

/**
 * Description: The Developer Menu contains special options that allow us to test
 * game aspects and concepts.
 * @author chrisrinaldi
 * @date Feb 8, 2017 11:05:15 AM
 */
public class DeveloperMenu extends MenuManager {

	public DeveloperMenu(GameEngine engine) {
		super(engine);
	}
	
	@Override
	public void displayMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("--==Developer Menu==--\n" 
						+  "1. Test Game (Race-to-One)\n"
						+  "2. Test Player Attributes\n"
						+  "");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			break;
		case 2: 
			System.out.println("Hello");
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid choice! Please try again!");
			break;
		}
	}

}
