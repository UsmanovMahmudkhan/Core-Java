package Basic_problems;

//Convert "Sejong" to a character array using toCharArray() and display the result.

public class StringEx11 {
    public static void main(String[] args) {
        String university="Sejong";
        char myCharArray[]=university.toCharArray();
        for (int i=0;i<myCharArray.length;i++){
            System.out.print(myCharArray[i]+" ");
        }
    }
}
