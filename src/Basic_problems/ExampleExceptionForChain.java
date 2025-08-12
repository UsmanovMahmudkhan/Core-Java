package Basic_problems;

public class ExampleExceptionForChain {

        public static void main(String[] args) {
            try {
                process();
            } catch (Exception e) {
                System.out.println("Caught: " + e);
                System.out.println("Original Cause: " + e.getCause());
            }
        }

        public static void process() throws Exception {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException ae) {
                throw new Exception("Calculation failed", ae);
            }
        }
    }

