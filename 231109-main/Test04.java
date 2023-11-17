package day_231109;
public class Test04 {

	public static void main(String[] args) {
		//추상클래스: abstract
		// 레시피 추상클래스
		//Receipt	cp = new Receipt("백종원"); // 추상클래스는 미완성이라서 객체허용x
		// 파스타 레시피(자손)
		PastaReceipt pr = new PastaReceipt("백종원"); // 추상클래스를 의존하는 자식클래스 객체 생성
		pr.info(); // 자식 객채를 통해 추상클래스의 인스턴스 메서드도 호출할 수 있다.
		pr.makeSource();// 자식객체의 인스턴스 메서드도 호출한다.
		pr.cookingPlay(); // 자식객체에서 추상메서드도 호출한다.(인스턴스 메서드랑 다르게 추상메서드는 강제로 오버라이딩한다.=구현부를 작성)
	}	
}
class PastaReceipt extends Receipt{

	PastaReceipt(String chef) {
		super(chef);
	}
	void makeSource() {
		System.out.println("파스타 소스를 직접 만든다.");
	}
	@Override
	void cookingPlay() { // 추상메서드
		System.out.println("파스타 요리를 진행합니다.");	
	}
}
abstract class Receipt{ // 추상클래스 선언
	String chef; // 셰프를 인스턴스변수(멤버필드)
	// 기본생성자
	Receipt(String chef) {
		this.chef = chef;
	}
	abstract void cookingPlay(); // 추상메서드
	void info() { // 인스턴스 메서드
		System.out.println("이 레시피는 " + chef +"셰프님의 레시피입니다.");
		
	}
	
}