package project1;

public class pro1 {

	public static void main(String[] args) {
		
		//사망연산자
			System.out.println(10 == 10 ? 1:0);//10과10이 같으면 1이고 다르면 0이다.
			
			int x1 = 10;
			int x2 = 10;
			int s0 = 0;
			if(x1 == x2) {
				s0 = 1;
			}else {
				s0 = 0;
			}
			System.out.println(s0);
			s0 = (x1==x2?1:0);

			System.out.println(s0);
			
			//삼항연산자 +-, ++, -- 1항  + - * / %  2항  ?: 3항
	}

}
