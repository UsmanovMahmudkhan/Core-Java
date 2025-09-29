package Basic_problems;

/**
 * Task: Implement TwoGen<T,V>
 * with two fields, constructor, showTypes(), T getOb1() and V getOb2().
 * Instantiate TwoGen<Integer,String> and print types/values.
 */
public class TwoTypeParam {
    public static void main(String[] args) {
        TwoGen<String,Integer>myTwoGen= new TwoGen<>("Head",12);
        System.out.println(myTwoGen.getObjT()+","+myTwoGen.getObjV());
        myTwoGen.types();
    }
}

class TwoGen<T,V>{
    T objT;
    V objV;

    public TwoGen(T objT, V objV) {
        this.objT = objT;
        this.objV = objV;
    }

    public T getObjT() {
        return objT;
    }

    public V getObjV() {
        return objV;
    }

    public void types(){
        System.out.println("Types: "+objT.getClass().getName()+" and "+objV.getClass().getName());
    }
}
