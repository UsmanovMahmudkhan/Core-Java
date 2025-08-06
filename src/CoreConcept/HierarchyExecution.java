package CoreConcept;


import java.lang.Object;

/**
 *                 A
 *             /   |   \
 *            B    C   D
 */
public class HierarchyExecution {
    public static void main(String[] args) throws CloneNotSupportedException {
        //SecondClass secondClass=new SecondClass();

        ThirdClass thirdClass=new ThirdClass();
        SecondClass secondClass=new SecondClass();
        Object myClone= thirdClass.clone();
        System.out.println();
        System.out.println(myClone);
        int code=myClone.hashCode();
        System.out.println(code);



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

class ThirdClass extends SecondClass implements Cloneable {

    ThirdClass(){
        System.out.println("this is last class");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "hi";
    }
}
