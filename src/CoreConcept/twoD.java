package CoreConcept;

public class twoD {
    public static void main(String[] args) {
        int [][] twoD=new int[3][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                twoD[i][j]=i+j;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }
    }
}
