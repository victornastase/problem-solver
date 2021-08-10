package com.java.problems.problemsolver.problems.easy;

/**
 * Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.
 *
 * For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.
 */
public class MarketStocks {

    public int maxProfitBruteForce(int[] stocks) {
        int maxProfit = 0;

        for(int i = 0; i < stocks.length; i++) {
            for(int j = i; j < stocks.length; j++) {
                maxProfit = Math.max(maxProfit, stocks[j] - stocks[i]);
            }
        }

        return maxProfit;
    }

    public int maxProfitEnhanced(int[] stocks) {
        int[] reversed = this.reverse(stocks);
        int currentMax = 0;
        int maxProfit = 0;

        for(int i = 0; i < stocks.length; i++) {
            currentMax = Math.max(currentMax, reversed[i]);
            maxProfit = Math.max(maxProfit, currentMax - reversed[i]);
        }

        return maxProfit;
    }

    private int[] reverse(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        int j = size;

        for(int i = 0; i < size; i ++) {
            result[i] = arr[j - 1];
            j--;
        }
        return result;
    }
}
