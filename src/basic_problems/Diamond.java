package basic_problems;

public class Diamond {
    /**
     * @author khan
     *
     * height=9
     *
     * 1    *
     * 2   * *
     * 3  *****
     * 4 *     *
     * 5 *******
     * 6 *     *
     * 7  *****
     * 8   * *
     * 9    *
     */
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i<5) {
                for (int j = 0; j < 6 - i - 1; j++) {
                    System.out.print(" ");
                }

                for(int in=0;in<i*2+1;in++){
                    System.out.print("*");
                }

            }
            else{
                for(int k=5;k<i+1;k++){
                    System.out.print(" ");
                }

                for(int in=0;in<19-i*2;in++){
                    System.out.print("*");
                }

            }
            System.out.println();

        }

    }
}
