package com.imp.CompanyInterview.SmileCDR.XOR;
/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 */

import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> resultCheck = new HashMap<>();
        for (int c : nums) {
            if (resultCheck.containsKey(c)) {
                int val = resultCheck.get(c) + 1;
                resultCheck.put(c, val);
            } else
                resultCheck.put(c, 1);
        }
        for (var s : resultCheck.entrySet()) {
            if (s.getValue() == 1) {
                return s.getKey();
            }
        }
        return -1;
    }

    public int singleNumberWithoutExtraMemory(int[] nums) {
/*use XOR
* first , we have to know the bitwise XOR in java
*       0 ^ N = N
*       N ^ N = 0
*       So..... if N is the single number
*       N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
        = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
        = 0 ^ 0 ^ ..........^ 0 ^ N= N
*
* */
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];
        return ans;
    }

}
