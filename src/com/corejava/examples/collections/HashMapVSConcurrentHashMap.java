package com.corejava.examples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVSConcurrentHashMap {
	public static void main(String args[]){
		
		HashMap<String,String> hashMap=new HashMap<>();
		hashMap.put("0", "ZERO");
		hashMap.put("1", "ONE");
		hashMap.put("2", "TWO");
		hashMap.put("3", "THREE");
		hashMap.put("4", "FOUR");
		hashMap.put("5", "FIVE");
		hashMap.put("6", "SIX");
		hashMap.put("7", "SEVEN");
		hashMap.put("8", "EIGHT");
		hashMap.put("9", "NINE");
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("0", "ZERO");
		concurrentHashMap.put("1", "ONE");
		concurrentHashMap.put("2", "TWO");
		concurrentHashMap.put("3", "THREE");
		concurrentHashMap.put("4", "FOUR");
		concurrentHashMap.put("5", "FIVE");
		concurrentHashMap.put("6", "SIX");
		concurrentHashMap.put("7", "SEVEN");
		concurrentHashMap.put("8", "EIGHT");
		concurrentHashMap.put("9", "NINE");
		
		MyRunnable myRunnable1= new MyRunnable(hashMap);
		new Thread(myRunnable1).start();
		
		MyRunnable myRunnable2= new MyRunnable(hashMap);
		new Thread(myRunnable2).start();
		
		
		
	}
}

class MyRunnable implements Runnable{
	Map<String,String> map;
	
	MyRunnable(Map<String,String> map){
		this.map=map;
	}

	@Override
	public void run() {
		Set<String> keySet=map.keySet();
		keySet.forEach(key->map.remove(key));
	}
}