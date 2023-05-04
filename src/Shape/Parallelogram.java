package Shape;

public class Parallelogram implements Shape {
    private int a;
    private int b;
    private int height;

    public Parallelogram (int a, int b, int height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }
    public Parallelogram () {
        this.a = 0;
        this.b = 0;
    }

    public int getA () {
        return a;
    }
    public void setA (int a) {
        this.a = a;
    }
    public int getB () {
        return b;
    }
    public void setB (int b) {
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * getA()) + (2 * getB());
    }
}
