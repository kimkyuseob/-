package com.human.김규섭;

import java.util.*;


public class 배열 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Random rd = new Random();
//		int arr[] = new int[7];
//		for (int i = 0; i < 7; i++) {
//			arr[i] = rd.nextInt(45);
//
//		}
//
////		int max=Integer.MIN_VALUE;
////		int min=Integer.MAX_VALUE;
////		int max=-1;
////		int min=100;
//		int max = arr[0];
//		int min = arr[0];
//
//		for (int i = 1; i < 7; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			} else if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<7;i++) {
//			arr[i]=arr[i]*3;
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(max);
//		System.out.println(min);
//		
		
//		int arr[]=new int [9];
//		for(int i=0;i<9;i++) {
//			arr[i]=i%3+1;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		char arr[]= {'a','b','c','\0','\0','\0'};
//		
//		for(int i=2;i>=0;i--) {
//			arr[5-i]=arr[i];
//		}
//		System.out.println(Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("숫자를 입력해주세요");
		int cut=Integer.parseInt(sc.nextLine());
		for(int i=cut;i<10;i++) {
			arr[i-cut]=arr[i];
//			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println("숫자를 입력해주세요");
//			int cut=Integer.parseInt(sc.nextLine());
//			arr[i]=arr[i+cut];
//			if(arr[i]>10) {
//				arr[i]=0;
//			}
//		}System.out.println(Arrays.toString(arr));
		
//	369게임 해답지 출력 
//		int cut=0;
//		int input=0;
//		int sum=0;
//		for(int i=1;i<1000;i++) {
//			
//			input=(i%1000)/100;
//			cut=(i%100)/10;
			
//			if(i==3||i==6||i==9) {
//				System.out.println("짝");
//				continue;
//			}else if (i%30==0||i%60==0||i%90==0) {
//				System.out.println("짝");
//				continue;
//			}else if (i%300==0||i%600==0||i%900==0) {
//				System.out.println("짝");
//				continue;
//			}System.out.println(i);
//			
////			System.out.println(input);
////			System.out.println(cut);
//		}
		/*
        * 3,6,9의 숫자일 때 박수를 치는 게임
        * 100 이상의 값일 경우에도 박수를 쳐보자
        *  
        * */
       
       //실행 횟수
//       int count = 1000;
//
//       //chkNum 실행 값의 시작
//       for(int chkNum = 1 ;chkNum <= count;chkNum++) {
//           
//           //문자열로 형변환
//           String strCnt = String.valueOf(chkNum);
//           System.out.print(strCnt);
//           //형변환된 값의 길이 만큼 반복
//           for(int j=0;j <strCnt.length();j++) {
//               
//               /*    
//                * 형변환된 문자열의 index 값을 찾는다. 333 의 index 범위 0~2
//                * 예를 들어 strCnt = 223 값이 되었을때
//                * 123.charAt(0) = 2
//                * 123.charAt(1) = 2
//                * 123.charAt(2) = 3
//                * 박수는 1번 이루어 진다.
//               */
//               char chk = strCnt.charAt(j);
//               if(chk == '3' || chk == '6' || chk == '9') {
//                   System.out.print("짝");
//               }
//           }
//           //줄바꿈
//           System.out.println();
//		
//		
//		
//		
//		
//		
//		
       
	}

}
