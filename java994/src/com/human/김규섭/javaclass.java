package com.human.김규섭;

public class javaclass {
	public static void a() {
		System.out.println("a함수 시작");
		b();
		System.out.println("a함수 종료");
	}

	public static void b() {
		System.out.println("b함수 시작");
		System.out.println("b함수 종료");
	}
	public static void c() {
		System.out.println("c함수 시작");
		System.out.println("c함수 종료");
	}
	public static void d() {
		System.out.println("d함수 시작");
		System.out.println("d함수 종료");
	}
	public static void main(String[] args) {
		a();
		b();
		c();
		d();
	}

}
