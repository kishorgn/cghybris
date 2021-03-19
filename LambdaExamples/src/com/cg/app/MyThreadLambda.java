package com.cg.app;

public class MyThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = () -> body();
		
		Thread t1 = new Thread(r1);
		t1.start();

	}
	
	public static void body(){
		System.out.println("Inside of a thread");
		System.out.println("Another statement by the thread");
	}

}
