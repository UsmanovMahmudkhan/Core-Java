package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StringEx7LowerUpper {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("plz enter an string: ");
        String input = in.readLine();

        Map<Character, Character> alpUpper = new HashMap<>();
        for (char i = 'a', j = 'A'; i <= 'z'; i++, j++) {
            alpUpper.put(i, j);
        }

        Map<Character, Character> alpLower = new HashMap<>();
        for (char i = 'a', j = 'A'; i <= 'z'; i++, j++) {
            alpLower.put(j, i);
        }

        StringBuilder upper = new StringBuilder();

        for (int k = 0; k < input.length(); k++) {
            char c = input.charAt(k);
            if (alpUpper.containsKey(c)) upper.append(alpUpper.get(c));
            else upper.append(c);
        }

        StringBuilder lower = new StringBuilder();
        for (int k = 0; k < input.length(); k++) {
            char c = input.charAt(k);
            if (alpLower.containsKey(c)) lower.append(alpLower.get(c));
            else lower.append(c);
        }

        System.out.println("Upper: "+upper);
        System.out.println("Lower: "+lower);
    }
}