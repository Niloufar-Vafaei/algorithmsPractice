package com.imp.CompanyInterview.SmileCDR.Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * */
public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int c : nums) {
            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!tmp.containsKey(i))
                result.add(i);
        }
        return result;
    }
}
