package com.javaex.ex03;

public class ThreadApp{

	public static void main(String[] args) throws Exception {
		
		
		DigitRunnableImpl digit = new DigitRunnableImpl();
		Thread thread = new Thread(digit);
		
//		Thread thread = new Thread(new DigitRunnableImpl());
		thread.start();
		
		for(char ch = 'A'; ch <'Z'; ch++) {
				System.out.println(ch);
				Thread.sleep(1000);
		}
		
	}

		
}
	
