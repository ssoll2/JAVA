package game;

import java.awt.FlowLayout;

import javax.swing.*;

public class MainView extends JFrame{
	JButton btn_game = new JButton("게임 시작");
	JButton btn_rank = new JButton("랭킹 확인");
	
	public MainView() {
		setLayout(new FlowLayout());
		
		add(btn_game);
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class GameView {
	public static void main(String[] args) {
		new MainView();
	}
}
