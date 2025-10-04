package Basic_problems;

import java.util.Arrays;

/**
 * Implement a class GenericStack<T> with methods push, pop, and peek.
 */
public class GenStack {
    public static void main(String[] args) {
        GenericStack<Integer>gen= new GenericStack<>(new Integer[]{1,2,3,4});
        System.out.println(Arrays.toString(gen.values));
        System.out.println(Arrays.toString(gen.push(12)));
        System.out.println(Arrays.toString(gen.push(15)));
        System.out.println(Arrays.toString(gen.pop()));
    }
}

class GenericStack<T>{
    T [] values;

    public GenericStack(T [] value) {
        this.values = value;
    }
    public T [] getValues() {
        return values;
    }

    public T[] push(T oneVal){
        T[] newValues = (T[]) new Object[values.length+1];
        newValues[0]=oneVal;
        for(int i=0;i< values.length;i++){
            newValues[i+1]=values[i];
        }
        values=newValues;

        return values;
    }

    public T[] pop(){
        T[] arr= (T[]) new Object[values.length-1];
        for(int i=0;i< arr.length;i++){
            arr[i]=values[i+1];
        }
        values=arr;
        return values;
    }

    public T peek(){
        return values[0];
    }




}
