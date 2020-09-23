package com.imp;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int TotalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            TotalSum += nums[i];
        }
        int LeftSum = 0;

        for (int j = 0; j < nums.length; j++) {
            if (LeftSum == TotalSum - LeftSum - nums[j]) {
                return j;
            }
            LeftSum += nums[j];
        }
        return -1;

    }
}
