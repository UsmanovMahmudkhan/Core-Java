package CoreConcept;

import java.lang.Number;

public class SpecialGen {
    public static void main(String[] args) {
        Number_gen<Integer>myInt= new Number_gen<>(12);
        System.out.println(myInt.getObj());
        myInt.showType();

        // Number_gen<String>myStr= new Number_gen<String>("Hi"); --- compile error, coz it only takes number: int double, byte, float, bit
    }
}

class Number_gen<T extends Number>{
    T obj;

    public T getObj() {
        return obj;
    }

    public Number_gen(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType(){
        System.out.println("Type: "+obj.getClass().getName());
    }
}
