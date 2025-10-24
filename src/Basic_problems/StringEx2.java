package Basic_problems;


import java.io.IOException;

/** @Todo
 * Find the length of the given string without using length().
 */
public class StringEx2 {
    public static void main(String[] args) throws IOException {
        String example="Life is good";
        int count=0;
        while(true){
            try{
                example.charAt(count);
                count++;
            }
            catch (Exception e){
                break;
            }

        }

        System.out.println(count);

    }
}
