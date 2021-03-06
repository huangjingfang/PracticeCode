package jlan.lab.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class AddTwoTest implements Runnable {
	ReentrantLock lock = new ReentrantLock();
	int count = 0;
	private AtomicInteger atomicCount = new AtomicInteger(0);
	private Semaphore semaphore = new Semaphore(1);
	
	public static void main(String[] args) {
		AddTwoTest test = new AddTwoTest();
		for(int i=0;i<10;i++) {
			new Thread(test).start();
		}
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++) {
//			int value = addTwo();
//			int value = addTwoSync();
//			int value = addTwoWithLock();
			int value = addTwoWithSemaphore();
			if(value%2!=0) {
				System.out.println(Thread.currentThread().getId()+":\t"+value);
			}
			
		}
	}
	
	private int addTwo() {
		count++;
		count++;
		return count;
	}
	
	public synchronized int addTwoSync() {
		count++;
		count++;
		return count;
	}
	
	public int addTwoWithLock() {
		lock.lock();
		int value = addTwo();
		lock.unlock();
		return value;
	}
	
	public int addTwoWithSemaphore() {
		try {
			semaphore.acquire();
			int value = addTwo();
			semaphore.release();
			return value;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return count;
		}
		
	}
}
