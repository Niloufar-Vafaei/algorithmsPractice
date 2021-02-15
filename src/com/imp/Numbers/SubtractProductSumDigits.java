package com.imp.Numbers;

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.

public class SubtractProductSumDigits {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product =1;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            product *= r;
            n /= 10;
        }
        return product-sum;

    }
}
