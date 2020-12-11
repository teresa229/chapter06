package com.javaex.ex02;

public class LowThread extends Thread{

	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	@Override
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch);
			try {
					Thread.sleep(1000);
			}catch(InterruptedException e) {
					e.printStackTrace();
			}
		}
	
	}
	
}
