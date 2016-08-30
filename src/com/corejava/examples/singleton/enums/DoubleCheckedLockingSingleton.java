package com.corejava.examples.singleton.enums;


public class DoubleCheckedLockingSingleton{
    private static volatile DoubleCheckedLockingSingleton INSTANCE;
 
    private DoubleCheckedLockingSingleton(){}
 
    public static DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
           synchronized(DoubleCheckedLockingSingleton.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new DoubleCheckedLockingSingleton();
               }
           }
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
    	DoubleCheckedLockingSingleton checkedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
	}
}

//Read more: http://javarevisited.blogspot.com/2012/07/why-enum-singleton-are-better-in-java.html#ixzz4Ing1Bg4l