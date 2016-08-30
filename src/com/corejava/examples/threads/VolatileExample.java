package com.corejava.examples.threads;

public class VolatileExample {

	public static void main(String args[]) {
		SharedResource sharedResource = new SharedResource();
		MyRunnable threadOne = new MyRunnable(sharedResource);
		MyRunnable threadTwo = new MyRunnable(sharedResource);
		MyRunnable threadThree = new MyRunnable(sharedResource);
		new Thread(threadOne).start();
		new Thread(threadTwo).start();
		new Thread(threadThree).start();

	}
}

class MyRunnable implements Runnable {
	SharedResource sharedResource;

	MyRunnable(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	public void run() {
		while (true) {
			try {
				sharedResource.resource+=1;
				System.out.println(Thread.currentThread().getName() + " : " + sharedResource.resource);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class SharedResource {
	static volatile int resource = 0;
}