package com.javaex.ex02;

public class ThreadApp {
	
	public static void main(String[] args) throws Exception {

	//준비
	Thread thread1 = new DigitThread(); //섞어쓰기
	Thread thread2 = new LowThread();
	Thread thread3 = new UpperThread();
	
	//스레드 실행 -> 출장
	thread1.start(); //Aa0b1B2cCdD3e4EFf5gG67Hh8Ii9JjKkLlMmnNOopPqQRrSsTtUuVvWwXxYyZz
	thread2.start();
	thread3.start();
	
	//비교해보기
	/*
	thread1.run(); //0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
	thread2.run();
	thread3.run();
	*/

	
	}
}
