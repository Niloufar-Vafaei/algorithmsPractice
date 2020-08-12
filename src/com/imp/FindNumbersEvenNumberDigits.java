package com.imp;

/*Given an array nums of integers, return how many of them contain an even number of digits.*/

public class FindNumbersEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num != 0) {
                num /= 10;
                ++count;
            }
            if (count % 2 == 0) {
                result++;
            }
            count = 0;
        }
        return result;
    }
}

