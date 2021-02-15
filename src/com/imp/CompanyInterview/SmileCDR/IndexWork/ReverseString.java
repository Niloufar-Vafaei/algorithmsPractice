package com.imp.CompanyInterview.SmileCDR.IndexWork;

public class ReverseString {
    public void reverseString(char[] s) {
        char tmp;
        int i=0;
        int j=s.length;
        while(i<j){
            tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }
    }
}
