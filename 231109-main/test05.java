package day_231109;
public class test05 {

	public static void main(String[] args) {
		// 추상클래스 문제2; 플레이어를 활용한 추상클래스
		AudioPlayer p = new AudioPlayer();
		p.play(10); // 재생한다.
		p.stop(); // 멈춘다.
	}
}
// 추상클래스: player
abstract class Player {
	// 추상메서드 : 플레이 버튼
	abstract void play(int pos); // pos: track
	// 추상메서드 : 정지 버튼
	abstract void stop();
}
// 플레이: play() / 스탑: stop()
// 자식클래스: AudioPlayer
class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println(pos+ "번 위치부터 실행합니다.");
	}

	@Override
	void stop() {
		System.out.println("재생을 멈춥니다.");	
	}
	
}
// 오버라이딩해서 구체적인 오디오 플레이를 설계