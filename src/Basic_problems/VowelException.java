package Basic_problems;

import java.util.Scanner;

public class VowelException {
    public static void main(String[] args) throws VowelsExceotions {
        try{
            checkVowels("saaallloom");
        }
        catch (VowelsExceotions e){
            throw new VowelsExceotions(e.getMessage());
        }

    }

    public static void checkVowels(String input) throws VowelsExceotions {
        String[] vowel={"A", "E", "I", "O", "U" ,"a" , "e", "i", "o", "u"};
        boolean found=false;
        for(int i=0;i< vowel.length;i++) {
            if (input.contains(vowel[i])) {

                found = true;
            }
        }
        if(!found) throw new VowelsExceotions("Not Found!!");
        else System.out.println("Found in");
        System.out.println("Finished");

    }
}

class VowelsExceotions extends Exception{
    public VowelsExceotions(String massage) {
        super(massage);
    }
}
