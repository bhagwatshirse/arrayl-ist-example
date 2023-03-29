package com.velocity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GetName {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		System.out.println(nameList.size());
		nameList.add("bhagwat");
		nameList.add("gopal");
		nameList.add("ram");
		nameList.add("vikas");
		nameList.add("avinash");
		System.out.println(nameList.size());
		
		System.out.println(nameList.get(4));
		System.out.println(nameList);
		nameList.add(4, "nakul");
		System.out.println(nameList);
		System.out.println(nameList.get(5));
		System.out.println(nameList.size()-1);
		nameList.remove(3);
		System.out.println(nameList);
		//nameList.clear();
		System.out.println(nameList);
		Iterator<String> itr = nameList.iterator();
		
		for(String i:nameList) {
			System.out.println(i);
		}
	}

}
