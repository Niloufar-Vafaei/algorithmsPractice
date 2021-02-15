package com.imp.CompanyInterview.SmileCDR.HashTable;

import java.util.HashMap;
import java.util.Map;

/*
 *   Given an array nums of size n, return the majority element.
 *   The majority element is the element that appears more than ⌊n / 2⌋ times.
 *   You may assume that the majority element always exists in the array.
 *   Input: nums = [2,2,1,1,1,2,2] ,Output: 2
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int c : nums) {
            if (tmp.containsKey(c)) {
                tmp.put(c, tmp.get(c) + 1);
            } else {
                tmp.put(c, 1);
            }
        }
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
            if (max == null || entry.getValue().compareTo(max.getValue()) > 0) {
                max = entry;
            }
        }
        return max.getKey();
    }

    public int majorityElementStream(int[] nums) {
        return -1;
    }
}
