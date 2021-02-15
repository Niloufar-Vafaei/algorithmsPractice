package com.imp.Numbers;

public class arrayTest {
    public int[] changeNumber(int[] nums){
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[counter++]=nums[i];
            }}
            while(counter<nums.length){
                nums[counter++]=0;
            }
        return nums;
    }
}
