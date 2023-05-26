package Annotations.B;
public class AnnotatedField {
    @Range (min = 0, max = 256)
    private int number;

    public AnnotatedField (int number) {
        this.number = number;
    }
    public int getNumber () {
        return number;
    }
    public void setNumber (int number) {
        this.number = number;
    }
}
