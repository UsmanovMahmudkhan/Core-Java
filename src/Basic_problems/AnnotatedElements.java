package Basic_problems;

import java.lang.annotation.*;

/**
 * @author mahmudkhonusmonov
 * List the methods provided by the Annotat-
 * edElement interface and describe their use.
 */

public class AnnotatedElements {
    public static void main(String[] args) throws Exception {
        UseAnnoInterface.getAll();
    }
}

@myAnnoo()
class UseAnnoInterface{
    public static void getAll() throws Exception{
       Class<UseAnnoInterface> myClass= UseAnnoInterface.class;
       if(myClass.isAnnotationPresent(myAnnoo.class)){
           Annotation [] myAnnos= myClass.getAnnotations();
           for(Annotation a:myAnnos){
               System.out.println("My Annotation: "+a);
           }
       }

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnoo {
    String value() default "Just text";
}
