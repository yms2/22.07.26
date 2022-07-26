package project1;

import java.util.Scanner;

public class pro10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		//if 10의 배수인지 아닌지 비교하여 10의 배수이면 10배수입니다.
		//10의 배수가 아니면 10의 배수가 아닙니다.
		
		if(number%10 == 0) {
			System.out.println("10의 배수입니다.");
		}if(number%10 != 0) {
			System.out.println("10의배수가 아닙니다");
		}
		
	}

}
