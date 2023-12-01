package day231201;

public class thread_name {

	public static void main(String[] args) {
		String threadname = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : "+threadname);

	}

}
