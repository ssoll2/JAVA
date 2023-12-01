package day231201;

public class BankThreadExample {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		Thread th1 = new Thread(new AddThread("1번",b));
		Thread th2 = new Thread(new AddThread("2번",b));
		th1.start();
		th2.start();

	}

}
