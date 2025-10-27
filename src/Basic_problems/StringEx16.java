package Basic_problems;

/**
 * Extract every vowel character from a string using charAt() and print them.
 */
public class StringEx16 {
    public static void main(String[] args) {
        String input="I study at Sejong university";
        char[] vowels={'a','e','i','u','o'};
        System.out.println("Vowels in "+input+": ");
        for (int i=0;i<input.length();i++){

            for(int j=0;j< vowels.length;j++) {

                if (input.charAt(i) == vowels[j]) {

                    System.out.print(input.charAt(i) + " ");
                }

            }

        }
    }
}
