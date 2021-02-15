package com.imp;

import com.imp.ArrayD2.FlippingImage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FlippingImageTest {

    @Test
    void flipAndInvertImage() {
        FlippingImage sample=new FlippingImage();
        int [][] tmp=new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] actualResult=sample.flipAndInvertImage(tmp);
        int [][] expectedResult={{1,0,0},{0,1,0},{1,1,1}};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}