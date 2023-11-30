package day231130;

import java.io.File;

public class File_class_ {

	public static void main(String[] args) {
		
		
		File f = new File("src/image/pikachu.jpg"); // 파일을 긁어온다.
		
		if(f.exists()) { // 파일이 존재하는지 확인
			System.out.println("length : "+f.length()); // 파일의 크기
			System.out.println("CanRead : "+f.canRead());// canRead : 일기가 가능한지
			System.out.println("getName : "+f.getName()); // 파일의 확장명과 이름을 볼 수 있다.
			System.out.println("getParent : "+f.getParent()); // 경로를 볼 수 있다.
			System.out.println("getPath : "+f.getPath()); // 전체 경로를 알 수 있다.
			
		}

	}

}
