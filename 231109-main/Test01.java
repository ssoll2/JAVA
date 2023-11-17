package day_231109;
public class Test01 {

	public static void main(String[] args) {	
		// 클래스의 강제타입 변환
		//  자식클래스 < 부모클래스 : 자동형변환 -> 부모를 맞추다보니 손실난다.
		// 강제타입 : 내 타입 (자식형)
		FireEngine f = new FireEngine(); // 자식 객체
		Car c = new Car();
		Car c2 = f;
		Car c_ = null; // 부모형타입 객체는 생성하지 않았다.
		
		c_ = f; // 부모의 형타입이고, 자식의 객체를 생성한 경우
		f = (FireEngine)c_; // 자식의 객체로 형변환
		f.drive();
		f.water();							 
	}
}
class Car{ // 부모클래스
	String color;
	int door;
	void drive() {
		System.out.println("드라이브중입니다.");
	}
}
//자식 클래스 : 소방차
class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
	
}
//자식 클래스 : 앰블런스
class Ambulance extends Car {
	
}