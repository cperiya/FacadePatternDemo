package facadePattern;

/** implements shape - rectangle
 * @author Chitra
 * @version 2024.04
 * Class to implement Rectangle
 */
public class Rectangle implements Shape{

	/***
	 * overrides the draw class for rectangle
	 * @param i as input for calculating
	 * returns area of rectangle
	 */
    @Override
    public int draw(int i) {
        System.out.println("Rectangle::draw()");
        int x = i * i;
        
        return x;
    }

}
