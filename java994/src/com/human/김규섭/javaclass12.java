package com.human.��Լ�;

public class javaclass12 {
	public static int total=0;//total�� ��� �������� ��� ���� 
	public static int add(int num1,int i) {
		int sum=num1+i;
		total=total+sum;
		return sum;
	}
	public static void main(String[] args) {
		
		int result=0;
		int num1=10;
		result=add(num1,30);
		System.out.println(result);
		System.out.println(javaclass12.total);
		result=add(num1,40);
		System.out.println(result);
		System.out.println(javaclass12.total);
		
		
		
		
	}
}
