package Basic_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StringEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader("src/Basic_problems/data.csv"));
        String input;
        ArrayList<String[]> rows = new ArrayList<>();

        while ((input = read.readLine()) != null) {
            System.out.println( rows.add(input.split("\t")));

        }

        System.out.println();

        for (int col = 0; col < rows.get(0).length; col++) {
            System.out.print(rows.get(0)[col] + ": ");
            for (int row = 1; row < rows.size(); row++) {
                System.out.print(rows.get(row)[col] + " ");
            }
            System.out.println();
        }
    }
}