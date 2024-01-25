/**
 * Represents an oval shape.
 * @Author Htoo Myat Soe Paing
 */
public class COval extends CShape {
    private int horizontalRadius, verticalRadius;

    /**
     * Default constructor for COval. Initializes the oval with horizontal and vertical radii of 1.
     */
    public COval() {
        setHorizontalRadius(1);
        setVerticalRadius(1);
    }

    /**
     * Constructor for COval with specified horizontal and vertical radius.
     *
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius The vertical radius of the oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        setHorizontalRadius(horizontalRadius);
        setVerticalRadius(verticalRadius);
    }

    /**
     * Get the horizontal radius of the oval.
     *
     * @return The horizontal radius of the oval.
     */
    public int getHorizontalRadius() {
        return horizontalRadius;
    }

    /**
     * Set the horizontal radius of the oval.
     * If the provided horizontal radius is invalid, prints a message indicating so.
     *
     * @param horizontalRadius The horizontal radius to be set.
     */
    public void setHorizontalRadius(int horizontalRadius) {
        if (isDimensionValid(horizontalRadius)) {
            this.horizontalRadius = horizontalRadius;
        } else {
            System.out.println("Invalid horizontal radius: " + horizontalRadius);
            InvalidDimensions();
        }
    }

    /**
     * Get the vertical radius of the oval.
     *
     * @return The vertical radius of the oval.
     */
    public int getVerticalRadius() {
        return verticalRadius;
    }

    /**
     * Set the vertical radius of the oval.
     * If the provided vertical radius is invalid, prints a message indicating so.
     *
     * @param verticalRadius The vertical radius to be set.
     */
    public void setVerticalRadius(int verticalRadius) {
        if (isDimensionValid(verticalRadius)) {
            this.verticalRadius = verticalRadius;
        } else {
            System.out.println("Invalid vertical radius: " + verticalRadius);
            InvalidDimensions();
        }
    }

    /**
     * Get a string representation of the oval.
     *
     * @return String representation of the oval.
     */
    public String toString() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}
