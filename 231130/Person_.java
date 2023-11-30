package day231130;

import java.io.Serializable;

public class Person_ implements Serializable{ // 시리얼 코드가 필요하다.
	
	private static final long SerialVersionUID = 1L;
	private String myName;
	private int myAge;
	
	public Person_(String myName, int myAge) {
		this.setMyNameMyAge(myName);
		
	}
	public void setMyNameMyAge(String myName) {
		this.myAge = myAge;
		this.myName = myName;
	}
	

	
}
