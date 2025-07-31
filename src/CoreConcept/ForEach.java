package CoreConcept;

public class ForEach {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++) {
                for (int g = 0; g < 2; g++) {
                    System.out.print(i + "" + j+""+g+"\t");

                }
            }
            System.out.println();
        }
    }
}
