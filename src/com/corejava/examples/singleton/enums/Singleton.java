package com.corejava.examples.singleton.enums;

public enum Singleton {
	INSTANCE;
	 public static Singleton getInstance(){
	      return Singleton.INSTANCE;
	 }
}
