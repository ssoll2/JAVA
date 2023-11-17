package day_231109;

public class Test03 {// p.300

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_ c1 = new SchoolBus();
		Bus b1 = new Bus();
		SchoolBus sb = new SchoolBus();
		sb = (SchoolBus)c1; // 자식이 부모로 데이터형 (자동) --> 강제(자식이 부모를 변환하고 자식형변환하면 가능)
		
		Car_ c2 = new OpenCar();
		OpenCar oc = new SportsCar();
		Car_ b3 = new OpenCar();  // 2차상속(할아버지)으로 형변환하면됨
		Car_ b4 =new SportsCar(); // 2차상속(할아버지)으로 형변환하면됨
		
	}

}

class Car_ {}
class Bus extends Car_{}
class SchoolBus extends Bus {}

class OpenCar extends Car_ {}
class SportsCar extends OpenCar {}

