package project1;

import java.util.Scanner;

public class pro16 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char grade;
		System.out.print("점수를 입력하세요(0~100):");
		int score = in.nextInt();
		
		switch(score/10) {
		case 10: //score= 100
		case 9:	//score = 99~90
			grade = 'A';
			break;
		case 8: //score 89~80
			grade = 'B';
			break;
		case 7: //score 79~ 70
			grade = 'C';
			break;
		case 6: // score 69~60
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학점은 "+grade+"입니다.");
	}

}
