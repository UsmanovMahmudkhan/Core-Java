package CoreConcept;

public class InstanceOfClass {
    public static void main(String[] args) {
        A_ins a = new A_ins();
        B_ins b= new B_ins();
        C_ins c= new C_ins();
        D_ins d= new D_ins();

        if(a instanceof A_ins){
            System.out.println("A is instance of A");
        }

        if (b instanceof A_ins) {
            System.out.println("b is instance of A_ins");
        }

        if(c instanceof A_ins){
            System.out.println("c is instacne of A_ins");
        }


    }
}

class A_ins{
    int a;
    int b;
}

class B_ins extends A_ins{
    int k;
}

class C_ins extends B_ins{
    int k;
}

class D_ins extends A_ins{
    int d;
}
