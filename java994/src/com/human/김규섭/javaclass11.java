package com.human.김규섭;

public class javaclass11 {
	//전역변수,static변수, 클래스 변수, 
	public static int total=0;
	public static void main(String[] args) {
		System.out.println(total);
		System.out.println(javaclass11.total);
		int i=0;
		{
			total=10;
			int i1=0;
		}
		if(true) {
			int i2=10;
			System.out.println(total);
		}
		for(int j=0;j<11;j++) {
			int i3=10;
			i++;
			
		}
		
		
		
		
	}
}
