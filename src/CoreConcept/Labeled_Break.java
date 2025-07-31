package CoreConcept;

public class Labeled_Break {
    public static void main(String[] args) {
        label: for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(j==1) break label;
                System.out.print("Hello");

            }
            System.out.println();
        }
    }
}
