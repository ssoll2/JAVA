package day_231121;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Muticatch {

	public static void main(String[] args) {
		// 두가지 다른 catch를 만들어 보자.
		// 정수형 배열을 만든다. cards = {4,5,1,2,7,8}
		
		Scanner scan = new Scanner(System.in);
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("몇번째 카드를 뽑으시겠습니까?>>");
			
			int CardIndex = scan.nextInt();
			System.out.println("좋은 카드 번호는: " +cards[CardIndex]);
			
		}catch(InputMismatchException e) {
			// InputMismatchException : 입력이 잘못된 경우(Scanner 에러)에 에러가 나는 예외 처리
			System.out.println("잘못 입력하셨습니다. 스캐너를 입력할때는 숫자만 가능합니다.");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			// 배열의 공간이 없는 데 있다고 합니다.
			System.out.println("해당 번호의 카드는 없습니다.");
		}
		
		
		System.out.println("프로그램 종료");
		scan.close();
		
	}

}
