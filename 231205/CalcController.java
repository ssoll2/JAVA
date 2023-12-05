package day1205;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class CalcController implements ActionListener { // 모든 페이지를 제어하고 연결한다.(/src/calc):mapping
	
	CalcView cv; // 객체를 변수로 받는다.(객체변수선언)
	
	// 생성자에 View 에 해당하는 클래스를 인스턴스화 시켜서 --> view 객체를 실행한다.
	CalcController() {
		cv = new CalcView();
		cv.btn_plus.addActionListener(this); // 버튼의 이벤트가 발생되었을 때 알려준다.
	}
	public static void main(String[] args) {
		new CalcController();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == cv.btn_plus) {
			int num1 = Integer.parseInt(cv.tr_num1.getText()); // 텍스트 1값을 반환한다.
			int num2 = Integer.parseInt(cv.tr_num2.getText()); // 텍스트 1값을 반환한다.
			
			CalcModel calc = new CalcModel();
			int result = calc.plus(num1, num2); // Controller -> 모델을 처리 -> 결과값을 return한다.
			cv.la_result.setText("결과는 "+result+" 입니다.");
		}
		
		
	}
}


