package basic_problems;

public class Face_Print {
    /**
     * Write a Java program to print a face.
     * Expected Output
     *    9
     *  +"""""+
     * [| o o |]
     *  |  ^  |  5
     *  | '-' |
     *  +-----+
     */

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                //Second Line
                if(i==1){
                    if (j == 0) {
                        System.out.print("[");
                    }
                    else if(j == 8){
                        System.out.print("]");
                    }
                    else if(j==3 || j==5){
                        System.out.print("^");
                    } else if (j==1 ||j==7) {
                        System.out.print("|");

                    } else {
                        System.out.print(" ");
                    }

                }

                //First Line
                else if ((i == 0) || (i == 4)) {
                    if(j==1 || j==7){
                        System.out.print("+");
                    }
                    else if(j>1 && j<7){
                        System.out.print("\"");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

                //third line nose
                else if (i==2) {
                    if(j==1 || j==7){
                        System.out.print("|");
                    } else if (j==4)
                    {
                        System.out.print("^");
                    }
                    else {
                        System.out.print(" ");
                    }

                }

                //fourth Line smile
                else if (i==3) {
                    if(j==1 || j==7){
                        System.out.print("|");
                    } else if (j==3 ||j==5) {
                        System.out.print("'");
                    }
                    else if(j==4){
                        System.out.print("-");
                    }
                    else {
                        System.out.print(" ");
                    }
                }




            }
            System.out.println();
        }
    }
}
