package Shape;

public class Main {

    private static int findPerimeter(Shape [] shapes) {
        int result = 0;
        for (Shape shape : shapes) {
            result += shape.getPerimeter();
        }
        return result;
    }
    public static void main(String[] args) {
        Shape [] shapes = new Shape[8];
        shapes[0] = new Circle();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Circle();
        shapes[4] = new Rectangle();
        shapes[5] = new Circle();
        shapes[6] = new Rectangle();
        shapes[7] = new Circle();

        findPerimeter(shapes);
    }
}
