package NIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutPutStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream stream=new FileOutputStream("/Users/mahmudkhonusmonov/Desktop/myJava/src/NIO/TestFolder/data/logs/2026/test2.txt");
        String input="Hello, Java IO!";
        try {
            stream.write(input.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Fuckkkkk");;
        }
    }
}
