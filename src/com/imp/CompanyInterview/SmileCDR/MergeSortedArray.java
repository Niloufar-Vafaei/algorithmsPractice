package com.imp.CompanyInterview.SmileCDR;
/*88. Merge Sorted Array*/
/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has a size equal to m + n such that it has enough space
 *  to hold additional elements from nums2.*/
/*
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 */


public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result=new int[m+n];
        int j=0,i=0,c=0;

        while(c<m+n){
            if(i==m){
                result[c]=nums2[j];
                j++;
                c++;
            }else{
                if(nums1[i]<nums2[j]){
                    result[c]=nums1[i];
                    i++;
                    c++;

                }
                else if(nums1[i]>nums2[j]){
                    result[c]=nums2[j];
                    j++;
                    c++;
                }
                else {
                    result[c]=nums1[i];
                    result[c+1]=nums2[j];
                    c=c+2;
                    i++;
                    j++;
                }
            }
        }
        nums1=result;
    }
}
