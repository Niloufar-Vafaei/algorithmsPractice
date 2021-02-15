package com.imp.HashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] result = new int[101];
        for (int i = 0; i < nums.length; i++)
            ans += result[nums[i]]++;
        return ans;
    }

    public int numIdenticalPairsV2(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j)
                    flag = flag + 1;
            }
        }
        return flag;
    }

    public int numIdenticalPairsV3(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(nums[i])) {
                Integer v = result.get(nums[i]);
                result.put(nums[i], v + 1);
            } else {
                result.putIfAbsent(nums[i], 1);
            }
        }
        int counter = 0;
        for (Map.Entry<Integer, Integer> item : result.entrySet()) {
            counter += (item.getValue() * (item.getValue() - 1)) / 2;
        }

        return counter;
    }


}
