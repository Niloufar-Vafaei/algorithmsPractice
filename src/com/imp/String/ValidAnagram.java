package com.imp.String;


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] asciiArray = new int[150];
        for (int i = 0; i < s.length(); i++) {
            asciiArray[s.charAt(i)]++;
            asciiArray[t.charAt(i)]--;
        }

        for (int n : asciiArray) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}