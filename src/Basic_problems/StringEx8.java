package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Write a Java program that prints the 3rd character of a string using charAt().
public class StringEx8 {
    public static void main(String[] args) throws Exception {
        while (true) {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String input = read.readLine();
            if(input.length()>=3){
                System.out.println(input.charAt(3));
            }

        }
    }

}
