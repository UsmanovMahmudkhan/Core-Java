package Collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;


public class ArrayListEx4 {
    public static void main(String[] args) {
        ArrayList<Double>array=new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        Spliterator<Double>splitArray= array.spliterator();
        splitArray.forEachRemaining(System.out::println);
        ArrayList<Double> sqrtList = new ArrayList<>();
        Spliterator<Double> root = array.spliterator();
        root.forEachRemaining(number -> sqrtList.add(Math.sqrt(number)));
        sqrtList.forEach(System.out::println);
        root.forEachRemaining(num -> System.out.println(Math.sqrt(num)));


    }
}
