package edu.learn.java;

import java.util.HashMap;
import java.util.Iterator;

public class StringDuplicate {

	public static void main(String[] args) {
		duplicate("I am am am the the the coder man man");
	}

    static void duplicate(String str) {
		HashMap<String,Integer> data = new HashMap<>();
		
		String [] ltr = str.split(" ");
		
		for(String s : ltr)
		{
			if(data.get(s) != null) {
				data.put(s, data.get(s)+1);
			}
			else {	
			data.put(s, 1);
		}}
		Iterator<String> tempString= data.keySet().iterator();
	while(tempString.hasNext()) {
		String temp = tempString.next();
		if(data.get(temp)>1) {
			System.out.println("String:"+temp+" is repeated "+data.get(temp));
		}
	}
	}
}
