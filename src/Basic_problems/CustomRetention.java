package Basic_problems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * Implement a custom retention
 * policy and test it with a sample annotation.
 */
public class CustomRetention {
    public static void main(String[] args) throws Exception {

        getAnno();
    }

    @Retentions
    public static void getAnno() throws Exception{
        CustomRetention obj=new CustomRetention();
        System.out.println(Arrays.toString(obj.getClass().getMethod("getAnno").getAnnotations()));
        System.out.println("Value: "+obj.getClass().getMethod("getAnno").getAnnotation(Retentions.class).value());
    }
}


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Retentions{

    String value() default "Hi";
}
