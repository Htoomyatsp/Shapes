/**
 * Represents a circle shape
 * @Author Htoo Myat Soe Paing
 */
public class CCircle extends COval {

    /**
     * Default constructor for CCircle.
     */
    public CCircle() {
    }

    /**
     * Constructor for CCircle with specified radius.
     *
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        setRadius(radius);
    }

    /**
     * Set the radius of the circle.
     * If the provided radius is invalid, prints a message indicating so.
     *
     * @param radius The radius to be set.
     */
    private void setRadius(int radius) {
        super.setHorizontalRadius(radius);
        super.setVerticalRadius(radius);
    }

    /**
     * Get a string representation of the circle.
     *
     * @return String representation of the circle.
     */
    public String toString() {
        return "CIRCLE " + getHorizontalRadius();
    }
}

