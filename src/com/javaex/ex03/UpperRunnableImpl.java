package com.javaex.ex03;

public class UpperRunnableImpl implements Runnable {
		
		public void run() {
			for(int ch = 'A'; ch <'z'; ch++) {
				try {
					Thread.sleep(1000);
					System.out.println(ch);
			}catch(InterruptedException e) {
					e.printStackTrace();
			}
		}

	}

}
