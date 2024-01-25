/**
 * Represents a rectangle shape.
 * @Author Htoo Myat Soe Paing
 */
public class CRectangle extends CShape {
    private int length, width;

    /**
     * Default constructor for CRectangle. Initializes the rectangle with a length and width of 1.
     */
    public CRectangle() {
        length = 1;
        width = 1;
    }

    /**
     * Constructor for CRectangle with specified length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get the length of the rectangle.
     *
     * @return The length of the rectangle.
     */
    public int getLength() {
        return length;
    }

    /**
     * Set the length of the rectangle.
     * If the provided length is invalid, prints a message indicating so.
     *
     * @param length The length to be set.
     */
    public void setLength(int length) {
        if (isDimensionValid(length)) {
            // Only set the length if it is valid
            // If not valid, you may choose to throw an exception or handle it differently
            this.length = length;
        } else {
            InvalidDimensions();
        }
    }

    /**
     * Get the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the width of the rectangle.
     * If the provided width is invalid, prints a message indicating so.
     *
     * @param width The width to be set.
     */
    public void setWidth(int width) {
        if (isDimensionValid(width)) {
            // Only set the width if it is valid
            // If not valid, you may choose to throw an exception or handle it differently
            this.width = width;
        } else {
            InvalidDimensions();
        }
    }

    /**
     * Get a string representation of the rectangle.
     *
     * @return String representation of the rectangle.
     */
    public String toString() {
        return "RECTANGLE " + getLength() + "x" + getWidth();
    }
}
