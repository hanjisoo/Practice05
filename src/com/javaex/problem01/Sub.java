package com.javaex.problem01;

public class Sub {
	private int a;
	private int b;
	int culculate;

	public Sub() {
		
	}
	public Sub(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
	}
		
	public void claculate() {
		System.out.println(a-b);
	}
	
	
	
	
	
}
