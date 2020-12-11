package com.javaex.ex02;

public class UpperThread extends Thread{
	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	@Override
	public void run() {
		for(char ch = 'A'; ch<='Z'; ch++) {
				System.out.print(ch);
				try {
						Thread.sleep(1000);
				}catch(InterruptedException e) {
						e.printStackTrace();
				}
		}
	}
}