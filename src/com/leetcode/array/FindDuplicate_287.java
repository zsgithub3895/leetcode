package com.leetcode.array;

import java.util.BitSet;

public class FindDuplicate_287 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3};
		System.out.println(findDuplicate2(nums));
	}
	
	/**
	 * @param nums
	 * @return
	 * BitSet
	 */
	public static int findDuplicate(int[] nums) {
		BitSet bit =new BitSet();
		for(int i=0;i<nums.length;i++){
			if(bit.get(nums[i])){
				return nums[i];
			}
			bit.set(nums[i]);
		}
        return 0;
    }
	
	/**
	 * 指针：fast,slow
	 * @return
	 */
	public static int findDuplicate2(int[] nums) {
		int slow = nums[0];
		int fast = nums[nums[0]];
		while(slow != fast){// 找到快慢指针相遇的地方
			slow = nums[slow];
			fast = nums[nums[fast]];
		}
		int find =0;
		while(find != slow){//用一个新指针从头开始，直到和慢指针相遇
			slow = nums[slow];
			find = nums[find];
		}
		return find;
    }

}
