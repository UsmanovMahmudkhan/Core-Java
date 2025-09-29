package Basic_problems;

import java.lang.Number;

/**
 * ask: Implement Stats<T extends Number> that holds T[] nums and provides double average().
 * Explain why T extends Number is needed and what compile error results without it.
 * Provide tests with Integer[] and Double[].
 */
public class GenNumberStats {
    public static void main(String[] args) {
        Stats<Integer>myInt= new Stats<>(new Integer[]{1,2,3,4,5});
        Stats<Short>myShort= new Stats<>(new Short[]{1,2,3,4,5,6,7,8});
        Stats<Float>myFloat= new Stats<>(new Float[]{1.1F,1.2F,1.2F,1.9F});

        myInt.avg();
        myShort.avg();
        myFloat.avg();
    }
}

class Stats<T extends Number>{
    T[] arr;

    public Stats(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void avg(){
        double avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i].doubleValue();

        }
        System.out.println(avg/ arr.length);
    }
}
