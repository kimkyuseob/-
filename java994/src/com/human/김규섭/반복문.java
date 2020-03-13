package com.human.김규섭;
import java.util.*;
public class 반복문 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		
////		
//		int sum=0;
//		for(int i=0;i<10;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);
//		
//		
		//조건식에 아무것도 들어있지않아서 정상적인 작동이 되지않음
//		int i=0;
//		for(;;) {
//			if(i>10) {
//				break;
//			}else if (i<6) {
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
//		
//		8페이지 1문 
//		2분은 무한반복된다 
		
//		
		
		
//		System.out.println("하나의 수를 입력");
//		i=Integer.parseInt(sc.nextLine());
//		int b=0;
//		for(int a=1;b<i;a++) {
//			System.out.println("~"+a+":"+b);
//		}
//		
//		9페이지 2문 작동안됨 
//		i=0;
//		
//		while(i=2) {
//			
//		}
//		
//		if(i=2) {
//			
//		}
		
//		int a=Integer.parseInt(sc.nextLine());
//		i=0;
//		while(i<10) {
//			System.out.println("종료 2번");
//			int a=Integer.parseInt(sc.nextLine());
//			if(a==2) {
//				i+=10;
//			}
//		}
//		
//		String a="";
//		i=0;
//		while(i<10) {
//			a=sc.nextLine();
//			switch(a) {
//			case "종료":
//				//i+=10;
//				break;
//			default :
//				continue;
//			}
//			break;
//		}
//
//		for(;;) {
//			a=sc.nextLine();
//			switch(a){
//			case "종료":
//				//i+=10;
//				break;
//			default :
//				continue;
//			}
//			break;
//		}
//		
		
//		int b=0;
//		int a1=0;
//		int a2=0;
//		int a3=0;
//		int a4=0;
//		int a5=0;
//		int A=0;
//		for(i=1;i<=5;i++) {
//			System.out.println(i+"번째 숫자를 입력해주세요");
//			a1=Integer.parseInt(sc.nextLine());
//			if(i==1) {
//				b=Math.abs(a1);
//			}else if(i==2) {
//				a2=Math.abs(a1);
//			}else if(i==3) {
//				a3=Math.abs(a1);
//			}else if(i==4) {
//				a4=Math.abs(a1);
//			}else if(i==5) {
//				a5=Math.abs(a1);
//			}
//			A=b+a2+a3+a4+a5;
//		}
//		System.out.println("합은"+A);
	
//		int a=0;
//		int b=0;
//		int c=2;
//		int d=3;
//		int e=0;
//		int A=0;
//		System.out.println("입력");
//		int i=Integer.parseInt(sc.nextLine());
//		a=i;
//		for(int a1=0;a1<10;) {
//			a=a-c;
//			b=b+d;
//			A=a-b;
//			e++;
//			System.out.println(a);
//			System.out.println(b);
//			
//			if(A>0) {
//				continue;
//			}else if(A<0){
//				a1=10;
//			}
//			System.out.println(e);
//		}
		
//			String A="";
//			
//			int B=0;
//			int C=0;
//			int acount=0;
//			
//		while(!A.equals("3")) {
//			
//			System.out.println("업무를 선택해주세요 ");
//			System.out.println("1:입력, 2:연산, 3:종료");
//			A=sc.nextLine();
//			
//		switch(A) {
//			case "1":
//				
//				System.out.println("수1.");
//				B=Integer.parseInt(sc.nextLine());
//				System.out.println("수2");
//				C=Integer.parseInt(sc.nextLine());
//				
//				break;
//			case "2":
//				System.out.println("기호 ");
//				A=sc.nextLine();
//		switch(A) {
//			case "+":
//				System.out.println(B+C);
//				break;
//			case "-":
//				System.out.println(B-C);
//				break;
//			case "/":
//				System.out.println(B/C);
//				break;
//			case "*":
//				System.out.println(B*C);
//				break;
//			}
//				break;
//			case "3":
//				System.out.println("종료 ");
//								
//				break;
//				}
//			}
//		
	/*
	 * 1
	 * 1
	 * 1
	 */
		
//		
//		int i=0;
//		int a=0;
//		System.out.println("수 입력");
//		int A=Integer.parseInt(sc.nextLine());
//		int B=0;
//		while(i<10) {
//			System.out.println("수 입력");
//			B=Integer.parseInt(sc.nextLine());
//		if(B<A) {
//			System.out.println("큼");
//			a++;
//		}else if(B>A) {
//			System.out.println("작음");
//			a++;
//		}else if(B==A) {
//			System.out.println("정답 "+a);
//			i=10;
//		}
//		}
//		
//		int sum=0;
//		for(int i=1;i<100;i++) {
//			sum=sum+i;
//		}
//		
		
		/*
		 * 10번
		 * 10번
		 * 11번
		 */
//		int a=0;
//		int sum=0;
//		for(int i=0;i<=10;i++) {
//			sum=i;
//			sum%2==1;
//			System.out.println(a);
//		}
//		
//		
//		int A=0;;
//		
//		int B=0;
//		int C=0;
//		int acount=0;
//		
//	while(C<10) {
//		
//		System.out.println("점수 입력 , 0은 종료 ");
//		A=Integer.parseInt(sc.nextLine());
//		if(A>0) {
//			B=B+A;
//		}else if(A==0) {
//			System.out.println(B);
//			C=C+10;
//		}
//	
//		}
//		
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum=sum+i;
//		System.out.println(sum);
//		}
//		
//		int sum=0;
//		for(int i=60;i<100;i--) {
//			sum=i;
//			System.out.println(sum);
//			if(i==0) {
//				System.out.println("발사");
//				i=101;
//			}
//		}
//		
//		System.out.println("입력");
//		int a=Integer.parseInt(sc.nextLine());
//		for(int i=0;i<a;i++) {
//			System.out.println("hi");
//		}
//		
		
//		int a=99;
//		int b=0;
//		for(int i=0;b<a;i++) {
//			b=i*3;
//			System.out.println(b);
//		}
//		
		
//		
//		
//		for(int i=0;i<100;i++) {
//			if(i%3==0 && i%5==0) {
//				System.out.println(i);
//			}
//			
//			
//		}
//		
//		System.out.println("1");
//		int sum=0;
//		int i=Integer.parseInt(sc.nextLine());
//		int j=Integer.parseInt(sc.nextLine());
//		for(i=i;i<=j;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);
		
//		System.out.println("1");
//		int sum=0;
//		int i=Integer.parseInt(sc.nextLine());
//		int j=Integer.parseInt(sc.nextLine());
//		int a=0;
//		for(i=i;a<=j;a++) {
//			sum=i*a;
//			System.out.println(sum);
//		}
		
//		int a=7;
//		int i=9;
//		
//		for(i=9;i>0;i--) {
//			System.out.println(a+"*"+i+"="+(a*i));	
//		}
		
//		int a=Integer.parseInt(sc.nextLine());
//		int b=0;
//		for(b=1;b<=a;b++) {
//			if((a%b)==0) {
//				System.out.println(b);
//			}
//		}
		
		
//		int a=0;
//		int b=0;
//		int c=0;
//		System.out.println("1");
//		b=Integer.parseInt(sc.nextLine());
//		
//		for(int i=1;i<=1000;i++) {
//			if(i%b==0) {
//				a++;
//				c=c+i;
//			}
//		}
//		
//		System.out.println(a+","+c);
		
		
		
		
		
	}
}