public class Outer2 {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.test();


    }
}

class Demo{

    void test()
    {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void sayHello() {
                    System.out.println("Hello");
                }

            }
            Inner2 inner2=new Inner2();
            inner2.sayHello();
        }
    }




}