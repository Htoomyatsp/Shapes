import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a canvas containing a list of random shapes.
 * @Author Htoo Myat Soe Paing
 */
public class CCanvas {
    private List<CShape> shapes = new ArrayList<>();

    /**
     * Default constructor for CCanvas. Generates a list of random shapes.
     */
    public CCanvas() {
        generateRandomShapes();
    }

    /**
     * Generates random shapes and adds them to the list.
     */
    private void generateRandomShapes() {
        Random random = new Random();

        int NUM_SHAPES = 10;
        for (int i = 0; i < NUM_SHAPES; i++) {
            CShape shape = createRandomShape(random);
            shapes.add(shape);
        }
    }

    /**
     * Creates a random shape based on a randomly selected shape type.
     *
     * @param random The Random object used for generating dimensions.
     * @return A random CShape object.
     */
    private CShape createRandomShape(Random random) {
        int shapeType = random.nextInt(4);
        int dimension1 = getRandomDimension(random);
        int dimension2 = getRandomDimension(random);

        return switch (shapeType) {
            case 0 -> new COval(dimension1, dimension2);
            case 1 -> new CCircle(dimension1);
            case 2 -> new CRectangle(dimension1, dimension2);
            case 3 -> new CSquare(dimension1);
            default -> throw new IllegalStateException("Unexpected shape type: " + shapeType);
        };
    }

    /**
     * Generates a random dimension within the valid range.
     *
     * @param random The Random object used for generating dimensions.
     * @return A random dimension between 1 and MAX_DIMENSION.
     */
    private int getRandomDimension(Random random) {
        int MAX_DIMENSION = 100;
        return random.nextInt(MAX_DIMENSION) + 1;
    }

    /**
     * Displays the shapes in the canvas along with their respective numbers.
     */
    public void displayShapes() {
        int shapeNumber = 1;
        for (CShape shape : shapes) {
            System.out.println("Shape " + shapeNumber++ + ": " + shape);
        }
    }
}
