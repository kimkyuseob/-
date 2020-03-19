package com.human.±è±Ô¼·;
import java.util.*;
public class javaclass9 {
	public static int sig(int a) {
		if(a%2==0) {
			System.out.println("Â¦¼öÀÔ´Ï´Ù");
		}else {
			System.out.println("È¦¼öÀÔ´Ï´Ù");
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÀÔ·Â");
		int a=Integer.parseInt(sc.nextLine());
		sig(a);
		
		
	}
}
