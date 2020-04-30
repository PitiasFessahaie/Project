package edu.learn.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Emailselect {

	public static void main(String[] args) {
		select("the correct email is selmaptsegu@gmail.com others include star@mac jhon@loc ");

	}

	private static void select(String email) {
		List<String> data = new ArrayList<String>();

		String[] ltr = email.split(" ");
		for (String s : ltr) {
			if (s.contains("@")) {
				data.add(s);
			}
		}
		Iterator<String> lab = data.iterator();
		while (lab.hasNext()) {
			String k = lab.next();
			if (k.contains(".com")) {
				System.out.println("The correct email is : " + k);
			} else {
				System.out.println("This are the fake emails is :" + k);
			}
		}
	}
}