package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet_380 {
	List<Integer> list = new ArrayList<Integer>();
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	public static void main(String[] args) {

	}
	
	public RandomizedSet_380() {
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(map.containsKey(val)){
    		return false;
    	}
    	map.put(val, map.size());
    	list.add(val);
    	return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(map.containsKey(val)){
    		map.remove(val);
    		list.remove(val);
    		return true;
    	}
    	return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	int len = list.size();
    	Random ran = new Random(len);
    	int index = ran.nextInt(len);
    	return list.get(index);
    }

}
