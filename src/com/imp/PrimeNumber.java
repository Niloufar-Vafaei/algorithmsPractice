package com.imp;

public class PrimeNumber {
    public boolean isPrime(int num) {
        int flag=0;
        for (int i = 2; i < num / 2; i++) {
            if(num==0||num==1) flag=-1;
            if(num%i==0){
                flag=-1;
                break;
            }
        }
        if(flag==0) return true;
        else return false;
    }
}
