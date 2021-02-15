package com.imp.Numbers;

public class NumberStepsToReduceNumberToZero {
    public int numberOfSteps(int num) {
        if (num == 0) return 0;
        int steps = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num -= 1;
                steps++;
            } else {
                num /= 2;
                steps++;
            }
        }
        return steps;
    }
}
