package com.imp.CompanyInterview.Toptal;

public class CarryOperations {
    public int countCarry(int A, int B) {
        int count = 0;
        int carry = 0;
        while (A != 0 || B != 0) {
            int remainder_A = A % 10;
            int remainder_B = B % 10;

            if ((remainder_A + remainder_B + carry) > 9) {
                count++;
                carry = 1;
            }
            else
                carry=0;

            A = A / 10;
            B = B / 10;
        }
        return count;

    }
}
