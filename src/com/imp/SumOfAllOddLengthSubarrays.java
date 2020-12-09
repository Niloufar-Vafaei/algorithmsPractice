package com.imp;
/*
Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
A subarray is a contiguous subsequence of the array.
Return the sum of all odd-length subarrays of arr.
*/

public class SumOfAllOddLengthSubarrays {
    //    public int sumOddLengthSubarraysV1(int[] arr) {
//        int sum = 0, n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int even = ((i + 1) / 2 * ((n - i) / 2)); //cunt of Even left  *  cunt of Even right
//            int odd = ((i + 2) / 2 * ((n - i + 1) / 2)); //cunt of odd left  *  cunt of odd right
//            sum += arr[i] * (even + odd);
//        }
//        return sum;
//    }

    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int endingHere = i + 1;
            int startingHere = n - i;
            int totalSubarrays = endingHere * startingHere;
            int oddSubarrays = totalSubarrays / 2;
            if (totalSubarrays % 2 == 1) {
                oddSubarrays++;
            }
            result += oddSubarrays * arr[i];
        }
        return result;
    }
}
