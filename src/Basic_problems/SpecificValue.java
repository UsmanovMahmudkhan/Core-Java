package Basic_problems;

public class SpecificValue {
    /**
     * Write a Java program to test if an array contains a specific value.
     *
     * @return
     */
    public static void main(String[] args) {
        int target=2;
        boolean value=false;
        int nums[]={3,4,5,6,7,8,9,9,2};
        for(int n=0;n<nums.length;n++) {
            if (target == nums[n]) {
                value = true;
            }

        }
        System.out.println(value);


    }
    }

