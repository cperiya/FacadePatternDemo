package facadePattern;

/** class that calls the different shapes to draw
 * @author Chitra
 * @version 2024.04
 * Class to implement ShapeMaker for each shape
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    /***
     * draw a circle
     * @param i input to draw circle
     * @return area of circle
     */
    public int drawCircle(int i)
    {
        return circle.draw(i);
    }
    
    /**draw a rectangle
     * @param i input to draw rectangle
     * @return area of rectangle
     */
    public int drawRectangle(int i)
    {
    	return rectangle.draw(i);
    }
    
    /**draw a square
     * @param i input to draw square
     * @return area of the square
     */
    public int drawSquare(int i)
    {
    	return square.draw(i);
    }

}
