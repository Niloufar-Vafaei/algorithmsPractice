package com.imp;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> report = new ArrayList<>();
        for (int i = 0; i < candies.length; ++i) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int j = 0; j < candies.length; ++j) {
            if (extraCandies + candies[j]>=max) {
                report.add(true);
            } else
                report.add(false);
        }
        return report;

    }
}
