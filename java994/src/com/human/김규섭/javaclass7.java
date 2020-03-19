package com.human.김규섭;
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
		
		
		System.out.println("계산하기를 원하는 도형을 선택해주세요 1.원형 2.삼각형 3.직사각형 ");
		String a=sc.nextLine();
		switch(a) {
		case "1":
			System.out.println("반지름을 입력해주세요");
		double won=Double.parseDouble(sc.nextLine());
			System.out.println(area(won));
			break;
		case "2":
			System.out.println("높이와 밑변의 길이를 입력해주세요");
			int sam=Integer.parseInt(sc.nextLine());
			int gak=Integer.parseInt(sc.nextLine());
				System.out.println(area(sam,gak));
			break;
		
		case "3":
			System.out.println("가로와 세로의 길이를 입력해주세요");
			double sa=Double.parseDouble(sc.nextLine());
			gak=Integer.parseInt(sc.nextLine());
				System.out.println(area(sa,gak));
			break;
		}
		
		
		
		
		
	}
}
