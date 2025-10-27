package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Check if two strings share the same first three characters using regionMatches().
 */
public class StringEx17 {
    public static void main(String[] args) throws Exception{
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        String input=read.readLine();
        String input2= read.readLine();
        if(input.regionMatches(0,input2,0,3)){
            System.out.println("They have common first three characters");
        }



    }
}
