package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Create a block lambda that takes a string
 * and returns how many vowels (a, e, i, o, u) it contains.
 */
public class CountWovelsLambda {
    public static void main(String[] args) {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        try {
            String input=reader.readLine().toLowerCase();


            char[] vowels={'a', 'e', 'i', 'o', 'u'};
            CheckerLambda checkerLambda=(inp)->{

                int count=0;

                for (int i = 0; i < vowels.length; i++) {

                    if (inp.contains(String.valueOf(vowels[i]))) {

                        count++;
                    }
                }

                return count;
            };

            System.out.println(checkerLambda.vowel(input));

        }catch (Exception e){
            System.out.println("Error!");
        }


    }

}
interface CheckerLambda{
    int vowel(String input);
}
