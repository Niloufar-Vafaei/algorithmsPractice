package com.imp;
/*859. Buddy Strings*/

import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {
    public boolean buddyStrings(String a, String b) {
        Map<Character, Integer> scale = new HashMap<>();
        for (char c : a.toCharArray()) {
            scale.put(c, scale.getOrDefault(c, 0) + 1);
        }
        for (char s : b.toCharArray()) {
            if (!scale.containsKey(s)) return false;
            else {
                scale.put(s, scale.get(s) - 1);
            }
        }
        return scale.isEmpty();
    }


    public void testCmic() {


    }
}
