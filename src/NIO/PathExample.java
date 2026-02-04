package NIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/mahmudkhonusmonov/Desktop/myJava/src/NIO/testFolder");
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileSystem());
        System.out.println(path.normalize());
        System.out.println(path.subpath(0,4));
        //System.out.println(path.toRealPath());

        Path path2=Paths.get("/users/example");
        System.out.println(path.relativize(path2));;
    }
}
