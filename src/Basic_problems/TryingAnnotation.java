package Basic_problems;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class TryingAnnotation {
    @myTestAnno
    public static void main(String[] args) throws NoSuchMethodException {
        TryingAnnotation obj = new TryingAnnotation();
        Method m = obj.getClass().getMethod("main", String[].class);
        Annotation[] a = m.getAnnotations();
        for (Annotation as : a) {
            System.out.println(as);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface myTestAnno {
    String name() default "Khan";
}
