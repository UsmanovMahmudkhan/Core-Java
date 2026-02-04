package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingFile {
    public static void main(String[] args) {
        Path getPath = Paths.get("/Users/Desktop/myJava/src/NIO/TestFolder/test.txt");
        String message = "Hello java NIO";

        try {
            if (!Files.exists(getPath.getParent())) {
                Files.createDirectories(getPath.getParent());
            }

            if (!Files.exists(getPath)) {
                Files.createFile(getPath);
                System.out.println("File created: " + getPath);
            } else {
                System.out.println("File already exists");
            }

            Files.write(getPath, message.getBytes());
            System.out.println("Message written to file");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}