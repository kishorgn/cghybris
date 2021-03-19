package com.cg.app;

import com.cg.beans.RunnableImpl_01;

public class MyThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = () -> runMethod();
		
		Thread t1 = new Thread(runnable);
		t1.start();
		System.out.println("Inside of main thread");

	}
	
	static void runMethod() {
		System.out.println("Inside of Runnable impl, (anonymous inner class)");
		System.out.println("Another statement in runnable impl");
	}
	
	public static class RunnableImpl_02 implements Runnable{
		public void run() {
			System.out.println("Inside of Runnable impl (inner class)");
		}
	}

}
