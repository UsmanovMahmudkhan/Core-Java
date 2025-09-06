package Basic_problems;

import java.lang.annotation.*;

/**
 * @author mahmudkhonusmonov
 * Write a simple annotation to mark a class as deprecated.
 */

@Mydeprecated
public class AnnotationBasic {
    public static void main(String[] args) {
        AnnotationBasic ob= new AnnotationBasic();
        for (Annotation annotation : ob.getClass().getAnnotations()) {
            System.out.println(annotation);
        }

        AnotherDeprecated anotherDeprecated=new AnotherDeprecated();
        System.out.println( anotherDeprecated.value);

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Mydeprecated{
    String value() default "Deprecated";
}


@Deprecated
class AnotherDeprecated{
    public String value="Deprecated";
}
