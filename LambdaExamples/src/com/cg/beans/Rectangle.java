package com.cg.beans;

public class Rectangle <T extends Number> {
	T len;
	T bre;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(T len, T bre) {
		super();
		this.len = len;
		this.bre = bre;
	}
	public T getLen() {
		return len;
	}
	public void setLen(T len) {
		this.len = len;
	}
	public T getBre() {
		return bre;
	}
	public void setBre(T bre) {
		this.bre = bre;
	}
	@Override
	public String toString() {
		return "Rectangle [len=" + len + ", bre=" + bre + "]";
	}
	
}
