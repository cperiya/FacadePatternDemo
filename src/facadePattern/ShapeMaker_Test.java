package facadePattern;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ShapeMaker_Test {


	/**
	 * test draw method when shape is circle
	 */
	@Test
	public void drawCircle_test() {
		ShapeMaker shapeMaker = new ShapeMaker();        
		 assertEquals(3, shapeMaker.drawCircle(1));
		
	}
	
	/***
	 * test draw method when shape rectangle
	 * 
	 */
	@Test
	public void drawRectangle_test() {
		ShapeMaker shapeMaker = new ShapeMaker();        
		 assertEquals(1, shapeMaker.drawRectangle(1));
		
	}
	
	/***
	 * test draw method when shape is square
	 * 
	 */
	@Test
	public void drawSquare_test() {
		ShapeMaker shapeMaker = new ShapeMaker();        
		 assertEquals(1, shapeMaker.drawSquare(1));
		
	}

}
