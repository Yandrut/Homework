package Annotations.C;

import java.lang.reflect.Method;

public class Main {
    @Test
    public static void main(String[] args) throws NoSuchMethodException {
        try {
            Method method = Methods.class.getDeclaredMethod("test");
            if (method.getParameterCount() > 0 || (!(method.getReturnType().equals(void.class)))) {
                throw new IllegalArgumentException("Wrong method here");
            }
            Methods.test();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}