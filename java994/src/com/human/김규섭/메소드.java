package com.human.김규섭;

public class 메소드 {
	public static int intFunc(int a) {
	int i=0; 
	i=a+1;
	return i;
	}
	public static double doubleFunc(double a) {
		double i=0;
		i=a+1;
		return i;
	}
	
	public static void main(String[] args) {
//		 , stringFunc, catFunc, intArrFunc, catObjectFunc
// 		1. 매개변수와 리턴값이 int
		int i=0;
		i=intFunc(i);
		System.out.println(i);		
		

	}

}
