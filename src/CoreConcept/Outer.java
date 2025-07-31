package CoreConcept;

public class Outer {
    int a = 10;

    public void accessInner() {
        Inner inner = new Inner();
        inner.sayHello();
        inner.b = 15;
        System.out.println(inner.b);
    }

    class Inner {
        int b = 5;
        void sayHello() {
            System.out.println("Hello from Inner");
            System.out.println("CoreConcept.Outer class variable a: " + a);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInner();
    }
}