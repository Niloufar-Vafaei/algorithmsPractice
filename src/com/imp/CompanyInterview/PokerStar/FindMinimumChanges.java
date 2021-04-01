package com.imp.CompanyInterview.PokerStar;

public class FindMinimumChanges {
    public int solution(int[] A) {
        int countZero = 0, countOne = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0 && i % 2 == 0) {
                countZero++;
            } else if (A[i] != 1 && i % 2 != 0) {
                countZero++;
            }
            if (A[i] != 1 && i % 2 == 0) {
                countOne++;
            } else if (A[i] != 0 && i % 2 != 0) {
                countOne++;
            }
        }
        return Math.min(countOne,countZero);
    }
}
