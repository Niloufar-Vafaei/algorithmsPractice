package com.imp.String;

/*
Balanced strings are those who have equal quantity of 'L' and 'R' characters.
Given a balanced string s split it in the maximum amount of balanced strings.
Return the maximum amount of splitted balanced strings.
*/

public class SplitStringBalancedStrings {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int countR = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') countR++;
            else {
                if (s.charAt(i) == 'L') countL++;
            }
            if (countL == countR) {
                sum++;
                countL = countR = 0;

            }
        }
        return sum;

    }
}
