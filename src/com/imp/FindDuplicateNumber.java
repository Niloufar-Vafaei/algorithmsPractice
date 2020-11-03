package com.imp;

import java.util.HashMap;

public class FindDuplicateNumber {
    public int findDuplicateV1(int[] nums) {
        int[] ex = new int[150];
        for (int i = 0; i < nums.length; i++) {
            ex[nums[i]]++;
        }
        int result = 0;
        for (int c=0; c<ex.length;c++) {
            if (ex[c] > 1) {
                result = c;
            }
        }
        return result;
    }
    //other way if the number in array is big

//    public int findDuplicate(int[] nums) {
//        HashMap<Integer,Integer> check=new HashMap<>();
//        for(int i=0; i<nums.length;++i){
//            check.put(nums[i],i);
//        }
//
//
//    }

}
