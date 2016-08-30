package com.corejava.examples.singleton.enums;

public class InnerClassSingleton {
	private static class Singleton {
        private Singleton() {
        }

        private static class SingletonHolder {
            private static Singleton sessionData = new Singleton();
        }

        public static Singleton getInstance() {
            return InnerClassSingleton.Singleton.SingletonHolder.sessionData;
        }
    }

    public void method1() {
        Singleton.getInstance();
    }
    
    public static void main(String args[]){
    	Singleton.getInstance();
    }
}
