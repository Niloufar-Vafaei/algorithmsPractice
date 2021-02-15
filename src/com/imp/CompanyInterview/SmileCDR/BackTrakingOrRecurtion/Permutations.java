package com.imp.CompanyInterview.SmileCDR.BackTrakingOrRecurtion;

import java.util.*;
import java.util.stream.Collectors;

/*
* Given an array nums of distinct integers, return all the possible permutations.
*  You can return the answer in any order.
* Constraints:
    1 <= nums.length <= 6
    -10 <= nums[i] <= 10
    All the integers of nums are unique.
*
* Input: nums = [0,1], Output: [[0,1],[1,0]]
* */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> f = new HashSet<>();
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; i < nums.length; i++) {
            List<Integer> copy = new ArrayList<>(list);
            for (int j = 0; j < nums.length; j++) {
                int tmp = copy.get(j);
                copy.set(j, copy.get(i));
                copy.set(i, tmp);
            }
            System.out.print(copy.toString());
            f.add(copy);
        }
        List<List<Integer>> a=new ArrayList<>(f);
        return a;
    }
}
