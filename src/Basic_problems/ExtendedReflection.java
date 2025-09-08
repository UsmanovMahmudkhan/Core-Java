package Basic_problems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@myExtendReflection
public class ExtendedReflection {
    @myExtend4 int age;

    @myExtended3
    public ExtendedReflection(int age) {
        this.age = age;
    }

    @myExtended2
    public static void getAnno(){
        System.out.println("hi");
    }

    public static void sortByAnno() throws NoSuchMethodException, NoSuchFieldException {
        Class<ExtendedReflection> obj = ExtendedReflection.class;

        System.out.println("Class Annotations of type myExtendReflection:");
        if (obj.isAnnotationPresent(myExtendReflection.class)) {
            System.out.println(obj.getAnnotation(myExtendReflection.class));
        }

        System.out.println("\nConstructor Annotations of type myExtended3:");
        for (Constructor<?> c : obj.getConstructors()) {
            for (Annotation a : c.getAnnotations()) {
                if (a.annotationType() == myExtended3.class) {
                    System.out.println(a);
                }
            }
        }

        System.out.println("\nMethod Annotations of type myExtended2:");
        Method m = obj.getMethod("getAnno");
        for (Annotation a : m.getAnnotations()) {
            if (a.annotationType() == myExtended2.class) {
                System.out.println(a);
            }
        }

        System.out.println("\nField Annotations of type myExtend4:");
        Field f = obj.getDeclaredField("age");
        for (Annotation a : f.getAnnotations()) {
            if (a.annotationType() == myExtend4.class) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        sortByAnno();
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface myExtendReflection {
    String value() default "This is for class";
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface myExtended2 {
    String value() default "This is for method";
}

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@interface myExtended3 {
    String value() default "This is for constructor";
}

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface myExtend4 {
    String value() default "This is for field/local variable";
}