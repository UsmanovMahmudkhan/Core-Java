package Basic_problems;

public class PrintWriter {
    public static void main(String[] args) {
        java.io.PrintWriter pr= new java.io.PrintWriter(System.out,true);
        pr.write("salom");
        pr.flush();

    }
}
