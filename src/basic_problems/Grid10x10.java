package Basic_problems;

public class Grid10x10 {
    /**
     * Write a Java program to print the following grid.
     *
     * Expected Output :
     *
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     * - - - - - - - - - -
     */
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
