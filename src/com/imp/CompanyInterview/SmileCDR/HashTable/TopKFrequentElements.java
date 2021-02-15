package com.imp.CompanyInterview.SmileCDR.HashTable;

import java.util.*;

/*
 * Given a non-empty array of integers, return the k most frequent elements.
 * Input: nums = [1,1,1,2,2,3], k = 2, Output: [1,2]
 * */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> duplicate = new HashMap<>();
        for (int c : nums) {
            if (duplicate.containsKey(c)) {
                duplicate.put(c, duplicate.get(c) + 1);
            } else
                duplicate.put(c, 1);
        }

        ArrayList<Integer>[] al = new ArrayList[nums.length+1];
        for (Map.Entry<Integer, Integer> entry : duplicate.entrySet()) {
            if (al[entry.getValue()] == null) {
                al[entry.getValue()] = new ArrayList<Integer>();
                al[entry.getValue()].add(entry.getKey());
            } else
                al[entry.getValue()].add(entry.getKey());
        }
//        Arrays.stream(al).forEach(c -> {
//            if (c != null) {
//                System.out.print("[");
//                c.stream().forEach(s -> System.out.print(s));
//                System.out.print("]");
//            }
//        });

        List<Integer> result = new ArrayList<>();
        for (int i = al.length - 1; i >= 0; i--) {
            if (k == 0) break;
            if (al[i] != null) {
                if (al[i].size() > k) {
                    result.addAll(al[i].subList(0, k-1));
                    break;
                } else {
                    result.addAll(al[i]);
                    k = k - al[i].size();
                }
            }
        }
        return result.stream()
                        .mapToInt(i -> i)
                        .toArray();
    }
}
