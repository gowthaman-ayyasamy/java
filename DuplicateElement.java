package com.test;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
    	
    	
        int[] nums = {1, 3, 4, 2, 2};
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
        	
            if (!set.add(num)) {
                System.out.println("Duplicate: " + num);
                break;
            }
        }
        
    }
}