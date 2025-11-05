package Basic_problems;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int []b=new int[3];
        System.arraycopy(a,0,b,0,3);
        System.out.println(b[2]);


        Runtime rt = Runtime.getRuntime();
        System.out.println("Free memory: " + rt.freeMemory());
        System.out.println("Total memory: " + rt.totalMemory());
        System.out.println("Max memory: " + rt.maxMemory());


    }
}
