package Leetcode;

public class SellingStock {
    /**
     * Best Time to Buy and Sell Stock
     * <p>
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * <p>
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * <p>
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
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