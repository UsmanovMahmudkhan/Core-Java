package Basic_problems;

public class PalindromeIgnore {
    public static void main(String[] args) {
        String input = "Madam, I’m Adam";
        input = input.toLowerCase();

        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letters.append(input.charAt(i));
            }
        }

        String s = letters.toString();
        boolean isPalindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
}