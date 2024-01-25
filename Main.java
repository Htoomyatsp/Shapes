/**
 * Main class demonstrating a canvas with random shapes.
 * @Author Htoo Myat Soe Paing
 */
public class Main {

    public static void main(String[] args) {
        // Create a canvas with random shapes
        CCanvas canvas = new CCanvas();

        // Display the shapes on the canvas
        displayCanvasShapes(canvas);
    }

    /**
     * Displays the shapes on the canvas.
     * @param canvas The canvas containing random shapes.
     */
    private static void displayCanvasShapes(CCanvas canvas) {
        System.out.println(">> Displaying random shapes on the canvas:");
        canvas.displayShapes();
    }
}
