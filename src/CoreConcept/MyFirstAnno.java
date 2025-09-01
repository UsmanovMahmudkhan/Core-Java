package CoreConcept;

import java.lang.annotation.Annotation;

public class MyFirstAnno implements MyAnno {
    public static void main(String[] args)  {
        System.out.println(new MyFirstAnno().str());
        System.out.println(new MyFirstAnno().num());
    }

    @Override
    public  String str() {
        return "Hi";
    }

    @Override
    public  int num() {
        return 12;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}




@interface MyAnno{
    String str();
    int num();
}
