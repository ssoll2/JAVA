package day_231114;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("--태진미디어 객체--");
		// 자식 클래스 객체 생성
		TJmic tj = new TJmic();
		tj.connect();
		tj.sing();
		tj.music();
		System.out.println("--태진미디어 객체를 BlutooMic로 타입변환--");
		BlutooMic bm = tj; // BlutooMic로 형타입변환
		bm.connect();
		bm.sing();
		bm.music();
		System.out.println("--태진미디어 객체를 Microphone로 타입변환--");
		BlutooMic bm = tj; // Microphone로 형타입변환
//		bm.connect();
		bm.sing();
//		bm.music();
		System.out.println("--태진미디어 객체를 SSpeaker로 타입변환--");
		BlutooMic bm = tj; // Microphone로 형타입변환
//		bm.connect();
//		bm.sing();
		bm.music();
	}
}
//마이크폰
interface Microphone{
	abstract void sing();
}
// 스피커
interface SSpeaker{
	abstract void music();
}
//블루투스 마이크
interface BlutooMic extends Microphone, SSpeaker { // 다중 인터페이스
	abstract void connect(); // 연결
//	public void sing() {
//		System.out.println("마이크에 대고 노래를 부릅니다.");
//	}
//	public void music() {
//		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
//	}	
}
class TJmic implements BlutooMic { // 인터페이스 상속
	public void sing() {
		System.out.println("마이크에 대고 노래를 부른다.");
		
	}
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나온다.");
		
	}
	public void connect() {
		System.out.println("블루투스 장치가 연결되었습니다.");
		
	}
}
