package Shape;

public class Rectangle implements Shape {
    private int length;
    private int width;
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle () {
        this.length = 0;
        this.width = 0;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
      this.length = length;
    }
    public int getWidth () {
        return width;
    }
    public void setWidth (int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
}
