package Basic_problems;

/**
 * @author mahmudkhonusmonov
 * |
 * |
 * |
 * |
 * |_____
 */
public class L_AlF {

    public static void main(String[] args) {

        create(5,5);
    }

    static void create(int row,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(j==0){
                    System.out.print("|");
                } else if (i==row-1) {
                    System.out.print(" __ ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

}
