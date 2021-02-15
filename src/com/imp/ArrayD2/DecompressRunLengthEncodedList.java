package com.imp.ArrayD2;

//We are given a list nums of integers representing a list compressed with run-length encoding.
//
//Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair,
// there are freq elements with value val concatenated in a sublist. Concatenate all the sublists
// from left to right to generate the decompressed list.
//Return the decompressed list

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            l += nums[i];
        }

        int cornetRepeat = nums[0];
        int indexValue = 1;
        int[] resu = new int[l];
        int fillinex = 0;
        while (indexValue < nums.length) {
            resu[fillinex] = (nums[indexValue]);
            fillinex++;
            cornetRepeat--;
            if (cornetRepeat == 0) {
                if (indexValue + 2 < nums.length) {
                    indexValue = indexValue + 2;
                    cornetRepeat = nums[indexValue - 1];
                } else {
                    break;
                }
            }
        }

        return resu;
    }


    public int[] decompressRLElistV2(int[] nums) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                r.add(nums[i + 1]);
            }
        }
        int[] primitive = r.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return primitive;
    }
}
