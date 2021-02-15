package com.imp.CompanyInterview.CAPCO;

public class UniqueFirstWord {
    private int i;

    private UniqueFirstWord(int i) {
        this.i = i;
    }

    public static UniqueFirstWord create(int i) {
        return new UniqueFirstWord(i);
    }

    public int getI() {
        return i;
    }


}
