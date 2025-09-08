package Basic_problems;

import java.io.IOException;

public class TryingIO {
    public static void main(String[] args) throws IOException {
        for(int i=32;i<127;i++){
           System.out.write(i);
        }
        System.out.flush();


        System.out.println();

        String data="Hello My name is khan";;
        byte[] myData=data.getBytes();
        for(int i=0;i<myData.length;i++) {
            System.out.write(myData[i]);
        }
        System.out.flush();
        System.out.close();
    }
}
