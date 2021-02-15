package com.imp.CompanyInterview.SmileCDR.Number;
/*
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num
 * calculate the number of 1's in their binary representation and return them as an array.
 *Input: 2, Output: [0,1,1]
 */


public class CountingBits {
    public int[] countBits(int num) {
        int[] answer = new int[num + 1];

        if (num >= 0)
            answer[0] = 0;

        for (int i = 1; i <= num; i++) {
            answer[i] = answer[i / 2] + i % 2;
        }
        return answer;
    }

}
