/**
 * 
 */
package game.components;

import java.util.Random;


/**
 * Description: A (digital) coin (used for flipping). Consists of
 * a face (heads or tails). 
 * @author chrisrinaldi
 * @date Jan 30, 2017 12:07:46 PM
 */
public class Coin {
	
	enum Face {
		HEADS,
		TAILS;
	
	}
	
	/*
	 * The face value of the coin.
	 * Usage: heads or tails
	 */
	private Face face;
	
	/**
	 * Constructs a new <code>Coin</code>.
	 * @param face
	 */
	public Coin(Face face) {
		this.face = face;
	}
	
	/**
	 * Sets the face of the <code>Coin</code> to the given string.
	 * @param face the face
	 */
	public void setFace(Face face) {
		this.face = face;
	}
	
	/**
	 * Returns the face string value of the <code>Coin</code>.
	 * @return face the face of the coin
	 */
	public Face getFace() {
		return face;
	}
	
	/**
	 * Gets whether the <code>Coin</code> is heads.
	 * @return
	 */
	public boolean isHeads() {
		return this.face == Face.HEADS;
	}
	
	/**
	 * Parses an integer to a <code>Face</code> value.
	 * @param identifier
	 * @return
	 */
	public Face toFace(int identifier) {
		return Face.values()[identifier];
	}
	
	/**
	 * Flips the <code>Coin</code> by returning a random value, 
	 * which is then translated to a heads or tails value.
	 */
	public void flipCoin() {
		int value = new Random(1).nextInt();
		this.setFace(toFace(value));
	}

}
