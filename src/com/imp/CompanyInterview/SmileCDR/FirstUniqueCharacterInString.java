package com.imp.CompanyInterview.SmileCDR;
/*
387. First Unique Character in a String
* Given a string, find the first non-repeating character
* in it and return its index. If it doesn't exist, return -1.
*s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
* */
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        if (s.length() < 1) return -1;
        Map<Character, Integer> base = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            base.put(s.charAt(i), base.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if (base.get(s.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;
    }
}
