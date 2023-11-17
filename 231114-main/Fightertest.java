package day_231114;
public class Fightertest {
	public static void main(String[] args) {
		// 인터페이스 다형성이 가능하다.
		Fighter f = new Fighter(); // 의존하는 클래스를 객체로 생성
		f.move(100,200);
		Unit2 f2 = new Fighter(); // f2.attack(); 형변환이 다르다.
		Fightable f3 = new Fighter(); //f3.attack(new Fighter);
		// f3.x; 자식 클래스로 생성했지만 인터페이스 형변환만 사용하니까
		Fightable nf = f.getFightable(); // 자식클래스 메서드 부모 인터페이스 형변환리턴 출력
	}
}
abstract class Unit2{ // 클래스 unit2: 추상클래스 abstract 메서드
	int x, y;
	abstract void move(int x, int y); // 추상메서드
	void stop() { System.out.println("멈춥니다.");}
}
interface Fightable{ // 클래스 interface : Fightable
	public void move(int x, int y); // move 추상메서드
	public void attack(Fightable f);// attack 추상메서드, 자기자신을 호출
}
class Fighter extends Unit2 implements Fightable{ // 클래스 Fighter : extends Unit2(추상클래스) implements Fightable
	public void move(int x, int y) { System.out.println("["+x+", "+y+"]로 이동");}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
    // 인터페이스 리턴: 형변환으로 가능하다. // Fightable f = new Fighter();
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
	
}