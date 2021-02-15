package com.imp.CompanyInterview.SmileCDR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*49. Group Anagrams
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *  typically using all the original letters exactly once.
 * */

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> finalresult = new ArrayList<>();
        if (strs.length == 1) {
            List<String> list=new ArrayList<String>(Arrays.asList(strs));
            finalresult.add(list);
            return finalresult;
        }

        int[] ascciInput = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            for (char t : strs[i].toCharArray()) {
                //System.out.print(","+(t - 'a'));
                if (t - 'a' == 0)
                    ascciInput[i] += -1;
                else
                    ascciInput[i] += t - 'a';
            }
            //System.out.println("asci: "+ascciInput[i]);
        }
        ArrayList<String>[] result = new ArrayList[3000];

        for (int m = 0; m < ascciInput.length; m++) {
            if (result[ascciInput[m]] == null)
                result[ascciInput[m]] = new ArrayList<>();

            result[ascciInput[m]].add(strs[m]);
        }

        for (List<String> f : result) {
            if (f != null) {
                finalresult.add(f);
            }
        }
        return finalresult;
    }
}
