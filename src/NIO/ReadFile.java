package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        byte[] info=Files.readAllBytes(Path.of("/Users/mahmudkhonusmonov/Desktop/myJava/src/NIO/TestFolder/backup/test_backup2.txt"));
        for( byte i:info){
            System.out.print((char)(i));
        }
    }
}
