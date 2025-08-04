package CoreConcept;

public class Inheritence {
    public static void main(String[] args) {
        A ac=new A();
        B bc =new B();
        ac.a=12;
        ac.b=13;
        ac.sum();
        bc.a=14;
        bc.b=15;
        bc.c=1;
        bc.sums();

    }

}

class A{
    int a;
    int b;

     void sum(){
        System.out.println("A+B = "+(a+b));
    }
}

class B extends A{
    int c;
    void sums(){
        System.out.println("A+B+C = "+(a+b+c));
    }

}
