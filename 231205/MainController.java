package game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainController {
	
	MainView mainView;
	
	public MainController() {
		mainView = new MainView();
		mainView.btn_game.addActionListener(this); // 게임 시작 이벤트 탐지
		mainView.btn_rank.addActionListener(this); // 랭크 시작 이벤트 탐지
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == mainView.btn_game) {
			new GameController();
			mainView.setVisible(false);
		}else if (e.getSource() == mainView.btn_rank) {
			mainView.setVisible(false);
		}

	}

}
