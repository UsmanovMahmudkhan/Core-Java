package CoreConcept;

import java.lang.annotation.*;
import java.lang.annotation.Annotation;

public class MyAnno {
    public static void main(String[] args) throws Exception {
        Info.getInfo();
    }
}

@Test1(id = 230130, name = "Khan")
class Info {
    public static void getInfo() {
        Class<Info> aClass = Info.class;
        Test1 annotation = aClass.getAnnotation(Test1.class);
        System.out.println("id = " + annotation.id());
        System.out.println("name = " + annotation.name());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Test1 {
    int id();
    String name();
}