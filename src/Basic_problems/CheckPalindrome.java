package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Check Palindrome
 * Write a block lambda that takes a string and returns true if it is a palindrome, otherwise false.
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String input = read.readLine();

            PalindromeLambda checker=(inputs)->

            {
                boolean found=true;
                for(int i=0; i<inputs.length()/2; i++){

                    if(inputs.charAt(i)!=inputs.charAt((inputs.length()-1)-i)){
                        found=false;
                        return found;


                    }
                }
                return found;
            };

            System.out.println(checker.checker(input));
        }
        catch (Exception e){
            System.out.println("Fuck you broo "+e);
        }

        //l0 e1 v2 e3 l4


    }
}

interface PalindromeLambda{
    boolean checker(String input);
}
