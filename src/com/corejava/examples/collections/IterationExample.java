package com.corejava.examples.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterationExample {
	public static void main(String args[]){
		
		Set<String>  set  = new HashSet<>();
		List<String> list = new ArrayList<>();

		set.add("SETONE");
		set.add("SETTWO");
		set.add("SETTHREE");
		set.add("SETFOUR");
		set.add("SETFIVE");
		
		list.add("LISTONE");
		list.add("LISTTWO");
		list.add("LISTTHREE");
		list.add("LISTFOUR");
		list.add("LISTFIVE");
		
		MyCollectionUtil.doSomething(set);
		MyCollectionUtil.doSomething(list); 
	}
}


class MyCollectionUtil {
	public static void doSomething(Collection<String> collection) {
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
	}
}