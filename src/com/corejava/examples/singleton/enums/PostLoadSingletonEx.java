package com.corejava.examples.singleton.enums;

public class PostLoadSingletonEx {
	public static void main(String args[]) {
		PostLoadSingleton postLoadSingleton = PostLoadSingleton.getInstance();
	}
}

class PostLoadSingleton {

	private static PostLoadSingleton postLoadSingleton;

	private PostLoadSingleton() {
	}

	public static PostLoadSingleton getInstance() {
		if (postLoadSingleton == null)
			postLoadSingleton = new PostLoadSingleton();
		return postLoadSingleton;
	}

}