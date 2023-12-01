package day231201;

public class Person5 {

	
	// 인스턴스 메서드 --> Comparable.compare()추상메서드를 묶어서 구현방법을 만든다.
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";
		
		int result = comparable.compare(a, b); // 인터페이스를 호출한다.
		
		if (result < 0) {
			System.out.println(a+"은"+b+"보다 앞에 옵니다.");
		}else if (result == 0) {
			System.out.println(a+"와"+b+"는 같습니다.");
		
		} else {
			System.out.println(a+"이 "+b+"보다 뒤에 옵니다.");
			
		}
	}
	

}
