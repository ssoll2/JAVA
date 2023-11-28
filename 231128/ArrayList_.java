package day_1128;

import java.util.*;

public class ArrayList_ {

	public static void main(String[] args) {
		//-ArrayList
		// add : 추가 set : 변경 remove : 삭제
		
		// 리스트 선언
		List<String> list = new ArrayList<>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		
		System.out.println("리스트 내용1: "+list);
		// 리스트 내용1: [딸기, 바나나, 망고]
		
		// 추가 : index : 2번째 공간에 수박을 추가
		// 리스트 내용2: [딸기, 바나나, 수박, 망고]
		list.add(2, "수박");
		System.out.println("리스트 내용2: "+list);
		
		//ArrayList2 : set
		List<String> list2 = new ArrayList<>();
		list2.add("수박");
		list2.add("바나나");
		list2.add("망고");
		
		System.out.println("리스트 내용1: "+list2);
		// 리스트 내용2: [딸기, 복숭아, 망고]
		
		list2.set(1, "복숭아");
		list2.set(2, "애플망고");
		System.out.println("리스트 내용2: "+list2);
		
		
		
		

	}

}
