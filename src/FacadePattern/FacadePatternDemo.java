package facadePattern;

/** main class to perform FacadePattern actions
 * @author Chitra
 * @version 2024.04
 * Facade pattern Demo main class
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		int i = 1;
		ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle(i);
        shapeMaker.drawRectangle(i);
        shapeMaker.drawSquare(i);
	}

}
