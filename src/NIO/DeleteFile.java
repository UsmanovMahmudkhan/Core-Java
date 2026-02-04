package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) throws IOException {

        String home = System.getProperty("user.home");
        Path path= Paths.get("/Users/?/Desktop/myJava/src/NIO/TestFolder/test.txt");
        if( Files.deleteIfExists(path)){
            System.out.println("Deleted");
        }
        else {
            System.out.println("NO");
        }
    }
}
