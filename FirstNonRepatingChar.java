package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepatingChar {
	
    public static void main(String[] args) {
        String str = "testing";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
        	
            map.put(c, map.getOrDefault(c, 0) + 1);
            
        }

        for (char c : map.keySet()) {
        	
            if (map.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                break;
            }
        }
    }
}
