package com.imp.HashTable;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> searching = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            searching.put(nums[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            int indexV = searching.getOrDefault(v, -1);
            if (indexV != -1 && indexV != i) {
                result[0] = i;
                result[1] = indexV;
                break;
            }

        }
        return result;
    }
}
