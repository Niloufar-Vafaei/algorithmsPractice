package com.imp.CompanyInterview.SmileCDR.IndexWork;
/*
 * A string S of lowercase English letters is given. We want to partition
 *  this string into as many parts as possible so that each letter appears in at most one part,
 *  and return a list of integers representing the size of these parts.
 *Input: S = "ababcbacadefegdehijhklij",Output: [9,7,8]
 * Explanation:The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 *  */

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0){
            return null;
        }
        int[] lastIndex = new int[26];
        for (int i = 0; i < S.length(); i++) {
            lastIndex[S.charAt(i)-'a']=i;
        }
        List<Integer> result=new ArrayList<>();
        int end=0;
        int start=0;
        for (int i=0;i<S.length();i++){
             end=Math.max(end,lastIndex[S.charAt(i)-'a']);
            if(i==end){
                result.add(end-start+1);
                start=end+1;
            }

        }
        return result;
    }
}
