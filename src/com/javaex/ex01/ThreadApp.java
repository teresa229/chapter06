package com.javaex.ex01;

public class ThreadApp {
	
	public static void main(String[] args) throws Exception {

	//준비
	Thread thread = new DigitThread(); //섞어쓰기
	
	//스레드 실행 -> 출장
	//thread.run(); //실행되지 않는다.
	thread.start(); //시작하라는 명령
	
	for(char ch = 'a'; ch<='z'; ch++) {
		System.out.print(ch);
		Thread.sleep(1000);  //실행이 천천히 되도록 하는 공식. 외워라.
		
	}
	
	//스레드 방식
	//시작
	//스레드 시작
	//스레드 끝
	
	}
}
