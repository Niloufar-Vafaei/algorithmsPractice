package com.imp;

import static java.lang.Math.abs;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int secends = 0;
        for (int i = 0; i < points.length-1; i++) {
            int startX = points[i][0];
            int startY = points[i][1];
            int endX = points[i+1][0];
            int endY = points[i+1][1];
            int diffX = abs(startX - endX);
            int diffY = abs(startY - endY);
            if (diffX < diffY)
                secends += diffY;
            else
                secends += diffX;

        }
        return secends;
    }
}
