package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordCountStream {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine().trim();
        if (data.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] words = data.split("\\s+");
        System.out.println(words.length);
    }
}