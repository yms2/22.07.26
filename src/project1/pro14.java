package project1;

	import java.util.Scanner;

public class pro14 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		try (Scanner in = new Scanner(System.in)) {
			int number = in.nextInt();
			
			//100~95면 A++
			//94~90은 A
			//89~85 B++
			//84~80 B
			//나머지 C
			
			if(number >=95 && number <=100) {
				System.out.println("A++");
			}else if(number >=90 && number <=94) {
				System.out.println("A");
			}else if(number >=85 && number <=89) {
				System.out.println("B++");
			}else if(number >= 80 && number <=84) {
				System.out.println("B");
			}else {
				System.out.println("C");
			}
		}
		
		
	}

}
