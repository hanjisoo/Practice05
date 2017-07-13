package com.javaex.problem01;

public class Add {
	private int a;
	private int b;
	int calculate;

	public Add() {

	}

	public Add(String a, String b) {
		this.a = Integer.parseInt(a); // 스프링을 인트로 바꿔줌
		this.b = Integer.parseInt(b);
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calculate() {
		System.out.println(a + b);
	}

}
