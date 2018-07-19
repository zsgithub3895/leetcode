package com.leetcode.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome125 {

	public static void main(String[] args) {
		 Integer i1 = 128;  // 装箱，相当于 Integer.valueOf(128);
		 Integer.valueOf(128);
	        int t = i1; //相当于 i1.intValue() 拆箱
	        i1.intValue();
	        System.out.println(firstUniqChar("loo"));
	}
	
	 public static int firstUniqChar(String s) {
         Map<Character,Integer> map = new HashMap<Character,Integer>();
         int len = s.length();
         for(int i=0;i < len;i++){
        	 Integer in = map.get(s.charAt(i));
        	 int count=0;
        	 if(null==in){
        		 map.put(s.charAt(i), 1);
        	 }else{
        		 count = in+1;
        		 map.put(s.charAt(i), count);
        	 }
         }
         Set<Entry<Character, Integer>> set = map.entrySet();
         Iterator it =set.iterator();
         while(it.hasNext()){
        	 System.out.println(it.next());
        	 //Character c = (Character) it.next();
         }
         return 0;
	    }
	
	public static boolean isPalindrome(String s) {
//        Pattern p = Pattern.compile("[0-9a-zA-Z]");
//        Matcher m = p.matcher(s);
//        StringBuilder sb = new StringBuilder();
//        while (m.find()) {
//        	sb.append(m.group(0));    
//        }
//        String res0 = sb.toString();
//        String res = sb.reverse().toString();
//        return res0.equalsIgnoreCase(res);
		int i=0;
		int j=s.length()-1;
		String ss = s.toLowerCase();
		while(i<j){
			char a = ss.charAt(i);
			char b = ss.charAt(j);
			if(Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)){
				if(a==b){
					i++;
					j--;
				}else{
					return false;
				}
			}else if(!Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)){
				i++;
			}else if(Character.isLetterOrDigit(a) && !Character.isLetterOrDigit(b)){
				j--;
			}else{
				i++;
				j--;
			}
		}
		return true;
    }

}
