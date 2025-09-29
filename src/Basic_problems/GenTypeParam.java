package Basic_problems;

/**
 * Task: Given a generic class MyClass<T,V>,
 * implement a method boolean isSame(MyClass<T,V> o)
 * that returns true when both ob1 and ob2 are equal (use .equals).
 * Explain why the method signature must use the same type parameters as the class.
 */
public class GenTypeParam {
    public static void main(String[] args) {
        Mclass<Integer,String> myVal= new Mclass<>(12,"salom");
        Mclass<Integer,String> myVal2= new Mclass<>(12,"salom");
        System.out.println(myVal.myComp(myVal2));

    }
}

class Mclass<T,V>{
    T obt;
    V obv;

    public Mclass(T obt, V obv) {
        this.obt = obt;
        this.obv = obv;
    }

    public T getObt() {
        return obt;
    }

    public V getObv() {
        return obv;
    }

     boolean myComp(Mclass<T,V> o){
       if(this.getObt().equals(o.getObt()) && this.getObv().equals(o.getObv()) ) {
           return true;
       }
       return false;
    }
}