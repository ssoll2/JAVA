package day_231117;

public class Button {
	public static interface ClickListener{ // 중첩 인터페이스
		void onclick();
	}
	// 객체 변수를 만들어보자
	ClickListener clickListener;
	// 객체 주입: 등록(ok)/취소(Cancel)
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		
	}
	
	// 버튼 클릭하는 메서드
	public void click() {
		this.clickListener.onclick();
	
	}
	

}
