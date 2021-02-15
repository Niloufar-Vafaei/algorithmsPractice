package com.imp.CompanyInterview.SmileCDR.IndexWork;

/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * Input: prices = [7,1,5,3,6,4], Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * */

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int buyIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
                buyIndex = i;
            }
        }
        int sellPrice = prices[buyIndex];
        for (int j=buyIndex;j<prices.length;j++){
            if(sellPrice<prices[j])
                sellPrice=prices[j];
        }
        if (buyPrice > sellPrice|| buyPrice==sellPrice)
            return 0;
        else return sellPrice - buyPrice;
    }

}
