package com.javalec.base;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// 아래의 그림과 같이 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라
		// 단 고객명은 1,2,3,4,5이다. 
		
		Scanner scanner = new Scanner(System.in);
		String [] program = {"입급" , "출금" , "현황" , "종료"}; // 프로그램 이름
		int proNum = 0; // 프로그램 번호
		int custNum = 0; // 고객번호
		
		for(int i=0; i<program.length; i++) { 
			System.out.println((i+1) + "." + program[i]);
		}
		
		System.out.print("번호를 선택하세요! : ");
		proNum = scanner.nextInt();
		
		System.out.print("고객번호 : ");
		custNum = scanner.nextInt();
		
		
		
		
		
		
		
		
		

	}

}
