package Leetcode;

import java.util.Arrays;

public class twoSUM {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit;
        int max=0;
        for (int days = 0; days < prices.length; days++) {
            for (int n_days = days + 1; n_days < prices.length; n_days++) {
                if (prices[days] < prices[n_days]) {
                    profit= prices[n_days] - prices[days];
                    if(profit>max){
                        max=profit;
                                           }
                }
            }
        }

        System.out.println(max);

    }
}
