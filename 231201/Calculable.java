package day231201;

public interface Calculable { // 인터페이스 : 호출할 수 있는 껍데기
	// 람다식 익명 객체
	double calculate(int x, int y);


}
interface workable {
	void work();
}

class Person3{
	public void action(workable workable) {
		workable.work();
	}
}

class Person4 {
	public void action(Calculable calculable) {
		double result = calculable.calculate(10, 4);
		
		System.out.println(result);
	}
}

class Computer2{
	// 클래스 : 인스턴스/클래스 메소드를 사용하는 방법으로 만든다.
	
	// 인스턴스 메소드
	public double instanceMethod(double x, double y) {
		return x+y;
	}
	
	// 클래스 메소드
	public static double staticMethod(double x, double y) {
		return x+y;
	}
}








