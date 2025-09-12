package CoreConcept;

import java.io.*;

public class SimpleInput {
    public static void main(String[] args) throws IOException {
        BufferedWriter read= new BufferedWriter(new FileWriter("text.txt"));
        String input="salom";
        read.write(input);
        read.close();
    }
}
