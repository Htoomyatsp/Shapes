/**
 * Represents a square shape.
 * @Author Htoo Myat Soe Paing
 */
public class CSquare extends CRectangle {
    public CSquare() {
    }

    public CSquare(int side) {
        setSide(side);
    }

    private void setSide(int side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * Get a string representation of the square.
     *
     * @return String representation of the square.
     */
    public String toString() {
        int side = getLength();  // Using getLength() since CSquare extends CRectangle
        return "SQUARE " + side + "x" + side;
    }
}
