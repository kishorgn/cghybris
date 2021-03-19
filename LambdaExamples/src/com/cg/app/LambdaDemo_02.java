package com.cg.app;

import com.cg.beans.Calculator;
import com.cg.beans.Con;

public class LambdaDemo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = (int x, int y) -> x+y;
		Calculator c2 = (x, y) -> x-y;  // Automatic type inference
		
//		System.out.println(c1.process(5, 8));
//		test(c2);
		
		// ( and ) are not require when the SAM of functional interface have only
		// single parameter
		Con con = System.out::println;
		
		/*
		Con con = new Con() {
			
			@Override
			public void show(String str) {
				// TODO Auto-generated method stub
				System.out.println(str);
			}
		};*/
		
		
		con.show(c2.process(10, 2)+"");

	}
	
	public static void test(Calculator calc){
		System.out.println(calc.process(5, 3));
	}

}
