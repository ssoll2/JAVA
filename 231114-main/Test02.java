package day_231114; // 연습문제 실행결과: 빨간 스피커가 켜졌습니다. 파란 스피커가 켜졌습니다.
public class Test02 {

	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn(); // 빨간 스피커가 켜졌습니다.
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn(); // 파란 스피커가 켜졌습니다.
	}
}
class Speaker{
	String getName() {
		return "스피커";
	}
}
class RedSpeaker extends Speaker{
	String getName() {
		return "빨강";
	}	
}
class BlueSpeaker extends Speaker{
	String getName() {
		return "파랑";
	}
}
class Person{ //사람클래스
	Speaker speaker; //객체 변수
	Person(Speaker speaker) { // // 기본 생성자 Speaker가 red, blue상속받음
		this.speaker = speaker; // 객체를 담고 있음
	}
	void turnOn() { // 메서드: 색깔(클래스: 매개변수 다형성)스피커가 켜졌습니다.)
		System.out.println(speaker.getName()+"이 켜졌습니다.");
	}
	
}
