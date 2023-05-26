package Annotations.B;

import java.lang.reflect.Field;

public class Main {

    private static boolean isInRange () throws Exception {
        AnnotatedField obj = new AnnotatedField(257);
        Field field = obj.getClass().getDeclaredField("number");
        Range range = field.getAnnotation(Range.class);
        int min = range.min();
        int max = range.max();
        if (obj.getNumber() >= min && obj.getNumber() <= max) {
            return true;
        } else {
            throw new Exception("Out of range");
        }
    }
    public static void main(String[] args) {
        try {
            isInRange();
            System.out.println("Value of an object is in range");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}