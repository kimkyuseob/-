package com.human.��Լ�;


public class javaclass5 {
	/* �̰� overload
	 * 
	 */
		public static int sum(int a, int b) {
	 	System.out.println("int + int");
	 	return a+b;
	  	}
	  public static int sum(int a, int b, int c) {
	 	System.out.println("int + int + int");
	 	return a+b+c;
	 	}
	  public static int sum(int a, double b) {
	 	System.out.println("int + double");
	 	return (int)(a+b);
	 	}
	
	public static void main(String[] args) {
		//�Լ� 
		//overload = �Ű������� �ٸ��� ���� �̸��� �Լ��� ������ִ�, ���ϰ����� ���谡 ���� 
		//override = ��Ӱ� ���õ� �޼ҵ� �� ���� 
		//overloading =
		//overriding =
		//�Ű������� �ڵ�����ȯ�� �Ǿ� ����.
		
		int a=sum(10,20);
		System.out.println(a);
		
		double b=10.0;
		System.out.println(sum(a,b));
	}

	
	
}
