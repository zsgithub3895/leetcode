package com.leetcode.string;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
			System.out.println("lee".indexOf("le"));
			String[] s = {"qleet","lee"};
			System.out.println(longestCommonPrefix(s));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
			return "";

		String pre = strs[0];
		for (int i = 1; i < strs.length; i++) {
			    if(pre.length() == 0 || strs[i].length() == 0){
			    	return "";
			    }
                while(strs[i].indexOf(pre) != 0){
                	pre = pre.substring(0,pre.length()-1);
                }
		}
		return pre;
    }
}
