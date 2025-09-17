package Basic_problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOfile {
    public static void main(String[] args) throws IOException {
        BufferedReader read= new BufferedReader(new FileReader("text2.txt"));
        String line=read.readLine();
        System.out.println(line);
    }
}
