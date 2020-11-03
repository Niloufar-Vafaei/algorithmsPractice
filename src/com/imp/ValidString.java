package com.imp;

public class ValidString {
    public String Validate(String s) {
        int[] indices = new int[26];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int maxFlage = 0;
        int minFlage = 0;
        for (int i = 0; i < s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            indices[idx]++;
            if (max < indices[idx]) {
                max = indices[idx];
            }
        }
        for (int j = 0; j < indices.length; ++j) {
            if (min > indices[j] && indices[j] != 0) {
                min = indices[j];
            }

            if (max == indices[j])
                maxFlage++;
        }
        for (int j = 0; j < indices.length; ++j) {
            if (indices[j] == min)
                minFlage++;
        }
        if (max - min <= 1) {
            if (maxFlage == 1 || minFlage == 1)
                return "YES";
        } else if ((max * maxFlage) + (min * minFlage) == s.length() && (maxFlage*max == 1 || min*minFlage == 1)) {
            return "YES";
        }
        return "NO";
    }
}
