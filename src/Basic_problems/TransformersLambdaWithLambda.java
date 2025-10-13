package Basic_problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Todo
 * Generic Transformer
 * Define a functional interface with a method that transforms an input of type T into an output of type R.
 * Use lambdas to:

 * 	1.	Convert a list of integers into their string representations
 * 	2.	Convert a list of strings into their lengths
 */

public class TransformersLambdaWithLambda {
    public static void main(String[] args) {

        Transformer<Integer> conIntString = new Transformer<>() {
                @Override
                public <R> R get(Integer[] number) {
                    ArrayList<String> myStr = new ArrayList<>();
                    for (int i = 0; i < number.length; i++) {
                        myStr.add(String.valueOf(number[i]));
                    }
                    return (R) String.valueOf(myStr);
                }
            };

            System.out.println(conIntString.<String>get(new Integer[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(conIntString.getClass());
        }
    }


interface Transformer<T>{
       <R> R get(T[] type);
}

