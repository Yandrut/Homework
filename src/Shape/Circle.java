package Shape;

public class Circle implements Shape {
    private int radius;
    public Circle() {
        this.radius = 0;
    }
    public Circle (int radius) {
        this.radius = radius;
    }
    public int getRadius () {
        return radius;
    }
    public void setRadius (int radius) {
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
    @Override
    public double getArea() {
     return Math.PI * Math.pow(getRadius(), 2);
    }


}
