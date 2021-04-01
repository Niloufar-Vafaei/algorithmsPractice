package com.imp.CompanyInterview.SmileCDR;

import java.util.*;

/*350. Intersection of Two Arrays II*/
public class IntersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> base = new HashMap<>();
        for (int s : nums1) {
            base.put(s, base.getOrDefault(s, 0) + 1);
        }
        List<Integer> re = new ArrayList<>();
        for (int tmp : nums2) {
            if (base.containsKey(tmp) && base.get(tmp) > 0) {
                re.add(tmp);
                base.put(tmp, base.get(tmp) - 1);
            }
        }
        int[] arr = new int[re.size()];
        for (int i = 0; i < re.size(); i++) {
            arr[i] = re.get(i);
        }
        return arr;
    }
}
