package com.imp.CompanyInterview.SmileCDR;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*1773. Count Items Matching a Rule*/

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String,Integer> ruleMap=new HashMap<>();
            ruleMap.put("type",0);
            ruleMap.put("Color",1);
            ruleMap.put("name",2);
            int counter=0;
            for(List<String> check:items){
                if(check.get(ruleMap.get(ruleKey)).equals(ruleValue)){
                    counter++;
                }
            }
            return counter;
    }
    public int countMatchesWithIf(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        if (ruleKey.equals("color")) type = 1;
        else if (ruleKey.equals("name")) type = 2;
        int res = 0;
        for (List<String> i : items) {
            if (i.get(type).equals(ruleValue)) res++;
        }
        return res;
    }
}
