package facadePattern;

/**implements shape - circle
 * @author Chitra
 * @version 2024.04
 * Class to implement Circle
 */
public class Circle implements Shape{

	/***
	 * overrides the draw class for circle
	 * @param i as input
	 * @return area of circle rounded to int
	 */
    @Override
    public int draw(int i) {
       System.out.println("Circle::draw()");
    	double x = 3.14 * i * i;
        return (int)x;
    }
    

}
