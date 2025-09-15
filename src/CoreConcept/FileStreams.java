package CoreConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreams {
    public static void main(String[] args) throws Exception {
        if(args.length==0){
            System.out.println("Come one");
            return;
        }
        FileInputStream stream = null;
        int i;
        try {
             stream = new FileInputStream(args[0]);

            while ((i=stream.read())!=-1){
                System.out.println((char) i);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(stream!=null) {
                stream.close();
            }
        }

        }





}
