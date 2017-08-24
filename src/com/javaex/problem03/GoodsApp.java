package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		List<Goods> goods = new ArrayList<Goods>();
		Scanner sc=new Scanner(System.in);
		System.out.println("상품 3개를 입력해주세요");
		
		for(int i=0; i<3; i++) {
			String line=sc.nextLine();
			String[] data=line.split(" ");
			
			Goods good=new Goods();
			good.setName(data[0]);
			good.setPrice(data[1]);
			good.setCount(data[2]);
			goods.add(good);
			
		}
		

		for(int i=0; i<goods.size(); i++) {
			goods.get(i).showInfo();
		}
		sc.close();
	}

}
