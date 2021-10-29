/**
 * 
 */
package game.extra;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

/** -- DRIVER FILE --
 * Description: Enter a numerical score, which will translate
 * to a <code>Grades</code> value!
 * @author chrisrinaldi
 * @date Feb 8, 2017 11:44:47 AM
 */
public class Score {
	
	/**
	 * Creates a <code>Logger</code> for this class.
	 */
	public static final Logger logger = Logger.getLogger(Score.class.getName());
	
	enum Grade {
		A(90,100),
		B(80,89),
		C(70,79),
		D(60,69),
		F(0,59);
		
		private int lowerBound, upperBound;
		
		/**
		 * Constructs a new <code>Grades</code>.
		 * @param lower the lower score bound
		 * @param upper the upper score bound
		 */
		Grade(int lower, int upper) {
			this.lowerBound = lower;
			this.upperBound = upper;
		}
		
		/**
		 * Gets the lower score bound for the grade.
		 * @return
		 */
		public int getLower() {
			return lowerBound;
		}
		
		/**
		 * Gets the upper score bound for the grade.
		 * @return
		 */
		public int getUpper() {
			return upperBound;
		}
		
	}
	
	public static void main2(String[] args) {
		Scanner key = new Scanner(System.in);
		logger.info("Welcome! Please enter a score: ");
		int score = key.nextInt();
		logger.info("Your grade is: " + getGrade(score));
	}
	
	/**
	 * Parses a score to a <code>Grades</code> value by iterating
	 * over enumerated values.
	 * @param score
	 * @return
	 */
	public static Grade getGrade(int score) {
		for (Grade grade : Grade.values()) {
			if (score >= grade.getLower() && score <= grade.getUpper()) {
				return grade;
			} 
		} 
		return Grade.F;
	}

}
