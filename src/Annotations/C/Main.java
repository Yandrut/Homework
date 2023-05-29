package Annotations.C;

import java.lang.reflect.Method;

public class Main {
   
    public static void main(String[] args) {
        Methods methods = new Methods();
        try {
            Method[] methodsArray = methods.getClass().getMethods();
            for (Method method : methodsArray) {
                if (method.getParameterCount() == 0 && method.getReturnType().equals(void.class)) {
                    method.invoke(Methods.class);
                } else {
                    System.out.println("Method error: " + method.getName() + ". Return type: " + method.getReturnType() + ". Number of parameters: " + method.getParameterCount());
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
