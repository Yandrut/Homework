package Annotations.A;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String str() default "Info";
}
@Info(str = "Main")
public class Main {
    public static void annotation () {
        Main obj = new Main();
        Annotation[] annotations = obj.getClass().getDeclaredAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        annotation();
    }
}
