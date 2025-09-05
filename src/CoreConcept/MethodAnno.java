package CoreConcept;

import java.lang.Object;
import java.lang.annotation.*;
import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

public class MethodAnno {
    public static void main(String[] args) throws NoSuchMethodException {
        FullAnno.getFull();
    }
}

@Method_Annotation
class FullAnno{

    @Method_Annotation2(description = "salom",age=11)
    public static void getFull() throws NoSuchMethodException {

        Class<?>object= FullAnno.class;
        System.out.println(object);

        Method_Annotation methodAnnotation=object.getAnnotation(Method_Annotation.class);
        System.out.println(methodAnnotation);

        Method_Annotation2 methodAnnotation2=object.getMethod("getFull").getAnnotation(Method_Annotation2.class);

        System.out.println(methodAnnotation2);

        System.out.println();

        Annotation [] myanno=object.getAnnotations();

        for(Annotation a:myanno) {
            System.out.println(a);
        }
    }

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Method_Annotation{
    String description() default "this is for class";
    int value() default 20;
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Method_Annotation2{
    String description();
    int age();
}