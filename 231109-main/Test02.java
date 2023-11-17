package day_231109; //전자제품 판매점 고객관리 예제
public class Test02 {

	public static void main(String[] args) {
		//@매개변수(함수:클래스)-> 객체를 생성할 때
		buyer b = new buyer(); // 바이어 객체 생성
		// 제품의 객체를 생성해서 객체를 넘겨준다.
		Audio a = new Audio(100);
		Computer com = new Computer(200);
		Tv tv = new Tv(100);
		// 바이어가 컴퓨터를 산다.
		b.buy(com);
		// 바이어가 티비를 산다.
		b.buy(tv);
		// 바이어의 현재 남은 돈을 출력한다.
		System.out.println("현재 남은 돈은 "+b.money+"입니다."); // 객체지향에서 절차적인 구조를 볼 수 있는 예제
	}
}
//제품 클래스 정의(설계도)
//Product : 제품
class Product {
	int price; // 가격
	int bonusPoint;
	// 기본생성자
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}
//TV : 제품들1
class Tv extends Product{
	Tv(int price) {
		super(100);
	}
	public String toString() {
		return "tv";
	}
}
//Computer : 제품들2 ; 200
class Computer extends Product {
	Computer(int price) {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
//Audio : 제품들3 : 100
class Audio extends Product {
	Audio(int price) {
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}
// Nintendo : 제품들4 : 50
class Nintendo extends Product {
	Nintendo(int price) {
		super(50);
	}
	public String toString() {
		return "Nintendo";
	}
}
// 고객: buyer : 고객의 잔고를 계산 : money = 1000만원 - 매개변수다형성(제품)
// 고객의 잔고: 적을 경우(money<price: 잔액이 부족해서 판매할 수 없다.) 
//           많을 경우(제품 구매)
class buyer{ // 물건을 사는 클래스: 행위 매서드
	int money = 1000; // 고객의 잔고
	int bonusPoint = 0; // 보너스 포인트
	// 행위: 물건을 산다.
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족해서 구매할 수 없습니다.");
		}else {
			money -= p.price; // 고객의 잔고에서 제품의 가격을 뺀다.
			bonusPoint+= p.bonusPoint;
			System.out.println(p.toString()+ "을 구입하셨습니다.");
		}
//		p.price; // 제품의 가격: 고객이 사야할 제품의 가격
//		p.bonusPoint; // 고객의 보너스 점수
	}
	
}











