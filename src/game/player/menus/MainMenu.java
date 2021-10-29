/**
 * 
 */
package game.player.menus;

import game.GameEngine;
import game.player.managers.MenuManager;

/**
 * @author chrisrinaldi
 * @date Feb 8, 2017 11:00:01 AM
 */
public class MainMenu extends MenuManager {

	public MainMenu(GameEngine engine) {
		super(engine);
	}
	
	@Override
	public void displayMenu() {
		System.out.println("");
	}

}
