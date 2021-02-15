package com.imp.CompanyInterview.SmileCDR.IndexWork;
/*
* Given an array nums,
* write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
* Input: [0,1,0,3,12], Output: [1,3,12,0,0]
* */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0,j=1;
        while (j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0)
            {
                j++;
            }
            else if(nums[i]!=0 && nums[j]==0||nums[i]!=0 && nums[j]!=0)
            {
                i++;
                j++;
            }

        }
    }
}
