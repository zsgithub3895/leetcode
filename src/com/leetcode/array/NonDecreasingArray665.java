package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDecreasingArray665 {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,1};
		System.out.println(findShortestSubArray(nums));
	}
/*这个题目关键在于，当遇见一个 nums[i] > nums[i+1] 的情况，我们是把 nums[i]降为nums[i+1] 还是 把nums[i+1]升为nums[i]。

	　　如果可行的话，当然是选择优先把 nums[i]降为nums[i+1]，这样可以减少 nums[i+1] > nums[i+2] 的风险。

	　　来看一下两种情况：

	　　a. 1 3 5 4 6 7  -->  1 3 4 4 6 7

	　　　　当遇到5 > 4 的情况，这里因为4比5 之前的所有数字都大，所以可以把5 降为4。

	　　b. 1 4 5 3 6 7  -->  1 4 5 5 6 7*/
	public static boolean checkPossibility(int[] nums) {		
	       if (nums == null || nums.length <= 1) return true;
	       int len = nums.length;	
	       boolean modify = false;
	       for (int i = 0; i < len-1; i++) {
	    	   if(nums[i]>nums[i+1]){
					if(modify){
						return false;
					}else{
						if(i>0 && nums[i-1]>nums[i+1]){
							nums[i+1] = nums[i];
						}else{
							nums[i] = nums[i+1];
						}
						modify = true;
					}
	    	   }
			}
	       System.out.println(Arrays.toString(nums));
		   return true;
	    }
	
		public static int findShortestSubArray(int[] nums) {
			int[] numsCopy = nums.clone();
	        Arrays.sort(numsCopy);
	        int len = numsCopy.length;
	        int max = 0 ;
	        int temp=0;
	        if(nums.length==1) return 1;
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0;i<len-1;i++){
	        	if(numsCopy[i]==numsCopy[i+1]){
	        		temp++;
	        	}else{
	        		if(temp >= max){
	        			max = temp;
	        			temp = 0;
	        		}
	        	}
	        }
	        
	        if(temp >= max){
	        	list.add(numsCopy[len-1]);	        	
	        }
	        temp=0;
	        System.out.println(max);
	        for(int i=0;i<len-1;i++){
	        	if(numsCopy[i]==numsCopy[i+1]){
	        		temp++;
	        	}
        		if(temp == max){
        			temp = 0;
        			list.add(numsCopy[i]);
        		}
	        }
	        
	        System.out.println(Arrays.asList(list));
	        
	        int lenM = Integer.MAX_VALUE;
	        for(Integer ii:list){
	        	int min = Integer.MAX_VALUE;
		        int max2 = Integer.MIN_VALUE;
	        	 for(int i=0;i<len;i++){
	 	        	if(nums[i] == ii){
	 	        		if(i<min){
	 	        			min = i;
	 	        		}
	 	        		if(i>max2){
	 	        			max2 = i;
	 	        		}
	 	        	}
	 	        }
	        	 int ll = max2-min+1;
	        	 System.out.println(ll);
	        	 if(ll < lenM){
	        		 lenM = ll;
	        	 }
	        }
	        return lenM;
	    }
}
