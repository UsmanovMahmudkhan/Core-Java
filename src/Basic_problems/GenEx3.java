package Basic_problems;

/**
 @creator Usmonov Mahmudkhon
 @exercise Create a generic class `Triple<A, B, C>` that can store three values of types A, B, and C.
 @task1 Add a constructor to initialize all three values.
 @task2 Write methods to return the first, second, and third values separately.
 @task3 Write a method `display()` to return the triple in the format "(first, second, third)".
 @task4 In the main method, create objects of Triple with different type combinations:
 (Integer, String, Double), (String, String, String), (Boolean, Integer, Character).
 @task5 Print the results and check if it works with different type combinations.
 */

public class GenEx3 {
    public static void main(String[] args) {
        Triple<Integer,String,Double> triple1= new Triple<>(20,"khan",3.5);
        Triple<String,String,String > triple2= new Triple<>("Usman","Mahmud","Sejong");
        Triple<Boolean,Integer,Character>triple3= new Triple<>(true,20,'s');

        System.out.println(triple1);
        System.out.println(triple2);
        System.out.println(triple3);
    }
}

class Triple<A,B,C>{
    A a;
    B b;
    C c;

    public Triple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + ")";
    }
}
