package com.human.��Լ�;
import java.util.*;
public class javaclass7 {
	public static double area(double a) {
		double sum=0;
		
		sum=a*a*3.14;
		return sum;
	}
	
	public static double area(double a,double b) {
		double sum=0;
		sum=a*b/2;		
		return sum;
	}
	
	public static int area(int a,int b) {
		int sum=0;
		sum=a*b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("����ϱ⸦ ���ϴ� ������ �������ּ��� 1.���� 2.�ﰢ�� 3.���簢�� ");
		String a=sc.nextLine();
		switch(a) {
		case "1":
			System.out.println("�������� �Է����ּ���");
		double won=Double.parseDouble(sc.nextLine());
			System.out.println(area(won));
			break;
		case "2":
			System.out.println("���̿� �غ��� ���̸� �Է����ּ���");
			int sam=Integer.parseInt(sc.nextLine());
			int gak=Integer.parseInt(sc.nextLine());
				System.out.println(area(sam,gak));
			break;
		
		case "3":
			System.out.println("���ο� ������ ���̸� �Է����ּ���");
			double sa=Double.parseDouble(sc.nextLine());
			gak=Integer.parseInt(sc.nextLine());
				System.out.println(area(sa,gak));
			break;
		}
		
		
		
		
		
	}
}
