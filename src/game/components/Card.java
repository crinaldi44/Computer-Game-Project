/**
 * 
 */
package game.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

/**
 * A card is one of four <code>Suit</code>s, is one of 13 <code>Court</code>s, 
 * and is one of 2 colors. There are 52 cards in one deck.
 * @author chrisrinaldi
 * @date Mar 4, 2017 4:02:23 PM
 */
public class Card {
	
	enum Suit {
		HEART,
		DIAMOND,
		CLUB,
		SPADE;
		
		/**
		 * Generates a random {@link Suit} value.
		 * @return a random suit
		 */
		public static Suit generateRandom() {
			Random r = new Random(Suit.values().length);
			return Suit.values()[r.nextInt()];
		}
	}
	
	enum Face {
		ACE,
		KING,
		QUEEN,
		JACK,
		TEN,
		NINE,
		EIGHT,
		SEVEN,
		SIX,
		FIVE,
		FOUR,
		THREE,
		TWO;
		
		/**
		 * Generates a random {@link Face} value.
		 * @return a random face
		 */
		public static Face generateRandom() {
			Random r = new Random(Face.values().length);
			return Face.values()[r.nextInt()];
		}
		
		/**
		 * Gets whether the first entered card is "higher" 
		 * than the second. (i.e. - its ordinal is higher)
		 * @param face1
		 * @param face2
		 * @return
		 */
		public boolean matchCards(Face face1, Face face2) {
			if (face1 == Face.KING && face2 == Face.QUEEN
					|| face2 == Face.QUEEN && face2 == Face.KING) {
				return false;
			} else if (face1.ordinal() > face2.ordinal()) {
				return true;
			} else if (face1 == face2) {
				return false;
			}
			return false;
		}
	}
	
	enum Court {
		TEST;
		
		/**
		 * Generates a random {@link Court} value.
		 * @return
		 */
		public static Court generateRandom() {
			Random r = new Random(Court.values().length); 
			return Court.values()[r.nextInt()];
		}

	}
	
	private Suit suit;
	private Court court;
	private Color color;
	
	/**
	 * Creates a new {@link Card} object.
	 * @param suit
	 * @param court
	 * @param color
	 */
	public Card(Face face, Suit suit, Court court, Color color) {
		
	}
	
	/**
	 * Default constructor that creates a new {@link Card} with 
	 * a random suit, court, and color.
	 */
	public Card() {
		suit = Suit.generateRandom();
		court = Court.generateRandom();
		color = Color.generateRandom();
	}
	
	/**
	 * Gets the {@link Suit} of the card.
	 * @return
	 */
	public Suit getSuit() {
		return suit;
	}
	
	/**
	 * Gets the {@link Court} of the card.
	 * @return
	 */
	public Court getCourt() {
		return court;
	}
	
	/**
	 * Gets the {@link Color} of the card.
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Sets the {@link Suit} of the card.
	 * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	/**
	 * Sets the {@link Court} of the card.
	 * @param court
	 */
	public void setCourt(Court court) {
		this.court = court;
	}
	
	/**
	 * Sets the {@link Color} of the card.
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
