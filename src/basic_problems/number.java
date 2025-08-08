package Basic_problems;

public class number {
    public static void main(String[] args) {
        System.out.println(fbNum(4));
    }

    static long fbNum(int i){
        if(i==0){
            return 0;
        }
        if (i==1) {
            return 1;
        }

            return fbNum(i-1)+fbNum(i-2);


    }
}
