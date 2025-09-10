package CoreConcept;

import java.io.IOException;

public class InputStreamScratch {
    public static void main(String[] args) throws Exception {

        int data=System.in.read();
        System.out.write(data);
        System.out.flush();

        System.err.println(" Hello Stream");


    }
}
