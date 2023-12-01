package day231201;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		// (a,b) ->a.compareIgnoreCase(b)
		Person5 person = new Person5();
		
		// 클래스 안에 인스턴스를 호출해서 인터페이스다형성을 받는다.
		// 람다식으로 구현
		person.ordering((a,b)-> {
			return a.compareToIgnoreCase(b);
		});
		
		// 리턴이 없는 람다식 : 실행문이 한개일경우 return
		person.ordering((a,b)->a.compareToIgnoreCase(b));
		
		// 인터페이스 매개변수 a를 데이터형 작성한다.
		person.ordering(String::compareToIgnoreCase);
		
		// 인터페이스 객체 선언시 람다식을 이용해 함수를 구현하는 방법
		CompareNumber compare = 
				(num01,num02) -> {return num01>num02?1:num01<num02?-1:0;};
				
		int num01 = 10;
		int num02 = 20;
		
		int result = compare.compareTo(num01, num02);
		if(result > 0) {
			System.out.println("num01이 num02보다 크다.");
		}else if (result < 0) {
			System.out.println("num01이 num02보다 작다.");
		}else {
			System.out.println("num01과 num02는 같습니다.");
		}

	}

}
