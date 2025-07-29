package basic_problems;
/**
 *          *1
 *         ***3
 *        *****5
 *       *******7
 *      *********9
 *     ***********11
 *    *************13
 *   ***************15
 *  *****************17
 * *******************19
         * **
         * ***
         * ****
         * *****
         * ******
         * *******
         * ********
         * *********
         * **********
 */
public class Triangle {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
            //           }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            //System.out.print((2 * i + 1));
            System.out.println();
        }
    }
}
