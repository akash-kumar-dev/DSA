public class MaxProfit {

    // Time Compl. = O(n^2);
    // public static int maxProfit(int[] prices) {
    //     int maxProf = 0;
    //     for(int i = 0; i< prices.length -1; i++) {
    //         for(int j = i+1; j< prices.length; j++) {
    //             if(maxProf < (prices[j]) - prices[i]) {
    //                 maxProf = prices[j] - prices[i];
    //             }
    //         }
    //     }

    //     return maxProf;
        
    // }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i =0; i< prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            profit = Math.max(profit, prices[i] - minPrice);
        }

        return profit;
        
    }
    public static void main(String args[]) {

        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));

    }
}




/*

// 121. Best Time to Buy and Sell Stock

// Easy

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.
 

// Constraints:

// 1 <= prices.length <= 105
// 0 <= prices[i] <= 104

*/