package com.corejava.examples.singleton.enums;

public class PreloadSingletonEx {
	
	public static void main(String args[]){
		PreloadSingleton preloadSingleton = PreloadSingleton.getInstance();
	}
	
}

class PreloadSingleton{
	
	private static PreloadSingleton preloadSingleton = new PreloadSingleton();
	
	private PreloadSingleton(){}
	
	public static PreloadSingleton getInstance(){ return preloadSingleton;}
	
}