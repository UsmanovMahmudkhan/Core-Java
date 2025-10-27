package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Convert a string into a byte array using getBytes() and print each byte.
 */
public class StringEx10 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input= reader.readLine();
        byte [] myByte=input.getBytes();
        System.out.println(input);
        for(int i=0;i<myByte.length;i++){
            System.out.print(myByte[i]+" ");
        }

    }
}
