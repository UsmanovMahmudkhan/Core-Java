package Basic_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FactorialLambda {
    public static void main(String[] args) throws IOException {

        BufferedReader read_userInp= new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String input= read_userInp.readLine();
        int inputInt= Integer.parseInt (input);
        FactLambda factorial=(number)->
        {
            int result=1;
            for(int i=2;i<=number;i++){
                result*=i;
            }
            return result;
        };

        System.out.println(factorial.fact(inputInt));

    }
}

@FunctionalInterface
interface FactLambda{
    int fact(int end);
}
