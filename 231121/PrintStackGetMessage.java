package day_231121;

public class PrintStackGetMessage {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
		System.out.println(3);
		System.out.println(0/0); // 예외발생!
		// ArithmeticException 인스턴스 : 예외 처리 클래스 호출되면서 인스턴스 실행
		// printStackTrace(); // ArithmeticException > RuntimeException
		}catch(ArithmeticException e) {
			
			// 메서드의 정보와 메세지가 출력
			e.printStackTrace(); // 예외처리 클래스를 생성해서 해당 메서드를 호출하는 것
			System.out.println("예외 메세지"+e.getMessage()); // 저장된 메시지를 얻어와 출력
		}
		System.out.println(6);

	}

}
