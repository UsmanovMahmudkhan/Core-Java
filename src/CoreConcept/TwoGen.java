package CoreConcept;

import java.util.Vector;

public class TwoGen {
    public static void main(String[] args) {
        Gen<String,Integer>myGen = new Gen<>("Hello",20);
        myGen.showTtype();
        myGen.showVtype();
    }
}

class Gen<T,V>{
    T obt;
    V obv;

    public Gen(T obt, V obv) {
        this.obt = obt;
        this.obv = obv;
    }

    public T getObt() {
        return obt;
    }

    public V getObv() {
        return obv;
    }


    public void showTtype(){
        System.out.println("Class Type: "+obt.getClass().getName());

    }

    public void showVtype(){
        System.out.println("Class TYpe: "+obv.getClass().getName());
    }


}

