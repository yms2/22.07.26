package project1;

public class pro11 {

	public static void main(String[] args) {
		int a =500;
		int b = 50;
		System.out.println((double)(a/b));
		
		int c = a/b;
		
		//c의 값이 5의 배수인지 아닌지 두번 비교하도록 하시오
		
		if(c%5 ==0) {
			System.out.println("5배 입니다.");
			//나머지가 0이면 5의 배수이고
		}if(c%5 != 0 ) {
			System.out.println("5의 배수가 아닙니다.");
			//나머지가 0이 아니면  5의 배수가 아니다.
		}

	}

}
