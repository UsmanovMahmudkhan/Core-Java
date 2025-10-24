package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StringEx7LowerUpper {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("plz enter an string: ");
        String input = in.readLine();

        Map<Character, Character> alp = new HashMap<>();
        for (char i = 'a', j = 'A'; i <= 'z'; i++, j++) {
            alp.put(i, j);
            alp.put(j, i);
        }

        StringBuilder result = new StringBuilder();
        for (int k = 0; k < input.length(); k++) {
            char c = input.charAt(k);
            if (alp.containsKey(c)) result.append(alp.get(c));
            else result.append(c);
        }

        System.out.println(result.toString());
    }
}