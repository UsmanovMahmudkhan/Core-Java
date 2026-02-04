package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path= Paths.get("/Users/mahmudkhonusmonov/Desktop/myJava/src/NIO/testFolder");
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileSystem());
        System.out.println(path.normalize());
    }
}
