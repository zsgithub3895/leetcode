package com.leetcode.array;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,0};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
	 public static int[] productExceptSelf(int[] nums) {
	        if(null==nums || nums.length==0){
	            return null;
	        }
	        int len = nums.length;
	        int multi = 1;
	        int exists = 0;
	        int count = 0;
	        
	        for(int i=0;i<len;i++){
	        	multi *=  nums[i];
	        	if(nums[i] == 0){
	        		exists = i;
	        		count++;
	        	}
	        }
	        if(count==1){
	        	int sum =1;
	        	for(int i=0;i<len;i++){
	        		if(exists==i){
	        			continue;
	        		}else{
	        			 sum *= nums[i];
	        			 nums[i]=0;
	        		}
	        	 }
	        	nums[exists] =sum;
	        	return nums;
	        }
	        if(count>=2){
	        	 for(int i=0;i<len;i++){
	        		 nums[i]=0;
	        	 }
	        	 return nums;
	        }
	        
	        for(int i=0;i<len;i++){
	        	nums[i] = multi/nums[i];
	        }
	        return nums;
	    }
}
