package com.human.김규섭;

public class 메소드테스트 {
	public static void triangle1() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void triangle2() {
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void triangle3() {
		for(int i=1;i<5;i++) {
			for(int j=5;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	public static void nameCard() {
		String name="홍길동";
		String phoneNumber1="010";
		int phoneNumber2=1111;
		int phoneNumber3=2222;
		String home="천안시 서북구 두정동";
		for(int i=0;i<18;i++) {
			System.out.print("*");
		}
			System.out.println("");  
			System.out.println("*"+name+"                       *");
			System.out.println("*"+phoneNumber1+"-"+phoneNumber2+"-"+phoneNumber3+"   *");
			System.out.println("*"+home+"   *");
		for(int i=0;i<18;i++) {
			System.out.print("*");
			}System.out.println("");
		}
	public static int beyeol(int a, int b, int c,int d,int e) {
		int sum=0;
		int array[]=new int[5];
		for(int i=0;i<5;i++) {
			if(array[i]==array[0]) {
				array[i]=a;
			}else if(array[i]==array[1]) {
				array[i]=b;
			}else if(array[i]==array[2]) {
				array[i]=c;
			}else if(array[i]==array[3]) {
				array[i]=d;
			}else if(array[i]==array[4]) {
				array[i]=e;
			}
		}
		for(int j=0;j<5;j++) {
			sum=sum+array[j];
			}
		
		return sum;
	}
	public static void calender() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1;i<=31;i++) {
			System.out.print(i+"\t");
			if(i%7==0) {
				System.out.println();
			}
		}
	}
	public static void cal() {
		calender();
	}
	
	public static void main(String[] args) {
		triangle1();
		triangle2();
		triangle3();
		nameCard();
		System.out.println(beyeol(1,3,6,4,7));
		cal();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
