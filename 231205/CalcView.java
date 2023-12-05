package day1205;

import javax.swing.*;

public class CalcView extends JFrame {
	
	JTextField tr_num1 = new JTextField();
	JTextField tr_num2 = new JTextField();
	JButton btn_plus = new JButton("더하기");
	JLabel la_result = new JLabel("결과 출력");
	
	CalcView() { // SwingDemo 생성자를 통해 셋팅
		
		//창크기
		setSize(300,200);
		setLayout(null);
		
		// 프레임을 닫았을 때 프로세스 제거
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tr_num1.setBounds(50, 50, 40, 40);
		tr_num2.setBounds(100,50,50,40);
		btn_plus.setBounds(150, 50, 80, 40);
		la_result.setBounds(50, 100, 200, 40);
		
		add(tr_num1);
		add(tr_num2);
		add(btn_plus);
		add(la_result);
		
		// 화면 띄우기
		setVisible(true);
	
		
	}
// controller -> view 보여줄꺼임
//	public static void main(String[] args) {
//		new calcView();
//
//	}

}
