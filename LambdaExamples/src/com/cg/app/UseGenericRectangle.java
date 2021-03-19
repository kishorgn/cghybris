package com.cg.app;

import com.cg.beans.Rectangle;

public class UseGenericRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle<Integer> r1 = new Rectangle<Integer>();
		Rectangle<Double> r2 = new Rectangle<>();
		
		r1.setLen(8);
		r1.setBre(6);
		
		r2.setLen(8.5);
		r2.setBre(6.3);
		
		System.out.println("r1 area : " + r1.getLen() * r1.getBre());
		
		System.out.println("r2 area : " + r2.getLen() * r2.getBre());

	}

}
