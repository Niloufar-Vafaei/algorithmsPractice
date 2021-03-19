package com.imp.CompanyInterview;

import java.util.HashSet;
import java.util.Set;

/*26. Remove Duplicates from Sorted Array*/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicatesWithExtramemory(int[] nums) {
        Set<Integer> base = new HashSet();
        for(int c:nums){
            base.add(c);
        }
        return nums.length-base.size();
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
