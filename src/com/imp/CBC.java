package com.imp;

public class CBC {
    public int solution(int[] A) {
        int [] s=new int[1000000];
        for(int i=0;i<A.length;i++){
            s[A[i]]++;
        }
        int result=0;
        for(int j=0;j<s.length;j++){
            if(s[j]==0)
            {result=j+1;
                break;}
        }
        return result;
    }
}
