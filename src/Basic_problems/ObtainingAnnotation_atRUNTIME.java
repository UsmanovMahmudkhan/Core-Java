package Basic_problems;

import CoreConcept.MethodAnno;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author mahmudkhonusmonov
 * Create a Java method to retrieve and
 * print all annotations from a given class using reflection.
 */
public class ObtainingAnnotation_atRUNTIME {
    public static void main(String[] args) throws Exception {
        MyAnnoClass.getAllAnno();
    }
}

@MyAnno(number = 1)
@MyAnno2
@MyAnno3
class MyAnnoClass{

    @MyAnno4
    public void myAnnoForMethod(){ }

    public static void getAllAnno() throws Exception{
        MyAnnoClass obj=new MyAnnoClass();
        Annotation myAllAnno []= obj.getClass().getAnnotations();
        Annotation[] allMethod =obj.getClass().getMethod("myAnnoForMethod").getAnnotations();
        for(Annotation a: myAllAnno){
            System.out.println(a);
        }

        for(Annotation a: allMethod){
            System.out.println(a);
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String value() default "This is first Anno";
    int number();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2{
    String value() default "This is second Anno";
    int number() default 2;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3{
    String value()  default "This is last Anno that i would like to use";
    int number() default 3;
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno4{
    String value() default "Thiss is only for methods";
    int number() default 4;
}
