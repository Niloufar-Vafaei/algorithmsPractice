package com.imp.CompanyInterview.SmileCDR;

import java.util.*;

/*350. Intersection of Two Arrays II*/
public class IntersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> num1Mapper = new HashMap<>();
        for (int tmp : nums1) {
            num1Mapper.put(tmp, num1Mapper.getOrDefault(tmp, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int c : nums2) {
            if (num1Mapper.containsKey(c)) {
                if (!result.contains(c))
                    result.add(c);
            }
        }
        int[] arr = new int[result.size()];

        int index = 0;

        for (Integer i : result) {
            arr[index++] = i; //note the autounboxing here
        }
        return arr;

    }
}
