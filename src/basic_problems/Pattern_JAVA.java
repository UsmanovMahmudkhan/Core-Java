package basic_problems;

public class Pattern_JAVA {
    /**
     * Write a Java program to display the following pattern.
     * Sample Pattern :
     *
     *    J    a   v     v  a
     *    J   a a   v   v  a a
     * J  J  aaaaa   V V  aaaaa
     *  JJ  a     a   V  a     a
     *
     */
    public static void main(String[] args) {

        for(int i=0;i<4;i++) {
                //rendering J character, using 4x4 format
                for (int j = 0; j < 4; j++) {
                    if (j == 3 && i != 3) {
                        System.out.print("J");

                    } else if (i == 2 && j == 0) {
                        System.out.print("J");
                    } else if (i == 3 && (j == 2 || j == 1)) {
                        System.out.print("J");
                    } else {
                        System.out.print(" ");
                    }

                }
                // rendering A character, using 4x7 format
                System.out.print("\t");
                for (int j = 0; j < 7; j++) {
                    if (isA(i, j)) {
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();


        }

        }


                static boolean isA(int i, int j) {
                    if (i == 0 && j == 3) return true;
                    if (i == 1 && (j == 2 || j == 4)) return true;
                    if (i == 2 && j >= 1 && j <= 5) return true;
                    if (i == 3 && (j == 0 || j == 6)) return true;
                    return false;
                }



}
