package com.human.±è±Ô¼·;

public class javaclass3 {
	public static Cat catFunc(Cat c) {
		Cat rValue=c;
		
		return rValue;
	}
	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.name="gol";
		cat1.age=10;
		Cat cat2;
		cat2=catFunc(cat1);

	
	}
	
}
