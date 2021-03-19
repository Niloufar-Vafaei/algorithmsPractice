package com.imp.CompanyInterview;

/*268. Missing Number*/
public class MissingNumber {
    public int missingNumberWithExtraMemory(int[] nums) {
        int[] tmp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i]]++;
        }
        int result=-1;
        for (int r = 0; r < tmp.length; r++) {
            if (tmp[r] == 0) return result = r;
        }
        return result;
    }


}
