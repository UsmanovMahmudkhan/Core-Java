package CoreConcept;


/**
 *                 A
 *             /   |   \
 *            B    C   D
 */
public class HierarchyExecution {
    public static void main(String[] args) {
        //SecondClass secondClass=new SecondClass();

        ThirdClass thirdClass=new ThirdClass();
    }
}

class FirstClass{
    FirstClass(){
        System.out.println("this is First class");
    }
}

class SecondClass extends FirstClass{
    SecondClass(){
        System.out.println("this is Second class");
    }
}

class ThirdClass extends SecondClass {

    ThirdClass(){
        System.out.println("this is last class");
    }

}
