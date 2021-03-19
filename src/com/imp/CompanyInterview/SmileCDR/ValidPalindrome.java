package com.imp.CompanyInterview.SmileCDR;

/*
 * 125. Valid Palindrome
 * Given a string s, determine if it is
 * a palindrome, considering only alphanumeric characters and ignoring cases.
 * */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9 ]", "").toLowerCase();
        s=s.replaceAll("\\s","");
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            j--;
        }
        return true;
    }
}
