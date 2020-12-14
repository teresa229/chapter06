package com.javaex.ex04;

public class ThreadApp{

	public static void main(String[] args){
		
		Thread thread1 = new Thread(new DigitRunnableImpl());
		Thread thread2 = new Thread(new DigitRunnableImpl());
		Thread thread3 = new Thread(new DigitRunnableImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

		
}
	
