package com.human.��Լ�;
import java.util.*;

public class javaClass01 {

	public static void main(String[] args) {
		int a;
		a=1;
		Cat cat1;
		cat1=new Cat();
		cat1.name="����� 1";
		cat1.age=13;
		
		Cat cat2;
		cat2=new Cat();
		cat2.name="����� 2";
		cat2.age=12;
		
		Cat cat3=new Cat();
		cat3.name="����� 3";
		cat3.age=11;
		
		
		System.out.println(cat2.name);
		
		Cat cArr[]=new Cat[3];
		cArr[0]=new Cat();
		cArr[0].name="��1";
		cArr[0].age=10;
		cArr[1]=new Cat();
		cArr[1].name="��1";
		cArr[1].age=11;
		cArr[2]=new Cat();
		cArr[2].name="��1";
		cArr[2].age=12;
		
		
		
		for(int i=0;i<3;i++) {
			
			System.out.println(cArr[i].name+":"+cArr[i].age);
			
		}
		
		int sum=0;
		for(int i=0;i<cArr.length;i++) {
			sum=sum+cArr[i].age;
			cArr[i].age=1;
		}
		System.out.println(sum);
		
		sum=0;
		for(Cat cat:cArr) {
			sum=sum+cat.age;
			cat.age=2;
		}
		System.out.println(sum);
		
		for(int i=0;i<3;i++) {
			
			System.out.println(cArr[i].name+":"+cArr[i].age);
			
		}
		
		//�迭�� 3�� ��� 3���� �ְ� ���� ���� ���Ͻÿ� 
		//������� ������ ������ ���Ͻÿ� 
		
		// �迭 : �ѹ��� �������� �����͸� ���� �ϴ°�
		//int a1,a2,a3; == int a[]=new int[3];
		
//		int a[]=new int[3];
//		a[0]=0;//index�� 0���� �����Ѵ�.
//		a[1]=1;
//		a[2]=2;
//		
//		int index=1;
//		a[index]=3;
//		
////		System.out.println(Arrays.toString(a));
//		for(int i=0;i<3;i++) {
//			a[i]=i;
//		}
////		System.out.println(Arrays.toString(a));
//		a[0]=a[1]+a[2];
//		for(int i=0;i<a.length;i++) {
////			System.out.println(a[i]);
//		}
//		//��ü : �����ִ� ������ �鳢�� ������ 
//		
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//			
//		}
//		System.out.println(sum);
//		sum=0;
//		for(int i:a) {//�б⸸ ���� 
//			sum=sum+i;
//			
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
