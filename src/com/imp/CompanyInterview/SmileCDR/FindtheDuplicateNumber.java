package com.imp.CompanyInterview.SmileCDR;
/*287. Find the Duplicate Number*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindtheDuplicateNumber {
    public int findDuplicateWithExtraMemory(int[] nums) {
        Map<Integer, Integer> base=new HashMap<>();
        for(int c:nums){
            base.put(c,base.getOrDefault(c,0)+1);
        }
        for(int i:nums){
            if(base.get(i)>1){
                return i;
            }
        }
        return -1;
    }
    public int findDuplicate(int[] nums) {
        int result=0;
         Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
         result=i^nums[i];
        }
        return result;
    }
}
