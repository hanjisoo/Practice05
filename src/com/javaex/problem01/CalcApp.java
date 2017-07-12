package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	while(true) {
    		
    		System.out.print(">>");
    		String str=sc.nextLine();
    		String [] s=str.split(" ");
    		
    		if(s[0].equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}else if(s[1].equals("&")){
    			System.out.println("알 수 없는 연산입니다.");
    		}else if(s[1].equals("+")) {
    			Add c=new Add(s[0],s[2]);
    			System.out.println(c.getA()+c.getB());
    			c.calculate();
    			//Add(s[0],s[2]);
    		}else if(s[1].equals("-")) {
    			
    		}
    		
    		System.out.println();
    	}
    	
    }
}
