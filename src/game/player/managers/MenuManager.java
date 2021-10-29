/**
 * 
 */
package game.player.managers;

import game.GameEngine;

/**
 * @author chrisrinaldi
 * @date Feb 8, 2017 10:58:08 AM
 */
public class MenuManager {
	
	private GameEngine engine;
	
	/**
	 * Constructs a new <code>GameMenus</code> handler.
	 * @param engine the engine that the menu appears under
	 */
	public MenuManager(GameEngine engine) {
		this.engine = engine;
	}
	
	public MenuManager() {
		displayMenu();
	}
	
	public void displayMenu() {
		
	}

}
