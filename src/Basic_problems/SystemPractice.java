package Basic_problems;

public class SystemPractice {
    public static void main(String[] args) {
        long start= java.lang.System.nanoTime();
        long count=1;
        for(long i=0;i<100000000;i++){
            count*=i;
        }

        long end=java.lang.System.nanoTime();
        System.out.println("Time taken: "+(end-start));
        System.out.println(count);
    }
}
