package com.imp.CompanyInterview.SmileCDR;
/* 412. Fizz Buzz */
/*
* Write a program that outputs the string representation of numbers from 1 to n.
* But for multiples of three it should output “Fizz” instead of
* the number and for the multiples of five output “Buzz”.
* For numbers which are multiples of both three and five output “FizzBuzz”.
*
* n = 15, Return:
["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]*/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> re = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                re.add("FizzBuzz");
            else if (i % 5 == 0)
                re.add("Buzz");
            else if (i % 3 == 0)
                re.add("Fizz");
            else
                re.add(String.valueOf(i));
        }
        return re;
    }
}
