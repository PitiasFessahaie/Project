package edu.learn.java;

import java.util.HashMap;
import java.util.Map;

public class MultiplierCheck {
	public static void main(String[] args) {
		int target = 7;
		int [] list = {2,3,7,4,8};
		int [] result = check (target, list);
		System.out.println(result[0]+" "+ result[1]);
	}

	private static int[] check(int target, int[] list) {
		
		Map<Integer,Integer> visited = new HashMap<>();
		for(int i=0;i<list.length;i++) {
			int delta = target - list[i];
			
			
			
			visited.put(list[i],i);
			
			
			if(visited.containsKey(delta)) {
				return new int [] {i,visited.get(delta)};
				
			} 
		}
		return new int [] {-1,-1};
	}

	

}
