package com.human.��Լ�;

public class javaclass6 {
	public static int funcAll(int a,int b) {
		System.out.println("int + int");
		return (a+b);
	}

	public static int funcAll(double a, double b) {
		System.out.println("double + double");
		return (int)(a+b);
	}

	public static void funcAll(String a, String b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		int sum=funcAll(10,12);
		System.out.println(sum);
		double d=10.0;
		System.out.println(funcAll(d,sum));
		String str="�ȳ�";
		String str2="�ϼ���";
		funcAll(str,str2);
		
	}
}
