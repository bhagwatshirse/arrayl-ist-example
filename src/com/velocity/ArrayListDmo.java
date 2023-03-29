package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDmo {

	public static void main(String[] args) {
      ArrayList al= new ArrayList();
      al.add(1);
      al.add(2);
      al.add(3);
      al.add(4);
      al.add(5);
      System.out.println(al);
     // al.add("bhagwat");
     // al.add(null);
      //al.add(30);
      al.remove(1);
    // Iterator itr = al.iterator();
     //for(Object x: al) {
    	// System.out.println(x);
      
      System.out.println(al);
     }
	}

//}
