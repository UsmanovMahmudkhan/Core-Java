package Basic_problems;

/**
 * Task: Create a MyClass<Integer,String> instance using the full form,
 * then re-declare using the diamond <> and with var.
 * Explain when each is allowed and why var can shorten generic declarations.
 */
public class GenDiamondOperator {
    public static void main(String[] args) {
        MyGenClas<Integer,String> myclass= new MyGenClas<>(12,"hi");
        var myText= new MyGenClas<>(13,"Exit");

        System.out.println(myText.getObt()+" "+myText.getObv());

    }
}

class MyGenClas<T,V>{
    T obt;
    V obv;

    public MyGenClas(T obt, V obv) {
        this.obt = obt;
        this.obv = obv;
    }

    public T getObt() {
        return obt;
    }

    public V getObv() {
        return obv;
    }
}
