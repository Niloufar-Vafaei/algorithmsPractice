package com.imp.Numbers;

import java.util.Arrays;

public class ShuffleTheArray {
    public int[] shuffleV1(int[] nums, int n) {

        int[] a = Arrays.copyOfRange(nums, 0, n);
        int[] b = Arrays.copyOfRange(nums, n, 2 * n);
        int[] finalArray = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            finalArray[j] = a[i];
            finalArray[j + 1] = b[i];
            j = j + 2;
        }
        return finalArray;
    }

    public int[] shuffle(int[] nums, int n) {
        int[] finalArray = new int[nums.length];
        int finalIndex = 0;
        int SecondPartIndex = n;
        for (int i = 0; i < n; i++) {
            finalArray[finalIndex] = nums[i];
            finalArray[finalIndex + 1] = nums[SecondPartIndex];
            SecondPartIndex++;
            finalIndex = finalIndex + 2;
        }
        return finalArray;
    }
}
