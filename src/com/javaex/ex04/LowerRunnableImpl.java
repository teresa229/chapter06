package com.javaex.ex04;

public class LowerRunnableImpl implements Runnable{

	public void run() {
		for(int ch = 'a'; ch <'z'; ch++) {
			try {
				Thread.sleep(1000);
				System.out.println(ch);
		}catch(InterruptedException e) {
				e.printStackTrace();
		}
	}

	}

}
