package basic_problems;

public class EvenOrOddUsingBit {
    public static void main(String[] args) {
        int x=117;
        if((x&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

                int iterations = 1_000_000_000;
                long bitwiseSum = 0;
                long moduloSum = 0;

                long start1 = System.nanoTime();
                for (int i = 0; i < iterations; i++) {
                    bitwiseSum += (i & 1);
                }
                long end1 = System.nanoTime();
                System.out.println("Bitwise & Time: " + (end1 - start1) + " ns");

                long start2 = System.nanoTime();
                for (int i = 0; i < iterations; i++) {
                    moduloSum += (i % 2);
                }
                long end2 = System.nanoTime();
                System.out.println("Modulo % Time: " + (end2 - start2) + " ns");

                if (bitwiseSum == moduloSum) System.out.println("Result Match ");
    }
}





