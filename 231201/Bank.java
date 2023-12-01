package day231201;

public class Bank { // 은행 클래스
	private int money;
	public int getMoney() { // 돈을 확인 
		return money;
	}
	
	public void addMoney(int money) { // 돈을 입금
		this.money += money;
	}

}
