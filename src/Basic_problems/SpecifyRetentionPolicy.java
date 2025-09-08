package Basic_problems;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author mahmudkhonusmonov
 * Explain the difference between SOURCE, CLASS,
 * and RUNTIME retention policies with examples.
 */
public class SpecifyRetentionPolicy {
    public static void main(String[] args) throws NoSuchMethodException {
        ExampleUses exam=new ExampleUses();
        exam.getSource();
        exam.getMyClass();
        exam.getMyRuntime();
    }
}
class ExampleUses{

    @MyScource
    public void getSource() throws NoSuchMethodException {
        System.out.println(new ExampleUses().getClass().getMethod("getSource").getAnnotation(MyScource.class));
    }


    @MyClass
    public void getMyClass() throws NoSuchMethodException {
        System.out.println(new ExampleUses().getClass().getMethod("getMyClass").getAnnotation(MyClass.class));
    }

    @MyRuntime
    public void getMyRuntime() throws NoSuchMethodException{
        System.out.println(new ExampleUses().getClass().getMethod("getMyRuntime").getAnnotation(MyRuntime.class));
    }
}



@Retention(RetentionPolicy.SOURCE)
@interface MyScource{
    String value() default " This is for source()";
}

@Retention(RetentionPolicy.CLASS)
@interface MyClass{

    String value() default "This is for class()";
}


@Retention(RetentionPolicy.RUNTIME)
@interface MyRuntime{

    String value() default "this is for runtime()";


}


