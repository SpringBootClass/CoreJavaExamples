package com.corejava.examples.threads;

public class DifferentWaysThreads {
	public static void main(String args[]) {
		MyThreadExtends myThreadExtends = new MyThreadExtends();

		MyRunnableImplements myRunnableImplements = new MyRunnableImplements();
		Thread MyRunnableThread = new Thread(myRunnableImplements);
		MyRunnableThread.setPriority(Thread.MAX_PRIORITY);

		myThreadExtends.start();
		MyRunnableThread.start();
	}
}

class MyThreadExtends extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("MyThread run method iteration :" + i + " time(s)");
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class MyRunnableImplements implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("MyRunnableImplements run method :" + i + " time(s)");
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}