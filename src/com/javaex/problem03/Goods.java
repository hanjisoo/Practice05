package com.javaex.problem03;

public class Goods {

    private String name;
    private int price;
    private int count;
    
    public Goods() {
    	
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = Integer.parseInt(price);
	}

	public int getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = Integer.parseInt(count);
	}
	public void showInfo() {
		System.out.println(name+"(가격:"+price+"원)이"+count+"개 입고 되었습니다.");
	}
    
}
