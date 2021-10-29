/**
 * 
 */
package game.components;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Random;

/**
 * A color is a shade of light that is either a primary, 
 * secondary (mix of primaries), tertiary, and so on.
 * @author chrisrinaldi
 * @date Mar 4, 2017 4:05:46 PM
 */
public enum Color {
	
	RED("0xFF0000");
	
	private String hex;
	
	/**
	 * Gets the hex code of the specified <code>Color</code>.
	 * @return hex the hex code
	 */
	public String getHex() {
		return hex;
	}
	
	/**
	 * Constructs a new <code>Color</code> object.
	 * @param hex the hex code of the color
	 */
	Color(String hex) {
		this.hex = hex;
	}
	
	/**
	 * A collection of all elements of <code>Color</code>.
	 */
	private Collection<Color> colors = EnumSet.allOf(Color.class);
	
	/**
	 * Gets a null-safe <code>Color</code> for the specified hex
	 * string code.
	 * @param hex the hex string
	 * @return an optional of the color
	 */
	public Optional<Color> forHex(String hex) {
		return colors.stream().filter(i -> i.getHex() == hex).findFirst();
	}
	
	/**
	 * Generates a random <code>Color</code> element.
	 * @return a random element of color
	 */
	public static Color generateRandom() {
		Random r = new Random(Color.values().length);
		return Color.values()[r.nextInt()];
	}

}
