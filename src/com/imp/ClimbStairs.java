package com.imp;


/*
    A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
    Implement a method to count how many possible ways the child can run up the stairs.
*/
/*

for solve this question we have to ways
    1.Recursive Method (time complexity is O(2^n))
    2.Dynamic Programming (time complexity is O(n))
*/

public class ClimbStairs {
    public int step(int numbers) {
        int[] result = new int[numbers + 1];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i < numbers; ++i) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result[numbers];
    }

    public int findSteps(int n) {
        if (n == 1 || n == 0)

            return 1;
        else if (n == 2)
            return 2;
        else {
            return findSteps(n-3)+findSteps(n-2)+findSteps(n-1);
        }

    }

}
