package Leetcode;

/**
 * I know it is not that good code, but at least done by me and will be refactored by me, NOT AI
 * and still working, LOLLLL
 */
class PowerOfThree {
    public static void main(String[] args) {
        System.out.println( isPowerOfThree(27));
    }
    public static  boolean isPowerOfThree(int n) {

        boolean isPower=false;

        if(n==1){
            isPower=true;
        }

        while(n%3==0 && n!=0){
            if(n==3){
                isPower=true;
            }

            n/=3;

        }

        return isPower;
    }
}
