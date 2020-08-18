package com.imp;
/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.
*/

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayGivenOrder {
    public int[] createTargetArrayV2(int[] nums, int[] index) {
        List a = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int j = 0; j < a.size(); j++) {
            target[j] = (int) a.get(j);
        }
        return target;

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] == i) {
                target[index[i]] = nums[i];
            } else {
                int tmp;
                for (int j = index[i]; j < i + 1; j++) {
                    tmp = target[j];
                    target[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }

        return target;

    }

    public int[] createTargetArrayV3(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] == i) {
                target[index[i]] = nums[i];
            } else {
                for (int j = i; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
        }

        return target;

    }
}

