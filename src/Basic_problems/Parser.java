package Basic_problems;

import java.io.*;
import java.util.*;

public class Parser {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("src/Basic_problems/data.csv"));
        String headerLine = reader.readLine();
        String[] headers = headerLine.split(",");

        Map<String, List<String>> data = new LinkedHashMap<>();
        for (String header : headers) {
            data.put(header.trim(), new ArrayList<>());
        }

        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            for (int i = 0; i < values.length; i++) {
                data.get(headers[i].trim()).add(values[i].trim());
            }
        }
        reader.close();

        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.join(",", entry.getValue()));
            System.out.println();
        }
    }
}