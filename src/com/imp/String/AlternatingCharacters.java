package com.imp.String;

public class AlternatingCharacters {
    //given the string s=AABAAB, remove  anA  at positions 0 and 3 to make s=ABAB in 2 deletions.
    public int numberDeletion(String s) {

        int[] indices = new int[27];
        int count = -1;
        for (int i = 0; i < s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            if (indices[idx] > 2) {
                count++;
                indices[idx]=0;
            }else
                indices[idx]++;
        }
        return count;
    }
}
