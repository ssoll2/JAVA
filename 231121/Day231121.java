package day_231121;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day231121 {
	// static method 
	public static void CheckYourSelf(Scanner scan) throws InputMismatchException { // 숫자만 가능
		System.out.println("1.사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.println("선택>>");
		int check = scan.nextInt();
		if (check == 1) {
			System.out.println("당신은 ENFP입니다.");
			
		} else {
			System.out.println("당신은 ISFP");
			
		}
				
	}

	public static void main(String[] args) {
		
		
		
		// 예외던지기(문제1)
//		try {
//		Exception e = new Exception("고의발생");
//		throw e;
//		} catch(Exception e) {
//			System.out.println("에러 메시지: " +e.getMessage());
//			e.printStackTrace();
//			
//		}
//		System.out.println("프로그램이 정상 종료되었습니다.");
		
		// 호출한 곳에서 예외처리(문제2)
		// scanner 로 어떤 사람인지 번호를 선택하게 한다.
		
		Scanner scan = new Scanner(System.in);
		
		// 성격유형 검사를 시작합니다라는 멘트를 주고 검사를 시작한다.
		System.out.println("성격유형검사를 시작합니다.");
		
		
		try {
			// static 메서드를 활용해서 지문에 대한 문항을 검사하는 메서드를 만든다.
			Day231121.CheckYourSelf(scan); // scan에 오류를 static 메서드에 던질 수 있게 매개변수를 만들어 준다.
			
		}catch(InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		}finally {
			if (scan!=null) {
				scan.close();
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		

	}

}
