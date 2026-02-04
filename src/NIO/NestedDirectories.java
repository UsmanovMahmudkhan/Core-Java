package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NestedDirectories {
    public static void main(String[] args) throws Exception {
        Path path= Paths.get("/Users/mahmudkhonusmonov/Desktop/myJava/src/NIO/TestFolder/");
        if(!Files.exists(path))
          Files.createDirectories(path);

        System.out.println((Files.list(path)).toList());;

    }
}
