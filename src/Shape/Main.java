package Shape;

public class Main {

    private static int findPerimeter(Shape [] shapes) {
        int result = 0;
        for (Shape shape : shapes) {
            result += shape.getPerimeter();
        }
        return result;
    }
    private static int findArea (Shape [] shapes) {
        int result = 0;
        for (Shape shape : shapes) {
            result += shape.getArea();
        }
        return result;
    }
    public static void main(String[] args) {
        Shape [] shapes = new Shape[8];
        shapes[0] = new Circle(34);
        shapes[1] = new Circle(12);
        shapes[2] = new Rectangle(2,9);
        shapes[3] = new Circle(8);
        shapes[4] = new Rectangle(41,20);
        shapes[5] = new Circle(1);
        shapes[6] = new Rectangle(3,31);
        shapes[7] = new Circle(3);

        System.out.println("Perimeter of all shapes: " + findPerimeter(shapes));
        System.out.println("Area of all shapes: " + findArea(shapes));
    }
}
