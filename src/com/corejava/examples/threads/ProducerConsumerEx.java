package com.corejava.examples.threads;

import java.util.Date;
import java.util.Vector;

public class ProducerConsumerEx {

	public static void main(String[] args) {
		
		ProducerConsumer producerConsumer = new ProducerConsumer();
		ProducerThread producerThread = new ProducerThread(producerConsumer);
		ConsumerThread consumerThread = new ConsumerThread(producerConsumer);
		new Thread(producerThread).start();
		new Thread(consumerThread).start();
	
	}

}

class ProducerConsumer {
	private final static int MAX_QUEUE=5;
	private Vector<String> messages = new Vector<>();
	
	public synchronized void produce() throws InterruptedException{
		while(true){
			if(messages.size()== MAX_QUEUE){
				wait();
			}
			String message = (new Date()).toString();
			messages.addElement(message);
			System.out.println("Message is produced :"+message);
			notify();
		}
	}
	
	public synchronized void consume() throws InterruptedException{
		notify();
		while(true){
			if(messages.size()== 0)
				wait();
			String message = (String) messages.firstElement();
	        messages.removeElement(message);
	        System.out.println("Message is consumed :"+message);
		}
	}
}

class ProducerThread implements Runnable{
	ProducerConsumer producerConsumer;
	ProducerThread(ProducerConsumer producerConsumer){
		this.producerConsumer=producerConsumer;
	}
	
	@Override
	public void run() {
		try {
            while (true) {
            	producerConsumer.produce();
                //sleep(5000);
            }
        } catch (InterruptedException e) {
        }
	}
	
}

class ConsumerThread implements Runnable{
	ProducerConsumer producerConsumer;
	
	ConsumerThread(ProducerConsumer producerConsumer){
		this.producerConsumer=producerConsumer;
	}
	
	@Override
	public void run() {
		try {
            while (true) {
            	producerConsumer.consume();
                //sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}