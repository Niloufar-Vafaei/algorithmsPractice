package com.imp.ArrayD2;
/*
Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 */
public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int[] row : A)
            for (int i = 0; i * 2 < n; i++)
                if (row[i] == row[n - i - 1])
                    row[i] = row[n - i - 1] ^= 1;
        return A;
    }
}
