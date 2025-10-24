package CoreConcept;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamExample {
    public static void main(String[] args) throws InterruptedException {
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream("example.txt"), "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}