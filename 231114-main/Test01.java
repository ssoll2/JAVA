package day_231114;
// Buyer 클래스의 buy 메서드의 매개변수 타입?
// 출력:
// Video
// Audio
public class Test01 {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Video()); 
		buyer.buy(new Audio()); 
		

	}

}
class Buyer {
	void buy(Product p) { //매개변수의 타입은? p
		System.out.println(p); // p = 주소 각 객체의 주소 출력
	}


	
}
class Product{}
class Video extends Product{
	public String toString() {
		return "Video";
		
	}
}
class Audio extends Product{
	public String toString() {
		return "Audio";
	}
}
