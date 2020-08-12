package com.imp;


public class RunningSumOfOneDArray {
    public int[] runningSum(int[] nums) {
        int[] sumArray=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sumArray[i]=nums[i];
            } else if (i>= 1) {
                sumArray[i]=  sumArray[i-1] + nums[i];

            }
        }

        return sumArray;

    }
}
