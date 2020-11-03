package com.imp;

public class LargestSubstringBetweenTwoEqualCharacters {
    //    public int maxLengthBetweenEqualCharactersV1(String s) {
//        char tmp;
//        int firstIndex = 0;
//        int lastIndex = 0;
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            tmp = s.charAt(i);
//            firstIndex = i;
//            for (int j = i + 1; j < s.length(); j++) {
//                if (tmp == s.charAt(j)) {
//                    lastIndex = j;
//                }
//            }
//            if (max <= Math.abs(lastIndex - firstIndex))
//                max = Math.abs(lastIndex - firstIndex);
//        }
//        if (max == 1)
//            return 0;
//        if (max==0)
//            return -1;
//else return max;
    // }
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] indices = new int[26];
        int maxLen = -1;
        for (int i = 0; i < s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            if (indices[idx] > 0) {
                maxLen = Math.max(maxLen, i - indices[idx]);
            }else {
                indices[idx] = i + 1;
            }
        }
        return maxLen;
    }
}
