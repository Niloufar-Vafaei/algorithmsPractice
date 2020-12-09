package com.imp;

public class DesignParkingSystem {
    int[] count;
    public DesignParkingSystem(int big, int medium, int small) {
        count = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }
}


