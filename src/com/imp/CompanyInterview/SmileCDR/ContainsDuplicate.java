package com.imp.CompanyInterview.SmileCDR;
/*217. Contains Duplicate*/
/*
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 *  and it should return false if every element is distinct.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> base = new HashMap<>();
        for (int c : nums) {
            if(base.containsKey(c)){
                return  true;
            }else
            base.put(c,1);
        }
        return false;
    }
    public boolean containsDuplicateStream(int[] nums) {
        return Arrays.stream(nums).distinct().count()<nums.length;
    }
}
