package NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadUsingStreams {
    public static void main(String[] args) throws IOException {
        try (FileInputStream stream = new FileInputStream("/Users/mahmudkhonusmonov/Desktop/myJava/src/NIO/TestFolder/test.txt")) {
            byte[]data= stream.readAllBytes();
            stream.close();
            for(byte bit:data){
                System.out.print((char) bit);
            }

        }
    }
}
