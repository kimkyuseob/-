package com.human.��Լ�;
import java.util.*;
public class javaclass9 {
	public static int sig(int a) {
		if(a%2==0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է�");
		int a=Integer.parseInt(sc.nextLine());
		sig(a);
		
		
	}
}
