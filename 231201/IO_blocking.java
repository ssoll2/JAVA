package day231201;
import javax.swing.JOptionPane;

public class IO_blocking {

	public static void main(String[] args) {
		
		//String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); // 입력패널을 열게 한다.
		
//		for(int i=10; i>0;i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//				
//			}
//		}
		
	// 스레드1 선언
		ThreadEx1 th1 = new ThreadEx1();
		
	// 스레드2 선언
		ThreadEx2 th2 = new ThreadEx2();
		
//		th1.setPriority(1); // 최소우선순위
//		th2.setPriority(9); // 최대우선순위
//		
//		System.out.println("Priority of th1(-) : "+th1.getPriority());
//		System.out.println("Priority of th2(|) : "+th2.getPriority());
//		
		th1.start();
		th2.start();
		
		try {
			
			th1.sleep(2000); // main스레드 2초동안 슬립
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("<<메인스레드 종료>>");
		

	}

}

class ThreadEx1 extends Thread { // 스레드1
	public void run() {
		for (int i=0;i<300;i++) {
			System.out.print("-");
		}
		System.out.println("<<th1>> 종료");
	}
	
}
class ThreadEx2 extends Thread { // 스레드2
	public void run() {
		for (int i=0;i<300;i++) {
			System.out.print("|");
		}
		System.out.println("<<th2>> 종료");
	}
	
}










