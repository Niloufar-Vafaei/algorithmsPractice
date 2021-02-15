package com.imp.HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {

            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = 0 - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (s.contains(curr_sum - nums[j])) {
                    List<Integer> elements=new ArrayList<>();
                    elements.add(i);
                    elements.add(j);
                    elements.add(curr_sum - nums[j]);
                    result.add(elements);
                }
                s.add(nums[j]);
            }
        }
        return result;
    }

}
