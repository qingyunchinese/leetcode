package com.leetcode.array;

import com.leetcode.array.sort.ArraySortUtil;

/**
 * 两数之和
 * 题目: https://leetcode-cn.com/problems/two-sum/
 */
public class ArrayTargetSum {
    public static void main(String[] args) {
        int[] array={3,2,4};
        int target=6;
        int[] resultArray=twoSum(array,target);
        ArrayUtil.printArray(resultArray);
    }

    public static int[] twoSum(int[] nums, int target){
         int leftP=0;
         int rightP=nums.length-1;
         while(leftP<rightP){
            ArraySortUtil.bubbleSort(nums);
            if(nums[leftP]+nums[rightP]==target){
                break;
            }else if(nums[leftP]+nums[rightP]<target){
                leftP++;
            }else if(nums[leftP]+nums[rightP]>target){
                rightP--;
            }
         }
         int[] resultArray=new int[2];
         resultArray[0]=leftP;
         resultArray[1]=rightP;
         return resultArray;
    }
}
