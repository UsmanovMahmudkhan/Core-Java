package CoreConcept;

import java.io.File;

public class LastModified {
    public static void main(String[] args) {
        File myfile=new File("text.txt");
        System.out.println(myfile.lastModified());
        System.out.println(myfile.length());
        System.out.println(myfile.getAbsolutePath());

    }
}
