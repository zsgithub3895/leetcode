package code.algorithm;

import java.util.Arrays;

public class ClimbStairs {
    		 
	public static void main(String[] args) {
		//System.out.println(climbStairs(4));
		int[] nums = {0,0,0,1};
		System.out.println(dominantIndex(nums));
	}
	
	public static int climbStairs(int n) {
		 int first = 1;
		 int second = 2;
		 int curr = 0;
        for(int i=2;i<n;i++){
        	curr = first+second;
        	first=second;
        	second=curr;
        }
        return curr;
    }
	
	public static boolean isOneBitCharacter(int[] bits) {
        int i=bits.length-1;
        boolean one=true;
        i--;
        while (i>=0){
            if (bits[i]==1){
                one = !one;
            }else{
                return one;
            }
            i--;
        }
        return one;
    }
	
	
	public static boolean isOneBitCharacter2(int[] bits) {
        if(null == bits || bits.length==0) return false;
        int len = bits.length;
        int i=0;
        while(i<len){
            if(i==len-1) return true;
            if(bits[i]==1) i++;
            i++;
        }
        return false;
    }
	
	 public static int dominantIndex(int[] nums) {
	        if(null == nums || nums.length==0) return 0;
	        if(nums.length==1) return nums[0];
	        int len = nums.length - 1;
	        boolean flag = false;
	        int[] copyArr = nums.clone();
	        Arrays.sort(copyArr);
	        if(copyArr[len] >= copyArr[len-1]*2){
	        	flag = true;
	        }
	        if(flag){
	        	for(int i=0;i<=len;i++){
	        		System.out.println(nums[i]+"|"+copyArr[len]);
	        		if(nums[i]==copyArr[len]){
	        			return i;
	        		}
	        	}
	        }
	       return 0;
	    }

}
