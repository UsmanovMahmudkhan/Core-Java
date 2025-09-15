package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TakingStringStream {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] mydata= new String[100];
        String input;
        for(int i=0;i<mydata.length;i++){
            input=reader.readLine();
            if(input.equals("stop")){
                break;
            }
            mydata[i]=input;
        }

        for(int i=0;i<mydata.length;i++){
            if (mydata[i]!=null) {
                System.out.print(mydata[i] + " ");
            }
            else{
                break;
            }
        }


    }
}
