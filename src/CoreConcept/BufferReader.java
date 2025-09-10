package CoreConcept;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

class BufferReaderTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in,System.console().charset()));
        int inp=br.read();
        br.close();
        System.out.println((char)inp);

    }
}
