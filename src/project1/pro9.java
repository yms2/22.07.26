package project1;

import java.util.Scanner;

public class pro9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int number = in.nextInt();
		
		if(number %3 ==0) {
			System.out.println("3의 배수입니다.");
			if(number%2 ==0);
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다");
		}
//	}else {
//		System.out.println("3의배수가 아닙니다.");
//		if(number %2==0) {
//			System.out.println("짝수 입니다.");
//		}else {
//			System.out.println("홀수 입니다.");
//		}
	}

}
