package Annotations.C;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        TestClass methods = new TestClass("");
        Class<TestClass> testClassObj = TestClass.class;

        try {
            Constructor constructor = testClassObj.getConstructor(String.class);
            Object instance = constructor.newInstance("String");
            TestClass newInstanceObject = (TestClass) instance;
            Method[] methodsArray = methods.getClass().getDeclaredMethods();
            for (Method method : methodsArray) {
                if (method.isAnnotationPresent(Test.class) &&
                        method.getParameterCount() == 0 &&
                        method.getReturnType().equals(void.class)) {
                    try {
                        method.invoke(newInstanceObject);
                        System.out.println(method.getName() + " successfully passed");
                    } catch (Exception e) {
                        System.out.println("Failed: " + method.getName() + ". " + e.getMessage());
                        e.printStackTrace();
                    }
                } else if (method.isAnnotationPresent(Test.class)) {
                    System.out.println("Method error: " + method.getName() + ". Return type: " + method.getReturnType() + ". Number of parameters: " + method.getParameterCount());
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
