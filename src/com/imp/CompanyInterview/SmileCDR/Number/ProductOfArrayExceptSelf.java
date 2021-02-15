package com.imp.CompanyInterview.SmileCDR.Number;
/*
* Given an array nums of n integers where n > 1,  return an array output such that output[i]
* is equal to the product of all the elements of nums except nums[i].
* */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelfBrutal(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }
    //the brutal way return time out when the nums is too long,

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
