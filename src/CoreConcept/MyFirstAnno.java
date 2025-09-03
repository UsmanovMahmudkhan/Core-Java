package CoreConcept;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class MyFirstAnno{
    public static void main(String[] args) {
        Test.meth();
    }
}

@wtf(name = "Shibal",age=99)
class Test {
    public static void meth(){
        Test t= new Test();
        Annotation[] a= t.getClass().getAnnotations();
        for(Annotation each:a){
            System.out.println(each);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface wtf{
    String name();
    int age();
}