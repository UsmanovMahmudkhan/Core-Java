package Basic_problems;

public class Anagram {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrade";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (char c : t.toCharArray()) {
            freq[c]--;
        }

        for (int f : freq) {
            if (f != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}