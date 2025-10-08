package Basic_problems;

import java.io.*;

/**
 * Create a block lambda that takes a string and returns the reversed version of it.
 */
public class ReverseStringLambda {
    public static void main(String[] args) throws IOException {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        String input=read.readLine();
        StringReverser reverser=(inputs)->{
            String reversed="";
            for(int i=inputs.length()-1;i>=0;i--){
                reversed+=inputs.charAt(i);

            }
            return reversed;
        };

        System.out.println(reverser.getReverse(input));
    }
}

@FunctionalInterface
interface StringReverser{
     String getReverse(String input);
}
