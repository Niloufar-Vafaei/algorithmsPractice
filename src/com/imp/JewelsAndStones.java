package com.imp;

import java.util.HashMap;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {

        HashMap<Character, Integer> ItrateStone = new HashMap<>();

        for (char c : S.toCharArray()) {
            ItrateStone.put(c, ItrateStone.getOrDefault(c, 0) + 1);
        }
        Integer counter = 0;
        for (char j : J.toCharArray()) {
//            if(ItrateStone.containsKey(j)){
//                counter+=ItrateStone.get(j);
//            }
            counter += ItrateStone.getOrDefault(j, 0);

        }
        return counter;
    }
}
