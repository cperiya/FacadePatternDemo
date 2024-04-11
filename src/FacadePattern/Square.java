package facadePattern;

/** implements shape - square
 * @author Chitra
 * @version 2024.04
 * Class to implement Square
 */
public class Square implements Shape{

	/***
	 * overrides the draw class for square
	 * @param i as input 
	 * @return area of square
	 */
    @Override
    public int draw(int i) {
        System.out.println("Square::draw()");
        int x = i * i;        
        return x;
    }

}
