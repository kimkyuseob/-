package com.human.김규섭;
import java.util.*;
public class javaclass10 {
	public static int gugudan(int a) {
		for(int i=1;i<10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단을 외울 단수를 입력하세요 ");
		int a=Integer.parseInt(sc.nextLine());
		gugudan(a);
		
	}
}
