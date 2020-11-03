package com.imp;

public class ReverseString {
    public String reverse(String s) {
        StringBuilder rev = new StringBuilder();

        for (int i = s.length(); i >= 0; --i) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
