package com.human.��Լ�;

public class �Լ��͸޼ҵ� {
	//�޼ҵ��� ���� ������ �޼ҵ尡 ����Ǹ� ���ÿ� �ö󰣴�.
	//�޼ҵ尣 ���������� ���������ʴ´�.
	//�޼ҵ尡 ����Ǹ� �޸𸮿��� �������.
	//�ڵ���� ���������� �ڵ����� ����Ǹ� �������.
	
	public static int sum(int a,int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	public static int min(int a,int b) {
		int min=0;
		min=a-b;
		return min;
	}
	public static int mul(int a,int b) {
		int mul=0;
		mul=a*b;
		return mul;
	}
	public static int div(int a,int b) {
		int div=0;
		div=a/b;
		return div;
	}
	public static void hello() {
		System.out.println("�ȳ��ϼ���");
	}
//	public static int aPlus(int a,int b) {
//		int aPlus=0;
//		if(a<b) {
//			for(int i=a;i<b;i++) {
//				aPlus=aPlus+i;
//			}
//		}else if (a>b) {
//			for(int i=b;i<a;i++) {
//				aPlus=aPlus+i;
//			}
//		}
//		return aPlus;
//	}
	public static int sumAll (int a,int b) {
		int sum=0;
		if(a>b) {int temp; temp=a; a=b; b=temp; }
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
//		int a=sum(1,2);
//		int b=a+sum(2,2);
//		System.out.println(a+b);
//		
//		int a1=min(1,2);
//		int b1=a+min(2,2);
//		System.out.println(a1+b1);
//
//		int a2=mul(1,2);
//		int b2=a+mul(2,2);
//		System.out.println(a2+b2);
//
//		int a3=div(1,2);
//		int b3=a+div(2,2);
//		System.out.println(a3+b3);

		
//		int aPlus=aPlus(5,2);
		int a=10,b=12;
		
		System.out.println(sumAll(a,b));
		System.out.println(sumAll(12,5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
