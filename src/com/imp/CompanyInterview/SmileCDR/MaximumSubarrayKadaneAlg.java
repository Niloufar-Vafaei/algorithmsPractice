package com.imp.CompanyInterview.SmileCDR;

/*
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4], Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * */
public class MaximumSubarrayKadaneAlg {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
    public int maxSubArrayKadaneAlg(int [] nums){
        int soFarMax =nums[0],hereMax=nums[0];

        for(int i=1;i<nums.length;i++){
            hereMax=Math.max(hereMax+nums[i],nums[i]);
            soFarMax=Math.max(hereMax,soFarMax);
        }
        return soFarMax;
    }

}
