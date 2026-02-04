package NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/?/Desktop/myJava/src/NIO/TestFolder/test.txt");
        Path copyPath=Paths.get("/Users/?/Desktop/myJava/src/NIO/TestFolder/backup/");
        if(!Files.exists(copyPath)){
            Files.createDirectories(copyPath);
        }
        Path backup=copyPath.resolve("test_backup2.txt");
        Files.copy(path, backup);
    }
}
