package day_231117;

public class ArithmeticExceptionExample { // 산술 오류
	public static void main(String[] args) {
		// 산술연산자로 계산을 할 경우 산술이 잘못된 처리를 해서 에러가 발생된 경우
		int result = 0;
		
		try {
			result = 10/0;
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기를 할 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료");
			
		}
		
		
		
	}

}
