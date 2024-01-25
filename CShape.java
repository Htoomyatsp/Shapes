/**
 * Abstract class representing a generic shape.
 * @Author Htoo Myat Soe Paing
 */
public abstract class CShape {
    private int ID;
    private static int IDcounter = 0; /** shared attribute */

    /**
     * Constructor for CShape.
     * Auto-increments IDcounter and assigns the upcoming number to ID.
     */
    public CShape() {
        ID = ++IDcounter;
    }

    /**
     * Checks if the given variable is within the valid range (1 to 100).
     *
     * @param dimension The variable to be checked.
     * @return True if the variable is in range, false otherwise.
     */
    public boolean isDimensionValid(int dimension) {
        return dimension > 0 && dimension <= 100;
    }

    /**
     * Checks if the given variable is outside the valid range (1 to 100).
     * If the dimension is invalid, prints a message indicating that it is invalid
     *
     * @param dimension The variable to be checked.
     * @return True if the variable is outside the valid range, false otherwise.
     */
    public boolean isDimensionInvalid(int dimension) {
        boolean invalid = !isDimensionValid(dimension);
        if (invalid) {
            InvalidDimensions();
        }
        return invalid;
    }

    /**
     * Prints a message indicating invalid dimensions.
     */
    public void InvalidDimensions() {
        System.out.println("Invalid dimension(s)");
    }

    /**
     * Get the unique ID of the shape.
     *
     * @return The ID of the shape.
     */
    public int getID() {
        return ID;
    }

    /**
     * Abstract method to be implemented by subclasses.
     *
     * @return String representation of the shape.
     */
    public abstract String toString();
}
