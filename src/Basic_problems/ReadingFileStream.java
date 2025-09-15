package Basic_problems;

import java.io.*;

public class ReadingFileStream {
    public static void main(String[] args) throws IOException {
        FileWriter writer= new FileWriter("text2.txt");
        writer.write("hello Fileooo");
        writer.close();

        FileReader read= new FileReader("text2.txt");
        int i;
        while((i=read.read())!=-1){
            System.out.print( (char)i);
        }
        read.close();
    }
}
