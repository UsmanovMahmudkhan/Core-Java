package Basic_problems;
import java.util.ArrayList;

public class UnicodeAware {
    public static void main(String[] args) {
        String input = "zHelloПривет";
        StringBuilder nInput = new StringBuilder();

        ArrayList<Character> alf = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alf.add(c);
        }

        ArrayList<Character> russianAlf = new ArrayList<>();
        for (char c = 'а'; c <= 'я'; c++) {
            russianAlf.add(c);
        }
        russianAlf.add('ё');

        for (int i = 0; i < input.length(); i++) {
            char origChar = input.charAt(i);
            char lowerChar = Character.toLowerCase(origChar);

            if (Character.isLetter(origChar)) {
                if (alf.contains(lowerChar)) {
                    int index = alf.indexOf(lowerChar);
                    int newIndex = (index + 3) % alf.size();
                    char encChar = alf.get(newIndex);
                    if (Character.isUpperCase(origChar)) encChar = Character.toUpperCase(encChar);
                    nInput.append(encChar);
                } else if (russianAlf.contains(lowerChar)) {
                    int index = russianAlf.indexOf(lowerChar);
                    int newIndex = (index + 3) % russianAlf.size();
                    char encChar = russianAlf.get(newIndex);
                    if (Character.isUpperCase(origChar)) encChar = Character.toUpperCase(encChar);
                    nInput.append(encChar);
                } else {
                    nInput.append(origChar);
                }
            } else {
                nInput.append(origChar);
            }
        }

        System.out.println("Original input: " + input);
        System.out.println("Encrypted: " + nInput);
    }
}