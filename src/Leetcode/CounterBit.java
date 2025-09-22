package Leetcode;

import java.util.ArrayList;

public class CounterBit {
    public static void main(String[] args) {
        System.out.println(countOnes(6)); // Expected: 2
    }

    static ArrayList<Integer> countOnes(int num) {
        ArrayList<Integer> myOnes = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            int x = i;
            int ones = 0;
            while (x > 0) {
                if ((x & 1) == 1) {
                    ones++;
                }
                x >>= 1;
            }
            myOnes.add(ones);
        }
        return myOnes;
    }
}